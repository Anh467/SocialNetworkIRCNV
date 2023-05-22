/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Comment;
import model.PostShare;

/**
 *
 * @author 84384
 */
public class PostShareDAO {

    /**
     * @param args the command line arguments
     */
    Connection cnn = new connection.connection().getConnection();

    public ArrayList<PostShare> GetAllPostShare() {
        ArrayList<PostShare> postshare = new ArrayList<>();
        String query = "SELECT dbo.POST.UserID, \n"
                + "		(SELECT FullName FROM dbo.POST INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID)[nameuserdown],\n"
                + "		(SELECT ImageUser FROM dbo.POST INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID)[imguserdown],\n"
                + "		dbo.POST.TimePost, dbo.POST.Content,\n"
                + "		--user share\n"
                + "		ShareID, POSTSHARE.UserID,\n"
                + "\n"
                + "		(SELECT FullName	FROM dbo.POSTSHARE \n"
                + "		INNER JOIN dbo.UserInfor ON UserInfor.UserID = POSTSHARE.UserID	)[nameshare], \n"
                + "		dbo.POSTSHARE.PostID, \n"
                + "		(SELECT ImageUser	FROM dbo.POSTSHARE \n"
                + "		INNER JOIN dbo.UserInfor ON UserInfor.UserID = POSTSHARE.UserID	)[imgusershare],\n"
                + "		dbo.POSTSHARE.Content, dbo.POST.ImagePost, dbo.POSTSHARE.TimeShare,\n"
                + "		dbo.POSTSHARE.NumInterface, dbo.POSTSHARE.NumComment, dbo.POST.NumShare,\n"
                + "		dbo.POSTSHARE.PublicPost\n"
                + "		FROM dbo.POSTSHARE INNER JOIN dbo.UserInfor \n"
                + "		ON POSTSHARE.UserID = UserInfor.UserID\n"
                + "		INNER JOIN dbo.POST ON POST.PostID = POSTSHARE.PostID";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            System.out.println("QR4");
            while (rs.next()) {
                postshare.add(new PostShare(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(9), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(10), rs.getString(11),
                        rs.getString(12), rs.getString(13), rs.getInt(14), rs.getInt(15),
                        rs.getInt(16), rs.getBoolean(17)));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.err.println("WRONG AT CHECKLOGIN");
            e.printStackTrace();
        }
        return postshare;
    }

    public ArrayList<Comment> GetCommentShare() {
        ArrayList<Comment> cmt = new ArrayList<>();
        String query = "SELECT ImageUser, FullName, CmtID, \n"
                + "		dbo.COMMENTSHARE.Content, dbo.COMMENTSHARE.NumInterface, TimeComment, ImageComment\n"
                + "		FROM dbo.COMMENTSHARE INNER JOIN dbo.POSTSHARE ON POSTSHARE.ShareID = COMMENTSHARE.ShareID\n"
                + "		INNER JOIN dbo.UserInfor ON UserInfor.UserID = dbo.COMMENTSHARE.UserID";
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
