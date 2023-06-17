

SELECT * FROM ReportPostView
SELECT POSTSHARE.UserID FROM dbo.POSTSHARE
UPDATE ReportPost
SET Status = 1
WHERE PostID = 'PID00000005';

DECLARE @check BIT;
SET @check = 0;

INSERT INTO dbo.ReportPost (IsPost, PostID, UserID, UserID2, Status)
VALUES (1, 'SID00000020', 'UID00000003', 
        CASE WHEN 1 = 1 THEN (SELECT UserID FROM Post WHERE POST.PostID='PID00001053') ELSE (SELECT UserID FROM PostShare WHERE dbo.POSTSHARE.ShareID='SID00000020') END, 
        1);

--------------------------------------------------
CREATE VIEW PostSummaryByMonth AS
SELECT
    MONTH(TimePost) AS Month,
    YEAR(TimePost) AS Year,
    (
        (SELECT COUNT(*) FROM POST WHERE MONTH(TimePost) = MONTH(p.TimePost) AND YEAR(TimePost) = YEAR(p.TimePost)) +
        (SELECT COUNT(*) FROM POSTSHARE WHERE MONTH(TimeShare) = MONTH(p.TimePost) AND YEAR(TimeShare) = YEAR(p.TimePost))
    ) AS TotalPosts
FROM
    POST p
GROUP BY
    MONTH(TimePost),
    YEAR(TimePost);

CREATE TABLE MonthlyUsage (
    MonthDate DATE PRIMARY KEY,
    UsageTime BIGINT
);

CREATE TABLE ReportPost (
	ID INT IDENTITY(1,1) NOT NULL,
	ReportID AS 'RPID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
    PostID VARCHAR(11),
    UserID VARCHAR(11),
	UserID2 VARCHAR(11),
    IsPost BIT DEFAULT 1,
	Status BIT DEFAULT 1,
    CONSTRAINT FK_ReportPost_User FOREIGN KEY (UserID) REFERENCES UserInfor(UserID),
	CONSTRAINT FK_ReportPost_User2 FOREIGN KEY (UserID2) REFERENCES UserInfor(UserID),
    CONSTRAINT UQ_Post_User UNIQUE (PostID, UserID)
);

CREATE VIEW ReportPostView AS
SELECT 
    RP.PostID,
    RP.IsPost,
	MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.ImagePost
        ELSE P2.ImagePost
    END) AS ImagePost,
    MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.Content
        ELSE PS.Content
    END) AS Content,
	COUNT(RP.UserID) AS UserCount,
    MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.TimePost
        ELSE PS.TimeShare
    END) AS TimePost,
	RP.UserID2 AS UserID,
	MAX(CAST(RP.Status AS INT)) AS Status
FROM 
    ReportPost RP
    LEFT JOIN POST P ON RP.PostID = P.PostID AND RP.IsPost = 1
    LEFT JOIN POSTSHARE PS ON RP.PostID = PS.ShareID AND RP.IsPost = 0
    LEFT JOIN POST P2 ON PS.PostID = P2.PostID
GROUP BY 
    RP.PostID,
    RP.IsPost,
	RP.UserID2;

CREATE TABLE ReportComment1686 (
	ID INT IDENTITY(1,1) NOT NULL,
	ReportID AS 'RPID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
    CommentID VARCHAR(11),
    UserID VARCHAR(11),
	UserID2 VARCHAR(11),
	IsPost BIT DEFAULT 1,
	Status BIT DEFAULT 1,
    CONSTRAINT FK_ReportComment_User FOREIGN KEY (UserID) REFERENCES UserInfor(UserID),
	CONSTRAINT FK_ReportComment_User2 FOREIGN KEY (UserID2) REFERENCES UserInfor(UserID),
    CONSTRAINT UQ_Comment_User UNIQUE (CommentID, UserID,IsPost)
);

CREATE VIEW ReportCommentView AS
SELECT 
    RP.CommentID,
    RP.IsPost,
	MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.ImageComment
        ELSE PS.ImageComment
    END) AS ImageComment,
    MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.Content
        ELSE PS.Content
    END) AS Content,
	COUNT(RP.UserID) AS UserCount,
    MAX(CASE 
        WHEN RP.IsPost = 1 THEN P.TimeComment
        ELSE PS.TimeComment
    END) AS TimeComment,
	RP.UserID2 AS UserID,
	MAX(CAST(RP.Status AS INT)) AS Status
FROM 
    dbo.ReportComment1686 RP
    LEFT JOIN dbo.COMMENT P ON RP.CommentID = P.CmtID AND RP.IsPost = 1
    LEFT JOIN dbo.COMMENTSHARE PS ON RP.CommentID = PS.CmtID AND RP.IsPost = 0
    LEFT JOIN COMMENT P2 ON PS.ShareID = P2.PostID
GROUP BY 
    RP.CommentID,
    RP.IsPost,
	RP.UserID2;

SELECT * FROM ReportCommentView

UPDATE dbo.ReportComment1686
SET ReportComment1686.Status = 0
WHERE ReportComment1686.CommentID='' AND ReportComment1686.IsPost=