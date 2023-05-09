--create database trash
Create table UserInfor(
	ID INT IDENTITY(1,1) NOT NULL,
	UserID AS 'UID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) persisted PRIMARY KEY,
	Account varchar(155) unique,
	Password varchar(155),
	FullName nvarchar(255),
	Address nvarchar(255),
	Mail varchar(255),
	PhoneNumber varchar(15),
	check (PhoneNumber like '%[^0-9]%'),
	Dob date,
	Gender bit,
	-- 0: girl
	-- 1: man
	Nation nvarchar(255),
	ImageUser nvarchar(255),
	NumFriend INT DEFAULT 0,
	NumPost int,
	TimeCreate datetime DEFAULT getDate(),
	isAdmin bit
	-- 0 khong phai admin
	-- 1 chinh  la  admin
);
--NumFriend: trigger khi add friend, trigger khi huy friend dbo.USERRELATION
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


--NumPost  : Trigger khi ddanwg bai
Create table POST(
	ID INT IDENTITY(1,1) NOT NULL,
	PostID AS 'PID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) persisted PRIMARY KEY,
	UserID varchar(11),
	constraint fk_user_id_dboPOST foreign key (UserID) references dbo.UserInfor(UserID),
	Content nvarchar(max),
	ImagePost nvarchar(255),
	TimePost datetime DEFAULT getDate(),
	NumInterface int,
	NumComment int,
	NumShare int,
)
-- NumInterface: tigger khi huy like va like dbo.
-- NumComment: trigger khi comment va xoa comment
-- NumShare: trigger khi share
Create table COMMENT(
	ID INT IDENTITY(1,1) NOT NULL,
	CmtID AS 'CID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) persisted PRIMARY KEY,
	UserID varchar(11),
	constraint fk_user_id_dboCOMMENT foreign key (UserID) references dbo.UserInfor(UserID),
	PostID varchar(11),
	constraint fk_post_id_dboCOMMENT foreign key (PostID) references dbo.POST(PostID),
	Content nvarchar(max),
	TimeComment datetime DEFAULT getDate(),
	ImageComment varchar(255),
	NumInterface int,
)
-- NumInterface: tigger khi huy like va like
Create table USERRELATION(
	UserID1 varchar(11),
	constraint fk_user_id1_dboUSERRELATION foreign key (UserID1) references dbo.UserInfor(UserID),
	UserID2 varchar(11),
	constraint fk_user_id2_dboUSERRELATION foreign key (UserID2) references dbo.UserInfor(UserID),
	PRIMARY key(UserID1, UserID2),
	check (UserID1>UserID2),
	-- rang buoc UserID1 luc nao cung lon hon UserID2
	Request bit DEFAULT null,
	-- neu bit la nulll thi chua thang nao request
	-- neu bit la 0 thi user1 gui loi moi kb cho user2
	-- neu bit la 1 thi user2 gui loi moi kb cho user1
	isFriend bit DEFAULT 0,
	-- 0: da ket ban
	-- 1: chua ket ban
	-- trigger neu user1 va user2 dong thoi yeu cau kb cho nhau thi chuyen bit = 1;
)
create table CHATCONTENT(
	ID INT IDENTITY(1,1) NOT NULL,
	ChatID AS 'ChatID' + RIGHT('000000000000' + CAST(ID AS VARCHAR(12)), 12) persisted PRIMARY KEY,
	UserID1 varchar(11),
	constraint fk_user_id1_dboCHATCONTENT foreign key (UserID1) references dbo.UserInfor(UserID),
	UserID2 varchar(11),
	constraint fk_user_id2_dboCHATCONTENT foreign key (UserID2) references dbo.UserInfor(UserID),
	check (UserID1>UserID2),
	-- rang buoc UserID1 luc nao cung lon hon UserID2
)

