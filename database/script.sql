USE [SocialMedia]
GO
INSERT [dbo].[Role] ([RoleID], [RoleName]) VALUES (N'ADMIN', N'Admin')
INSERT [dbo].[Role] ([RoleID], [RoleName]) VALUES (N'MASTERADMIN', N'Master Admin')
INSERT [dbo].[Role] ([RoleID], [RoleName]) VALUES (N'USER', N'User')
GO
SET IDENTITY_INSERT [dbo].[UserInfor] ON 

INSERT [dbo].[UserInfor] ([ID], [Account], [Password], [FullName], [Address], [Mail], [PhoneNumber], [Dob], [Gender], [Nation], [ImageUser], [ImageBackGround], [NumFriend], [NumPost], [TimeCreate], [RoleID]) VALUES (1, N'viet080702', N'$argon2i$v=19$m=65536,t=28,p=1$/4QqMZE6OlaJdovzC3RucQ$80KbJlEz01NuLBYSxDUTDd0iImzGQ1mlJ7YUt/TB+P8', N'Nguyen Anh Viet', N'Địa chỉ', N'van123872000@gmail.com', N'0384859541 ', CAST(N'2023-06-07' AS Date), 1, N'Nước ở ', N'data/user/UID00000001/avatar/Nam.png', N'data/user/UID00000001/background/Nam.png', 2, 3, CAST(N'2023-06-09T22:37:10.447' AS DateTime), N'USER')
INSERT [dbo].[UserInfor] ([ID], [Account], [Password], [FullName], [Address], [Mail], [PhoneNumber], [Dob], [Gender], [Nation], [ImageUser], [ImageBackGround], [NumFriend], [NumPost], [TimeCreate], [RoleID]) VALUES (2, N'viet0807022', N'$argon2i$v=19$m=65536,t=28,p=1$65ULD/C8Z9YTpy+oo6T/fw$Y1oxAc8qQ5q3kzAQYYbuOhUH5hLmvZNygZZDGlwyC00', N'Nguyen Duy Khanh', N'null', N'van123872000@gmail.com', N'null ', CAST(N'2023-06-05' AS Date), 1, N'null ', N'data/user/UID00000002/avatar/Sharingan_17_08_2016_5.jpg', NULL, 2, 2, CAST(N'2023-06-09T22:38:39.540' AS DateTime), N'USER')
INSERT [dbo].[UserInfor] ([ID], [Account], [Password], [FullName], [Address], [Mail], [PhoneNumber], [Dob], [Gender], [Nation], [ImageUser], [ImageBackGround], [NumFriend], [NumPost], [TimeCreate], [RoleID]) VALUES (3, N'viet08070222', N'$argon2i$v=19$m=65536,t=28,p=1$FK61Fb+dvCmjpF0z7Ckb/g$I06y13EQjm9duFcxw1E16qkotisHsjlAMfl6DlCt5Gc', N'Nguyễn Hồ Ngọc Ấn', N'null', N'van123872000@gmail.com', N'null  ', CAST(N'2023-05-29' AS Date), 1, N'null  ', N'data/user/UID00000003/avatar/hinh-anh-cute.jpg', N'data/user/UID00000003/background/MV5BYWQwMDNkM2MtODU4OS00OTY3LTgwOTItNjE2Yzc0MzRkMDllXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg', 2, 8, CAST(N'2023-06-09T22:45:49.233' AS DateTime), N'USER')
INSERT [dbo].[UserInfor] ([ID], [Account], [Password], [FullName], [Address], [Mail], [PhoneNumber], [Dob], [Gender], [Nation], [ImageUser], [ImageBackGround], [NumFriend], [NumPost], [TimeCreate], [RoleID]) VALUES (4, N'viet080702222', N'$argon2i$v=19$m=65536,t=28,p=1$ynKePYe2t3pRYEiw6dnGOQ$PBz0UD3eXc4/Eg0+oGAUEjx2FxYadOaNARAgUeOb+ag', N'Nguyễn Hồng Lĩnh', NULL, N'van123872000@gmail.com', NULL, CAST(N'2023-05-31' AS Date), 1, NULL, NULL, NULL, 0, 0, CAST(N'2023-06-09T22:47:16.583' AS DateTime), N'USER')
SET IDENTITY_INSERT [dbo].[UserInfor] OFF
GO
INSERT [dbo].[Privacy] ([PrivacyID], [PrivacyName]) VALUES (N'FRIEND', N'Friend')
INSERT [dbo].[Privacy] ([PrivacyID], [PrivacyName]) VALUES (N'PRIVATE', N'Private')
INSERT [dbo].[Privacy] ([PrivacyID], [PrivacyName]) VALUES (N'PUBLIC', N'Public')
GO
SET IDENTITY_INSERT [dbo].[POST] ON 

INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (5, N'UID00000003', N'', N'', CAST(N'2023-06-10T09:45:28.490' AS DateTime), 0, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (6, N'UID00000003', N'', N'data/post/PID00000006/Sharingan_17_08_2016_5.jpg', CAST(N'2023-06-10T09:45:33.883' AS DateTime), 1, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (7, N'UID00000003', N'', N'data/post/PID00000007/ai-image-enlarger-1-after-2.jpg', CAST(N'2023-06-10T09:45:40.710' AS DateTime), 1, 0, 1, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (8, N'UID00000003', N'', N'data/post/PID00000008/Hinh-anh-background-de-thuong-chu-tho-va-cau-vong.jpg', CAST(N'2023-06-10T09:45:47.197' AS DateTime), 1, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (23, N'UID00000003', N'', N'', CAST(N'2023-06-10T10:43:43.400' AS DateTime), 0, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (24, N'UID00000003', N'', N'data/post/PID00000024/Sharingan_17_08_2016_5.jpg', CAST(N'2023-06-10T10:43:48.183' AS DateTime), 0, 0, 0, N'PUBLIC')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (25, N'UID00000003', N'', N'data/post/PID00000025/hinh-anh-cute.jpg', CAST(N'2023-06-10T12:50:26.563' AS DateTime), 1, 0, 1, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (34, N'UID00000003', N'', N'data/post/PID00000034/Nam.png', CAST(N'2023-06-11T21:40:59.947' AS DateTime), 0, 0, 0, N'PRIVATE')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (45, N'UID00000001', N'', N'data/post/PID00000045/Screenshot 2023-05-24 125614.png', CAST(N'2023-06-11T23:49:36.063' AS DateTime), 0, 0, 2, N'PRIVATE')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (48, N'UID00000001', N'Khánh yêu Việt hơn ngiu khánh', N'data/post/PID00000048/Screenshot 2023-05-27 223812.png', CAST(N'2023-06-12T00:20:39.483' AS DateTime), 0, 0, 1, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (50, N'UID00000002', N'', N'', CAST(N'2023-06-12T12:04:48.320' AS DateTime), 2, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (51, N'UID00000002', N'Nam ơi tớ thích cậu', N'data/post/PID00000051/Nam.png', CAST(N'2023-06-12T12:34:16.560' AS DateTime), 0, 0, 0, N'FRIEND')
INSERT [dbo].[POST] ([ID], [UserID], [Content], [ImagePost], [TimePost], [NumInterface], [NumComment], [NumShare], [PrivacyID]) VALUES (52, N'UID00000001', N'', N'data/post/PID00000052/Screenshot 2023-05-24 125609.png', CAST(N'2023-06-13T09:01:51.393' AS DateTime), 1, 0, 1, N'FRIEND')
SET IDENTITY_INSERT [dbo].[POST] OFF
GO
INSERT [dbo].[USERRELATION] ([UserID1], [UserID2], [U1RequestU2], [U2RequestU1], [isFriend]) VALUES (N'UID00000002', N'UID00000001', 0, 0, 1)
INSERT [dbo].[USERRELATION] ([UserID1], [UserID2], [U1RequestU2], [U2RequestU1], [isFriend]) VALUES (N'UID00000003', N'UID00000001', 0, 0, 1)
INSERT [dbo].[USERRELATION] ([UserID1], [UserID2], [U1RequestU2], [U2RequestU1], [isFriend]) VALUES (N'UID00000003', N'UID00000002', 0, 0, 1)
INSERT [dbo].[USERRELATION] ([UserID1], [UserID2], [U1RequestU2], [U2RequestU1], [isFriend]) VALUES (N'UID00000004', N'UID00000001', 0, 0, 0)
INSERT [dbo].[USERRELATION] ([UserID1], [UserID2], [U1RequestU2], [U2RequestU1], [isFriend]) VALUES (N'UID00000004', N'UID00000003', 0, 0, 0)
GO
SET IDENTITY_INSERT [dbo].[POSTSHARE] ON 

INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (8, N'UID00000003', N'PID00000025', N'', CAST(N'2023-06-11T21:41:08.443' AS DateTime), 1, 0, N'PUBLIC')
INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (19, N'UID00000001', N'PID00000045', N'khánh yêu Việt', CAST(N'2023-06-12T00:05:49.333' AS DateTime), 1, 0, N'FRIEND')
INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (20, N'UID00000001', N'PID00000048', N'', CAST(N'2023-06-13T09:01:32.603' AS DateTime), 0, 0, N'FRIEND')
INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (21, N'UID00000001', N'PID00000052', N'', CAST(N'2023-06-13T09:01:54.733' AS DateTime), 2, 0, N'FRIEND')
INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (22, N'UID00000001', N'PID00000045', N'asdf', CAST(N'2023-06-13T09:03:36.777' AS DateTime), 1, 0, N'FRIEND')
INSERT [dbo].[POSTSHARE] ([ID], [UserID], [PostID], [Content], [TimeShare], [NumInterface], [NumComment], [PrivacyID]) VALUES (23, N'UID00000001', N'PID00000007', N'', CAST(N'2023-06-13T09:03:53.420' AS DateTime), 2, 0, N'PUBLIC')
SET IDENTITY_INSERT [dbo].[POSTSHARE] OFF
GO
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'angry', N'angry', N'<i class=''fa-regular fa-face-nose-steam''></i><span>Angry</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'haha', N'haha', N'<i class=''fa-solid fa-face-laugh-ssteam''></i><span>Haha</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'like', N'like', N'<i class=''fa-solid fa-thumbs-up''></i><span>Like</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'love', N'love', N'<i class=''fa-solid fa-heart''></i><span>Love</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'none', N'none', N'<i class=''fa-regular fa-thumbs-up''></i><span>Like</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'sad', N'sad', N'<i class=''fa-solid fa-face-sad-cry''></i> <span>Sad</span>')
INSERT [dbo].[InterFace] ([InterFaceID], [InterFaceName], [InterFaceDiv]) VALUES (N'wow', N'wow', N'<i class=''fa-solid fa-face-explcry''></i> <span>Wow</span>')
GO
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000005', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000006', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000007', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000008', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000008', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000023', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000023', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000024', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000024', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000025', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000025', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000045', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000048', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000048', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000050', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000050', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000051', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000051', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'PID00000052', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'PID00000052', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000008', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000008', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000019', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000019', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000020', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000020', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000021', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000021', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000022', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000022', N'none')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000001', N'SID00000023', N'like')
INSERT [dbo].[InterFaceObject] ([UserID], [ObjectID], [InterFaceID]) VALUES (N'UID00000002', N'SID00000023', N'like')
GO
INSERT [dbo].[MAIL] ([Mail], [code]) VALUES (N'v', N'1379094   ')
INSERT [dbo].[MAIL] ([Mail], [code]) VALUES (N'van123872000@gmail.com', N'9010758   ')
GO
