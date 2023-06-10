﻿--create database trash1
CREATE TRIGGER trigger_friend
ON USERRELATION AFTER UPDATE 
AS
BEGIN
	IF (UPDATE(isFriend))
	BEGIN
		IF((SELECT isFriend FROM inserted) = 1)
		BEGIN
			UPDATE [dbo].[UserInfor]
			SET NumFriend = NumFriend + 1
			WHERE UserID IN (SELECT UserID1 FROM inserted);

			UPDATE [dbo].[UserInfor]
			SET NumFriend = NumFriend + 1
			WHERE UserID IN (SELECT UserID2 FROM inserted);
		END
		ELSE
		BEGIN
			UPDATE [dbo].[UserInfor]
			SET NumFriend = NumFriend - 1
			WHERE UserID IN (SELECT UserID1 FROM deleted);

			UPDATE [dbo].[UserInfor]
			SET NumFriend = NumFriend - 1
			WHERE UserID IN (SELECT UserID2 FROM deleted);
		END
	END
END;

DROP TRIGGER trigger_friend
INSERT INTO dbo.USERRELATION
(
    UserID1,
    UserID2,
    Request,
    isFriend
)
VALUES
(   'UID00000002',      -- UserID1 - varchar(11)
    'UID00000001',      -- UserID2 - varchar(11)
    DEFAULT, -- Request - bit
    null  -- isFriend - bit
    )

UPDATE dbo.USERRELATION
SET isFriend = '1'
WHERE UserID1= 'UID00000002' AND UserID2= 'UID00000001'

UPDATE dbo.USERRELATION
SET isFriend = '0'
WHERE UserID1= 'UID00000002' AND UserID2= 'UID00000001'


INSERT INTO dbo.UserInfor
(
    Account,
    Password,
    FullName,
    Address,
    Mail,
    PhoneNumber,
    Dob,
    Gender,
    Nation,
    ImageUser,
    ImageBackGround,
    NumFriend,
    NumPost,
    TimeCreate,
    RoleID
)
VALUES
(   NULL,    -- Account - varchar(155)
    NULL,    -- Password - varchar(155)
    NULL,    -- FullName - nvarchar(255)
    NULL,    -- Address - nvarchar(255)
    NULL,    -- Mail - varchar(255)
    NULL,    -- PhoneNumber - varchar(15)
    NULL,    -- Dob - date
    NULL,    -- Gender - bit
    NULL,    -- Nation - nvarchar(255)
    NULL,    -- ImageUser - nvarchar(255)
    NULL,    -- ImageBackGround - nvarchar(255)
    DEFAULT, -- NumFriend - int
    DEFAULT, -- NumPost - int
    DEFAULT, -- TimeCreate - datetime
    DEFAULT  -- RoleID - varchar(11)
    )

	INSERT INTO dbo.POST
	(
	    UserID,
	    Content,
	    ImagePost,
	    TimePost,
	    NumInterface,
	    NumComment,
	    NumShare,
	    PrivacyID
	)
	VALUES
	(   NULL,    -- UserID - varchar(11)
	    NULL,    -- Content - nvarchar(max)
	    NULL,    -- ImagePost - nvarchar(255)
	    DEFAULT, -- TimePost - datetime
	    DEFAULT, -- NumInterface - int
	    DEFAULT, -- NumComment - int
	    DEFAULT, -- NumShare - int
	    DEFAULT  -- PrivacyID - varchar(11)
	    )


CREATE TRIGGER post_INSERT
ON POST AFTER INSERT
AS
BEGIN
	UPDATE dbo.UserInfor
	SET NumPost= NumPost +1
	WHERE UserID= (SELECT UserID FROM inserted);
END;

CREATE TRIGGER post_DELETE
ON POST After DELETE
AS
BEGIN
	UPDATE dbo.UserInfor
	SET NumPost= NumPost -1
	WHERE UserID= (SELECT UserID FROM Deleted);
END;
DROP TRIGGER post_DELETE
INSERT INTO dbo.POST
(
    UserID,
    Content,
    ImagePost,
    TimePost,
    NumInterface,
    NumComment,
    NumShare
)
VALUES
(   'UID00000001',    -- UserID - varchar(11)
    NULL,    -- Content - nvarchar(max)
    NULL,    -- ImagePost - nvarchar(255)
    DEFAULT, -- TimePost - datetime
    0,    -- NumInterface - int
    0,    -- NumComment - int
    0     -- NumShare - int
    )

	INSERT INTO dbo.COMMENT
	(
	    UserID,
	    PostID,
	    Content,
	    TimeComment,
	    ImageComment,
	    NumInterface
	)
	VALUES
	(   'UID00000001',    -- UserID - varchar(11)
	    'PID00000002',    -- PostID - varchar(11)
	    NULL,    -- Content - nvarchar(max)
	    DEFAULT, -- TimeComment - datetime
	    NULL,    -- ImageComment - varchar(255)
	    NULL     -- NumInterface - int
	    )
	DELETE dbo.POST
	WHERE PostID= 'PID00000004'

	DELETE dbo.COMMENT
	WHERE CmtID= 'CID00000004'
