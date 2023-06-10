--CREATE DATABASE SocialMedia
--------------------------------------------------------------UserInfor------------------------------------------------------------------
--phan quyen nguoi dung
CREATE TABLE Role(
	RoleID VARCHAR(11) PRIMARY KEY NOT NULL,
	RoleName VARCHAR(30),
	-- User - User
	-- Admin - Admin
	-- Master Admin - Master_Admin
);

INSERT INTO dbo.Role
VALUES
(   'USER', 'User' ),
(   'ADMIN', 'Admin' ),
(   'MASTERADMIN', 'Master Admin' );

-- search INSERT INTO dbo.UserInfor
CREATE TABLE UserInfor(
	ID INT IDENTITY(1,1) NOT NULL,
	UserID AS 'UID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
	Account VARCHAR(155) UNIQUE,
	Password VARCHAR(155),
	FullName NVARCHAR(255),
	Address NVARCHAR(255),
	Mail VARCHAR(255),
	PhoneNumber VARCHAR(15),
	Dob DATE,
	Gender BIT,
	-- 0: girl
	-- 1: man
	Nation NVARCHAR(255),
	ImageUser NVARCHAR(255),
	ImageBackGround NVARCHAR(255),
	NumFriend INT DEFAULT 0,
	NumPost INT DEFAULT 0,
	TimeCreate DATETIME DEFAULT GETDATE(),
	RoleID VARCHAR(11) DEFAULT 'USER',
	CONSTRAINT fk_RoleID_UserInfor FOREIGN KEY (RoleID) REFERENCES dbo.Role(RoleID),
);





--------------------------------------------------------------DBO.POST------------------------------------------------------------------
--Phaan quyen rieng tu bai post INSERT INTO dbo.POST
CREATE TABLE Privacy(
	PrivacyID VARCHAR(11) PRIMARY KEY NOT NULL,
	PrivacyName VARCHAR(30),
)
INSERT INTO dbo.Privacy
VALUES
(   'PUBLIC', 'Public'),
(   'FRIEND', 'Friend'),
(   'PRIVATE', 'Private');

CREATE TABLE POST(
	ID INT IDENTITY(1,1) NOT NULL,
	PostID AS 'PID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
	UserID VARCHAR(11),
	CONSTRAINT fk_user_id_dboPOST FOREIGN KEY (UserID) REFERENCES dbo.UserInfor(UserID),
	Content NVARCHAR(MAX),
	ImagePost NVARCHAR(255),
	TimePost DATETIME DEFAULT GETDATE(),
	NumInterface INT DEFAULT 0,
	NumComment INT DEFAULT 0,
	NumShare INT DEFAULT 0, 
	PrivacyID VARCHAR(11) DEFAULT 'PUBLIC',
	CONSTRAINT fk_PrivacyID_POST FOREIGN KEY (PrivacyID) REFERENCES dbo.Privacy(PrivacyID),
)


--------------------------------------------------------------DBO.COMMENT------------------------------------------------------------------
CREATE TABLE COMMENT(
	ID INT IDENTITY(1,1) NOT NULL,
	CmtID AS 'CID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
	UserID VARCHAR(11),
	CONSTRAINT fk_user_id_dboCOMMENT FOREIGN KEY (UserID) REFERENCES dbo.UserInfor(UserID),
	PostID VARCHAR(11),
	CONSTRAINT fk_post_id_dboCOMMENT FOREIGN KEY (PostID) REFERENCES dbo.POST(PostID),
	Content NVARCHAR(MAX),
	TimeComment DATETIME DEFAULT GETDATE(),
	ImageComment varchar(255),
	NumInterface INT DEFAULT 0,
)




