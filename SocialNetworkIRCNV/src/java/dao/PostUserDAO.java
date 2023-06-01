/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author 84384
 */
public class PostUserDAO {

    /**
     * @param args the command line arguments
     */
    Connection cnn;

    public PostUserDAO() {
        cnn = new connection.connection().getConnection();
    }
    String deletePost = "DELETE FROM dbo.POST\n"
            + "WHERE PostID= ? AND UserID= ?";
    String checkExistPostUser = "SELECT *\n"
            + "FROM dbo.POST\n"
            + "WHERE PostID= ? AND UserID= ? ";
    String newPost = "DECLARE @InsertedIDs TABLE (PostID VARCHAR(11));\n"
            + "	INSERT INTO dbo.POST\n"
            + "(\n"
            + "    UserID,\n"
            + "    Content,\n"
            + "    ImagePost,\n"
            + "    TimePost,\n"
            + "    NumInterface,\n"
            + "    NumComment,\n"
            + "    NumShare,\n"
            + "    PublicPost\n"
            + ")\n"
            + "OUTPUT Inserted.PostID INTO @InsertedIDs\n"
            + "VALUES\n"
            + "(   ? ,    -- UserID - varchar(11)\n"
            + "    ? ,    -- Content - nvarchar(max)\n"
            + "    ? ,    -- ImagePost - nvarchar(255)\n"
            + "    DEFAULT, -- TimePost - datetime\n"
            + "    DEFAULT, -- NumInterface - int\n"
            + "    DEFAULT, -- NumComment - int\n"
            + "    DEFAULT, -- NumShare - int\n"
            + "    ?    -- PublicPost - bit\n"
            + "    );\n"
            + "SELECT PostID FROM @InsertedIDs;";
    String getPost = "SELECT PostID, UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PublicPost\n"
            + "FROM dbo.POST\n"
            + "WHERE PostID= ? ";
    
    public boolean checkExistPostUser(String PostID, String UserID){
        try {
            PreparedStatement ps = cnn.prepareStatement(checkExistPostUser);
            ps.setString(1, PostID);
            ps.setString(2, UserID);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                return true;
            }
        } catch (Exception e) {
            System.out.println("dao.PostUserDAO.checkExistPostUser()");
            e.printStackTrace();
        }
        return false;
    }
    public boolean deletePost(String PostID, String UserID) {
        if(!checkExistPostUser(PostID, UserID)) return false;
        try {
            PreparedStatement ps = cnn.prepareStatement(deletePost);
            ps.setString(1, PostID);
            ps.setString(2, UserID);
            ps.execute();
        } catch (Exception e) {
            System.out.println("dao.PostUserDAO.deletePost()");
            e.printStackTrace();
        }
        return true;
    }

    public String newPost(String UserID, String Content, String ImagePost, String PublicPost) {
        try {
            Connection cnn = new connection.connection().getConnection();
            PreparedStatement ps = cnn.prepareStatement(newPost);
            ps.setString(1, UserID);
            ps.setString(2, Content);
            ps.setString(3, ImagePost);
            ps.setString(4, PublicPost);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("dao.PostUserDAO.newPost()");
            e.printStackTrace();
        }
        return null;
    }

    public PostUser getPost(String PostID) {
        try {
            PreparedStatement ps = cnn.prepareStatement(getPost);
            ps.setString(1, PostID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new PostUser(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8), rs.getBoolean(9));
            }
        } catch (Exception e) {
            System.out.println("dao.PostUserDAO.getPost()");
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<PostUser> getAllPost(String id) {
        ArrayList<PostUser> post = new ArrayList<>();
        String query = "SELECT POST.ID, PostID, POST.UserID, Content,\n"
                + "		ImagePost, TimePost, NumInterface, NumComment, \n"
                + "		NumShare, PublicPost, FullName, ImageUser\n"
                + "	FROM dbo.POST INNER JOIN dbo.UserInfor\n"
                + "	on POST.UserID = UserInfor.UserID\n"
                + "                where POST.UserID= ? \n"
                + "                ORDER BY POST.TimePost DESC";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                post.add(new PostUser(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getBoolean(10), rs.getString(11), rs.getString(12)));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return post;
    }

    public ArrayList<Comment> getComment() {
        ArrayList<Comment> cmt = new ArrayList<>();
        String query = "SELECT ImageUser, FullName, CmtID, \n"
                + "		COMMENT.Content, COMMENT.NumInterface, TimeComment, ImageComment\n"
                + "		FROM dbo.COMMENT INNER JOIN dbo.POST ON POST.PostID = COMMENT.PostID\n"
                + "		INNER JOIN dbo.UserInfor ON UserInfor.UserID = COMMENT.UserID";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cmt.add(new Comment(rs.getString(2), rs.getString(1), rs.getString(6), rs.getString(4), rs.getInt(5), rs.getString(7), rs.getString(3)));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return cmt;
    }

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