-- NumComment: trigger khi comment va xoa comment
CREATE TRIGGER delete_comment_of_post
ON dbo.comment AFTER DELETE
AS
BEGIN
	UPDATE dbo.POST
	SET NumComment= NumComment -1
	WHERE PostID= (SELECT PostID FROM Deleted)
END;

CREATE TRIGGER insert_comment_of_post
ON dbo.comment AFTER INSERT 
as
BEGIN
	UPDATE dbo.POST
	SET NumComment= NumComment +1
	WHERE PostID= (SELECT PostID FROM Inserted)
END;
-- NumShare: trigger khi share

-- trigger neu user1 va user2 dong thoi yeu cau kb cho nhau thi chuyen bit = 1;
CREATE TRIGGER ChangeToFriend
ON USERRELATION after UPDATE
AS
BEGIN
	IF( UPDATE(U1RequestU2) AND UPDATE(U2RequestU1))
	BEGIN
		UPDATE dbo.USERRELATION
		SET U1RequestU2= 0, U2RequestU1= 0, isFriend= 1
		WHERE UserID1= ( SELECT UserID1 FROM Inserted ) AND UserID2= ( SELECT UserID2 FROM Inserted ) 
	END;
END;

	INSERT INTO dbo.USERRELATION
	(
	    UserID1,
	    UserID2,
	    Request,
	    U1RequestU2,
	    U2RequestU1,
	    isFriend
	)
	VALUES
	(   'UID00000002',      -- UserID1 - varchar(11)
	    'UID00000001',      -- UserID2 - varchar(11)
	    DEFAULT, -- Request - bit
	    0, -- U1RequestU2 - bit
	    0, -- U2RequestU1 - bit
	    0  -- isFriend - bit
	    )

		UPDATE dbo.USERRELATION
		SET U1RequestU2 =1
		WHERE UserID1= 'UID00000002' AND UserID2= 'UID00000001'

	UPDATE dbo.USERRELATION
	SET U2RequestU1= 1
	WHERE UserID1= 'UID00000002' AND UserID2= 'UID00000001'
--check exist account or mail
    SELECT UserID
	FROM dbo.UserInfor
	WHERE Account='viet080702' AND Mail='van123872000@gmail.com'
	
	

	UPDATE dbo.UserInfor
	SET Password='$argon2i$v=19$m=65536,t=28,p=1$oTUZGQEATK6oSsrqmuqM/w$eCqPQkite3+l8SdsXsQlj792lvM80FBAdz0qE88Di6U'
	WHERE Account='viet080702'

--get personal post

SELECT ImagePost, NumShare, PostID, UserID, Content, TimePost, NumInterface, NumComment, PublicPost
FROM dbo.POST
WHERE POST.UserID= 'UID00000002'
ORDER BY TimePost


SELECT POST.ID, PostID, POST.UserID, Content,
		ImagePost, TimePost, NumInterface, NumComment, 
		NumShare, PublicPost, FullName, ImageUser
	FROM dbo.POST INNER JOIN dbo.UserInfor
	on POST.UserID = UserInfor.UserID
                where POST.UserID= 'UID00000002'
                ORDER BY POST.TimePost

---- add new Post
DECLARE @InsertedIDs TABLE (PostID VARCHAR(11));
	INSERT INTO dbo.POST
(
    UserID,
    Content,
    ImagePost,
    TimePost,
    NumInterface,
    NumComment,
    NumShare,
    PublicPost
)
OUTPUT Inserted.PostID INTO @InsertedIDs
VALUES
(   'UID00000002' ,    -- UserID - varchar(11)
    'adf' ,    -- Content - nvarchar(max)
    'img.png' ,    -- ImagePost - nvarchar(255)
    DEFAULT, -- TimePost - datetime
    DEFAULT, -- NumInterface - int
    DEFAULT, -- NumComment - int
    DEFAULT, -- NumShare - int
    1    -- PublicPost - bit
    );
SELECT PostID FROM @InsertedIDs;
---- add new Post share
DECLARE @InsertedIDs TABLE (ShareID VARCHAR(11));
	INSERT INTO dbo.POSTSHARE
	(
	    UserID,
	    PostID,
	    Content,
	    TimeShare,
	    NumInterface,
	    NumComment,
	    PublicPost
	)
	OUTPUT Inserted.ShareID INTO @InsertedIDs
	VALUES
	(   'UID00000002',    -- UserID - varchar(11)
	    'PID00000038',    -- PostID - varchar(11)
	    'abc',    -- Content - nvarchar(max)
	    DEFAULT, -- TimeShare - datetime
	    DEFAULT, -- NumInterface - int
	    DEFAULT, -- NumComment - int
	    1     -- PublicPost - bit
	    )