--------------------------------------------------------------DBO.USERRELATION------------------------------------------------------------------
CREATE TABLE USERRELATION(
	UserID1 VARCHAR(11),
	CONSTRAINT fk_user_id1_dboUSERRELATION FOREIGN KEY (UserID1) REFERENCES dbo.UserInfor(UserID),
	UserID2 VARCHAR(11),
	CONSTRAINT fk_user_id2_dboUSERRELATION FOREIGN KEY (UserID2) REFERENCES dbo.UserInfor(UserID),
	PRIMARY KEY(UserID1, UserID2),
	CHECK (UserID1>UserID2),
	-- rang buoc UserID1 luc nao cung lon hon UserID2
	--Request BIT DEFAULT NULL,
	U1RequestU2 BIT DEFAULT 0,
	U2RequestU1 BIT DEFAULT 0,
	isFriend BIT DEFAULT 0,
	-- 0: da ket ban
	-- 1: chua ket ban
)
	


--------------------------------------------------------------DBO.CHATCONTENT------------------------------------------------------------------
CREATE TABLE CHATCONTENT(
	ID INT IDENTITY(1,1) NOT NULL,
	ChatID AS 'ChatID' + RIGHT('000000000000' + CAST(ID AS VARCHAR(12)), 12) PERSISTED PRIMARY KEY,
	UserID1 VARCHAR(11),
	CONSTRAINT fk_user_id1_dboCHATCONTENT FOREIGN KEY (UserID1) REFERENCES dbo.UserInfor(UserID),
	UserID2 VARCHAR(11),
	CONSTRAINT fk_user_id2_dboCHATCONTENT FOREIGN KEY (UserID2) REFERENCES dbo.UserInfor(UserID),
	CHECK (UserID1>UserID2),
	Mess NVARCHAR(500),
	ofUser1 BIT,
	--ofUser1 đúng thì đây sẽ là đoạn chat của user1
	--ofUser1 sai thì đây sẽ là đoạn chat của user2 
	CreateAt DATETIME DEFAULT GETDATE(),
	-- rang buoc UserID1 luc nao cung lon hon UserID2
)
--------------------------------------------------------------DBO.SHARE------------------------------------------------------------------
--tao them 1 table share nua


CREATE TABLE POSTSHARE(
ID INT IDENTITY(1,1) NOT NULL,
	ShareID AS 'SID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
	UserID VARCHAR(11),
	CONSTRAINT fk_user_id_dboPOSTSHARE FOREIGN KEY (UserID) REFERENCES dbo.UserInfor(UserID),
	PostID VARCHAR(11),
	CONSTRAINT fk_post_id_dboPOSTSHARE FOREIGN KEY (PostID) REFERENCES dbo.POST(PostID),
	Content NVARCHAR(MAX),
	TimeShare DATETIME DEFAULT GETDATE(),
	NumInterface INT DEFAULT 0,
	NumComment INT DEFAULT 0,
	PrivacyID VARCHAR(11) DEFAULT 'PUBLIC',
	CONSTRAINT fk_PrivacyID_POSTSHARE FOREIGN KEY (PrivacyID) REFERENCES dbo.Privacy(PrivacyID),
)

CREATE TABLE COMMENTSHARE(
	ID INT IDENTITY(1,1) NOT NULL,
	CmtID AS 'CID' + RIGHT('00000000' + CAST(ID AS VARCHAR(8)), 8) PERSISTED PRIMARY KEY,
	UserID VARCHAR(11),
	CONSTRAINT fk_user_id_dboCOMMENTSHARE FOREIGN KEY (UserID) REFERENCES dbo.UserInfor(UserID),
	ShareID VARCHAR(11),
	CONSTRAINT fk_post_id_dboCOMMENTSHARE FOREIGN KEY (ShareID) REFERENCES dbo.POSTSHARE(ShareID),
	Content NVARCHAR(MAX),
	TimeComment DATETIME DEFAULT GETDATE(),
	ImageComment VARCHAR(255),
	NumInterface INT DEFAULT 0,
)

CREATE TABLE MAIL(
	Mail VARCHAR(255) PRIMARY KEY NOT NULL,
	code CHAR(10),
)

