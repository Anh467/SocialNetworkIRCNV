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
    Connection cnn = new connection.connection().getConnection();

    public ArrayList<PostUser> GetAllPost() {
        ArrayList<PostUser> post = new ArrayList<>();
        String query = "SELECT POST.ID, PostID, POST.UserID, Content, \n" +
"		ImagePost, TimePost, NumInterface, NumComment, \n" +
"		NumShare, PublicPost, FullName, ImageUser\n" +
"		FROM dbo.POST INNER JOIN dbo.UserInfor\n" +
"		on POST.UserID = UserInfor.UserID";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
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

    public ArrayList<Comment> GetComment(){
        ArrayList<Comment> cmt = new ArrayList<>();
        String query = "SELECT ImageUser, FullName, CmtID, \n" +
"		COMMENT.Content, COMMENT.NumInterface, TimeComment, ImageComment\n" +
"		FROM dbo.COMMENT INNER JOIN dbo.POST ON POST.PostID = COMMENT.PostID\n" +
"		INNER JOIN dbo.UserInfor ON UserInfor.UserID = COMMENT.UserID";
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