SELECT ShareID FROM @InsertedIDs;


--get post
SELECT PostID, UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PublicPost
FROM dbo.POST
WHERE PostID='PID00000002'


--delete post
SELECT *
FROM dbo.POST
WHERE PostID= 'PID00000001' AND UserID= 'UID00000002'

DELETE FROM dbo.POST
WHERE PostID= 'PID00000002' AND UserID= 'asdf'

SELECT PostID, POST.UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PublicPost, FullName, ImageUser
FROM dbo.POST
INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID
WHERE POST.UserID= 'UID00000001'

SELECT c.UserID, c.FullName, c.ImageUser, 
b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, 
d.FullName, d.ImageUser,a.Content,
a.TimeShare, a.NumInterface, a.NumComment, a.PublicPost
FROM dbo.POSTSHARE a
INNER JOIN dbo.POST b ON b.PostID = a.PostID
INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID
INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID
WHERE a.UserID= 'UID00000002'

---get element
INSERT INTO dbo.POSTSHARE
(
    UserID,
    PostID,
    Content,
    TimeShare,
    NumInterface,
    NumComment,
    PublicPost
)
VALUES
(   'UID00000002',    -- UserID - varchar(11)
    'PID00000019',    -- PostID - varchar(11)
    'adu',    -- Content - nvarchar(max)
    DEFAULT, -- TimeShare - datetime
    DEFAULT, -- NumInterface - int
    DEFAULT, -- NumComment - int
    1     -- PublicPost - bit
    )
	SELECT *
	FROM dbo.POSTSHARE
	WHERE UserID='UID00000001'

SELECT *
FROM dbo.POSTSHARE
ORDER BY TimePost
OFFSET 0  ROWS FETCH NEXT 3 ROWS ONLY

DELETE dbo.POSTSHARE
WHERE ShareID= ? AND UserID= ?

SELECT *
FROM dbo.POSTSHARE
WHERE ShareID= 'SID00000002'AND UserID='UID00000001'


-- share post

INSERT INTO dbo.POSTSHARE
(
    UserID,
    PostID,
    Content,
    TimeShare,
    NumInterface,
    NumComment,
    PublicPost
)
VALUES
(   'UID00000001' ,    -- UserID - varchar(11)
    'PID00000043' ,    -- PostID - varchar(11)
    'adu' ,    -- Content - nvarchar(max)
    DEFAULT, -- TimeShare - datetime
    DEFAULT, -- NumInterface - int
    DEFAULT, -- NumComment - int
    1      -- PublicPost - bit
    )
--getPostShareUser
SELECT c.UserID, c.FullName, c.ImageUser, 
            b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, 
            d.FullName, d.ImageUser,a.Content,
            a.TimeShare, a.NumInterface, a.NumComment, a.PublicPost, b.ImagePost
            FROM dbo.POSTSHARE a
            INNER JOIN dbo.POST b ON b.PostID = a.PostID
            INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID
            INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID
WHERE a.ShareID= 'SID00000010'
-- create if it not exist
DECLARE @User1 NVARCHAR(11), @User2 NVARCHAR(11);
SET @User1= N'UID00000002';
SET @User2= N'UID00000001';
IF NOT EXISTS(SELECT *
	FROM dbo.USERRELATION
	WHERE UserID1= @User1 AND UserID2= @User2)
	BEGIN
		INSERT INTO dbo.USERRELATION
		(
		    UserID1,
		    UserID2,
		    U1RequestU2,
		    U2RequestU1,
		    isFriend
		)
		VALUES
		(   @User1,      -- UserID1 - varchar(11)
		    @User2,      -- UserID2 - varchar(11)
		    DEFAULT, -- U1RequestU2 - bit
		    DEFAULT, -- U2RequestU1 - bit
		    DEFAULT  -- isFriend - bit
		    )
	END

-- get user relation
SELECT U1RequestU2, U2RequestU1, isFriend
FROM dbo.USERRELATION
WHERE UserID1= 'UID00000002' AND UserID2= 'UID00000001'
-- request add friend
UPDATE dbo.USERRELATION
SET U1RequestU2 = 1
WHERE UserID1 = 'UID00000002' AND UserID2 = 'UID00000001'
UPDATE dbo.USERRELATION
SET U2RequestU1 = 1
WHERE UserID1 = 'UID00000002' AND UserID2 = 'UID00000001'
-- unrequest
UPDATE dbo.USERRELATION
SET U1RequestU2 = 0
WHERE UserID1 = 'UID00000002' AND UserID2 = 'UID00000001'
UPDATE dbo.USERRELATION
SET U2RequestU1 = 0
WHERE UserID1 = 'UID00000002' AND UserID2 = 'UID00000001'
-- unfriend
UPDATE dbo.USERRELATION
SET isFriend= 0
WHERE UserID1 = 'UID00000002' AND UserID2 = 'UID00000001'
-- lấy bài post
	SELECT PostID, POST.UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PrivacyName, FullName, ImageUser
	 FROM dbo.POST
	 INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID
	INNER JOIN dbo.Privacy ON Privacy.PrivacyID = POST.PrivacyID
	WHERE PostID = 'PID00000018'
