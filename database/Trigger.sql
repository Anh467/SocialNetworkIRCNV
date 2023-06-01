--NumFriend: trigger khi add friend, trigger khi huy friend dbo.USERRELATION
	GO
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
	--nếu post đăng thì sẽ tăng thuộc tính NumPost của UserInfor lên 1
	GO
	CREATE TRIGGER post_INSERT
	ON POST After INSERT
	AS
	BEGIN
		UPDATE dbo.UserInfor
		SET NumPost= NumPost +1
		WHERE UserID= (SELECT UserID FROM inserted);
	END;
	--nếu post đăng thì sẽ giảm thuộc tính NumPost của UserInfor đi 1
	GO
	CREATE TRIGGER post_DELETE
	ON POST After DELETE
	AS
	BEGIN
		UPDATE dbo.UserInfor
		SET NumPost= NumPost -1
		WHERE UserID= (SELECT UserID FROM Deleted);
	END;

-- NumInterface: tigger khi huy like va like dbo. (casi nay khong can trigger)
-- NumComment: trigger khi comment va xoa comment
	-- tăng NumComment của post kkhi đăng bình luận
	GO
	CREATE TRIGGER delete_comment_of_post
	ON dbo.comment AFTER DELETE
	as
	BEGIN
		UPDATE dbo.POST
		SET NumComment= NumComment -1
		WHERE PostID= (SELECT PostID FROM Deleted)
	END;
	-- giảm NumComment của post kkhi xáo bình luận
	GO
	CREATE TRIGGER insert_comment_of_post
	ON dbo.comment AFTER INSERT 
	as
	BEGIN
		UPDATE dbo.POST
		SET NumComment= NumComment +1
		WHERE PostID= (SELECT PostID FROM Inserted)
	END;

-- NumShare: trigger khi share
	--trigger khi đăng post
	go
	CREATE TRIGGER increase_when_share_POST
	ON dbo.POSTSHARE AFTER INSERT
	AS
	BEGIN
		UPDATE dbo.POST
		SET NumShare= NumShare +1
		WHERE PostID= (SELECT PostID FROM INSERTed)
	END
	--trigger khi xóa post
	go
	CREATE TRIGGER decrease_when_share_POST
	ON dbo.POSTSHARE AFTER DELETE
	AS
	BEGIN
		UPDATE dbo.POST
		SET NumShare= NumShare -1
		WHERE PostID= (SELECT PostID FROM deleted)
	END

-- NumInterface: tigger khi huy like va like (casi nay khong can trigger)
-- trigger neu user1 va user2 dong thoi yeu cau kb cho nhau thi chuyen bit = 1;
	go
	CREATE TRIGGER ChangeToFriend
	ON USERRELATION AFTER UPDATE
	AS
	BEGIN
		IF( UPDATE(U1RequestU2) AND UPDATE(U2RequestU1))
			UPDATE dbo.USERRELATION
			SET U1RequestU2= 0, U2RequestU1= 0, isFriend= 1
			WHERE UserID1= (SELECT UserID1 FROM dbo.USERRELATION) AND UserID2= (SELECT UserID2 FROM dbo.USERRELATION)
    END;

-- NumComment: trigger khi comment va xoa comment
	GO
	CREATE TRIGGER delete_comment_of_POSTSHARE
	ON dbo.COMMENTSHARE AFTER DELETE
	as
	BEGIN
		UPDATE dbo.POSTSHARE
		SET NumComment= NumComment -1
		WHERE ShareID= (SELECT ShareID FROM Deleted)
	END;
	GO
	CREATE TRIGGER insert_comment_of_POSTSHARE
	ON dbo.COMMENTSHARE AFTER INSERT 
	AS
	BEGIN
		UPDATE dbo.POSTSHARE
		SET NumComment= NumComment +1
		WHERE ShareID= (SELECT ShareID FROM Inserted)
	END;
-- new path for image
	GO
    CREATE TRIGGER Add_Path_For_Post
	ON dbo.POST AFTER INSERT 
	AS
	BEGIN
		UPDATE dbo.POST
		SET ImagePost= 'web/data/post/'+PostID+'/'+ImagePost
		WHERE PostID= (SELECT PostID FROM INSERTed)
	END