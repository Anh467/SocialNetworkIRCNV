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
    isAdmin
)
VALUES
(   'hmmhmm',    -- Account - varchar(155)
    '$argon2i$v=19$m=65536,t=28,p=1$h+mq8XuTgG3OdxgrNx3KIw$eladuef27k/xFsatIK0RAIKdxvZ3PV0RJ4yEKEUTSq8',    -- Password - varchar(155)
    'User3',    -- FullName - nvarchar(255)
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
    DEFAULT  -- isAdmin - bit
    )

	INSERT INTO dbo.USERRELATION
	(
	    UserID1,
	    UserID2,
	    U1RequestU2,
	    U2RequestU1,
	    isFriend
	)
	VALUES
	(   'UID00000006',   -- UserID1 - varchar(11)
	    'UID00000004',   -- UserID2 - varchar(11)
	    1, -- U1RequestU2 - bit
	    NULL, -- U2RequestU1 - bit
	    1  -- isFriend - bit
	    )


SELECT T.UserID1, T.UserID2, T.Mess,T.ofUser1, T.CreateAt
FROM (
  SELECT 
    ID.UserID1,
    ID.UserID2,
    CHATCONTENT.Mess,
    CHATCONTENT.ofUser1,
    CHATCONTENT.CreateAt,
    RANK() OVER (PARTITION BY ID.UserID1, ID.UserID2 ORDER BY CHATCONTENT.CreateAt DESC) AS Ranking
  FROM dbo.CHATCONTENT
  RIGHT JOIN (
    SELECT USERRELATION.UserID1, USERRELATION.UserID2
    FROM dbo.USERRELATION
    WHERE USERRELATION.UserID1 = 'UID00000004' OR USERRELATION.UserID2 = 'UID00000004'
  ) ID ON ID.UserID1 = CHATCONTENT.UserID1 AND ID.UserID2 = CHATCONTENT.UserID2
) AS T
WHERE T.Ranking = 1
ORDER BY T.CreateAt DESC;


SELECT * FROM dbo.CHATCONTENT
WHERE CHATCONTENT.UserID1='UID00000005' AND CHATCONTENT.UserID2='UID00000004'
ORDER BY CHATCONTENT.CreateAt ASC 

INSERT INTO dbo.CHATCONTENT
(
    UserID1,
    UserID2,
    Mess,
    ofUser1
)
VALUES
(   '',       -- UserID1 - varchar(11)
    '',       -- UserID2 - varchar(11)
    N'',      -- Mess - nvarchar(500)
    NULL     -- ofUser1 - bit
    )