-- lấy bài share 
	SELECT c.UserID, c.FullName, c.ImageUser, 
	b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, 
	d.FullName, d.ImageUser,a.Content,
	a.TimeShare, a.NumInterface, a.NumComment, e.PrivacyName, b.ImagePost
	FROM dbo.POSTSHARE a
	INNER JOIN dbo.POST b ON b.PostID = a.PostID
	INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID
	INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID
	INNER JOIN dbo.Privacy e ON e.PrivacyID = a.PrivacyID 
	WHERE a.ShareID= 'SID00000007'
--hiện bài post
	GO 
	DECLARE @Offset INT = 2; -- Số bài post đã hiển thị trước đó = @FetchCount* (offset-1)
	DECLARE @FetchCount INT = 5; -- Số bài post muốn lấy thêm

	SELECT PostID, TimePost, PrivacyID
	FROM dbo.POST
	UNION ALL
    SELECT ShareID, TimeShare, PrivacyID
	FROM dbo.POSTSHARE
	ORDER BY TimePost DESC
	OFFSET (@Offset-1)* @FetchCount ROWS
	FETCH NEXT @FetchCount ROWS ONLY;
	
-- hiện bài post bản thân
-- nhâpj id: @id người dùng đang dùng tài khoản
-- @Offset cụm đang hiện post
	GO
	DECLARE @id NVARCHAR(11)= 'UID00000001'
	DECLARE @Offset INT = 2; -- Số bài post đã hiển thị trước đó = @FetchCount* (offset-1)
	DECLARE @FetchCount INT = 5; -- Số bài post muốn lấy thêm

	SELECT PostID, TimePost, PrivacyID
	FROM dbo.POST
	WHERE UserID= @id
	UNION ALL
    SELECT ShareID, TimeShare, PrivacyID
	FROM dbo.POSTSHARE
	WHERE UserID= @id
	ORDER BY TimePost DESC
	OFFSET (@Offset-1)* @FetchCount ROWS
	FETCH NEXT @FetchCount ROWS ONLY;

-- hiện bài post nguoi khac người khác 
-- nhâpj id: @id người dùng đang dùng tài khoản
-- @uid id người dùng khác
-- @Offset cụm đang hiện post
	GO
	DECLARE @id NVARCHAR(11)= 'UID00000001';
	DECLARE @uid NVARCHAR(11)= 'UID00000003';
	DECLARE @u1 NVARCHAR(11), @u2 NVARCHAR(11), @isFriend bit;
	DECLARE @Offset INT = 1; -- Số bài post đã hiển thị trước đó = @FetchCount* (offset-1)
	DECLARE @FetchCount INT = 5; -- Số bài post muốn lấy thêm
	IF (@id > @uid)
	BEGIN
		SET @u1 = @id;
		SET @u2 = @uid;
	END
	ELSE
	BEGIN
		SET @u2 = @id;
		SET @u1 = @uid;
	END

	SET @isFriend= (SELECT isFriend
	FROM dbo.USERRELATION
	WHERE UserID1= @u1 AND UserID2=@u2)
	IF(@isFriend=1)
		BEGIN
			SELECT PostID, TimePost, PrivacyID
			FROM dbo.POST
			WHERE UserID= @uid AND (PrivacyID='FRIEND' OR PrivacyID='Public')
			UNION ALL
			SELECT ShareID, TimeShare, PrivacyID
			FROM dbo.POSTSHARE
			WHERE UserID= @uid AND (PrivacyID='FRIEND' OR PrivacyID='Public')
			ORDER BY TimePost DESC
			OFFSET (@Offset-1)* @FetchCount ROWS
			FETCH NEXT @FetchCount ROWS ONLY;
		end 
	ELSE 
		BEGIN
			SELECT PostID, TimePost, PrivacyID
			FROM dbo.POST
			WHERE UserID= @uid  AND (PrivacyID='Public') 
			UNION ALL
			SELECT ShareID, TimeShare, PrivacyID
			FROM dbo.POSTSHARE
			WHERE UserID= @uid AND (PrivacyID='Public') 
			ORDER BY TimePost DESC
			OFFSET (@Offset-1)* @FetchCount ROWS
			FETCH NEXT @FetchCount ROWS ONLY;
		End 

	