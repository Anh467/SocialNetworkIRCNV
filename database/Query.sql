--create database trash1
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
    NumFriend,
    NumPost,
    TimeCreate,
    isAdmin
)
VALUES
(   'abc1',    -- Account - varchar(155)
    'abc1',    -- Password - varchar(155)
    NULL,    -- FullName - nvarchar(255)
    NULL,    -- Address - nvarchar(255)
    NULL,    -- Mail - varchar(255)
    NULL,    -- PhoneNumber - varchar(15)
    NULL,    -- Dob - date
    NULL,    -- Gender - bit
    NULL,    -- Nation - nvarchar(255)
    NULL,    -- ImageUser - nvarchar(255)
    NULL,    -- NumFriend - int
    NULL,    -- NumPost - int
    DEFAULT, -- TimeCreate - datetime
    NULL     -- isAdmin - bit
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
    