/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controller.Text;
import java.sql.*;
import java.util.ArrayList;
import model.Post;
import model.PostShare;
import model.PostUser;

/**
 *
 * @author van12
 */
public class PostDAO {

    private Connection cnn;
    Text text;

    public PostDAO() {
        cnn = new connection.connection().getConnection();
        text = new Text();
    }
    String getPostUser = "SELECT PostID, POST.UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PublicPost, FullName, ImageUser\n"
            + "FROM dbo.POST\n"
            + "INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID";
    String getPostShareUser = "SELECT c.UserID, c.FullName, c.ImageUser, \n"
            + "b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, \n"
            + "d.FullName, d.ImageUser,a.Content,\n"
            + "a.TimeShare, a.NumInterface, a.NumComment, a.PublicPost, b.ImagePost\n"
            + "FROM dbo.POSTSHARE a\n"
            + "INNER JOIN dbo.POST b ON b.PostID = a.PostID\n"
            + "INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID\n"
            + "INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID";
    String getPostShareByShareID = "SELECT c.UserID, c.FullName, c.ImageUser, \n"
            + "            b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, \n"
            + "            d.FullName, d.ImageUser,a.Content,\n"
            + "            a.TimeShare, a.NumInterface, a.NumComment, a.PublicPost, b.ImagePost\n"
            + "            FROM dbo.POSTSHARE a\n"
            + "            INNER JOIN dbo.POST b ON b.PostID = a.PostID\n"
            + "            INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID\n"
            + "            INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID\n"
            + "WHERE a.ShareID= ? ";
    String getPostShareUserByID = "SELECT c.UserID, c.FullName, c.ImageUser, \n"
            + "b.TimePost, b.Content, a.PostID, a.ShareID, a.UserID, \n"
            + "d.FullName, d.ImageUser,a.Content,\n"
            + "a.TimeShare, a.NumInterface, a.NumComment, a.PublicPost, b.ImagePost\n"
            + "FROM dbo.POSTSHARE a\n"
            + "INNER JOIN dbo.POST b ON b.PostID = a.PostID\n"
            + "INNER JOIN dbo.UserInfor c ON b.UserID= c.UserID\n"
            + "INNER JOIN dbo.UserInfor d ON d.UserID= a.UserID\n"
            + "WHERE a.UserID= ? ";
    String getPostUserByID = "SELECT PostID, POST.UserID, Content, ImagePost, TimePost, NumInterface, NumComment, NumShare, PublicPost, FullName, ImageUser\n"
            + "FROM dbo.POST\n"
            + "INNER JOIN dbo.UserInfor ON UserInfor.UserID = POST.UserID\n"
            + "WHERE POST.UserID= ? ";

    public ArrayList<Post> getPostUser() {
        ArrayList<Post> postUser = new ArrayList<>();

        try {
            PreparedStatement ps = cnn.prepareStatement(getPostUser);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                postUser.add(new PostUser(rs.getString(1), rs.getString(2),
                        text.changeUTF8(rs.getNString(3)), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8),
                        rs.getBoolean(9), text.changeUTF8(rs.getNString(10)),
                        rs.getString(11)));

            }
        } catch (Exception e) {
            System.out.println("dao.PostDAO.getPostUser()");
            e.printStackTrace();
        }
        return postUser;
    }

    public PostShare getPostShareByShareID(String ShareID) {
        try {
            PreparedStatement ps = cnn.prepareStatement(getPostShareByShareID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new PostShare(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), text.changeUTF8(rs.getNString(5)), rs.getString(6), rs.getString(7), rs.getString(8),
                        text.changeUTF8(rs.getNString(9)), rs.getString(10), text.changeUTF8(rs.getNString(11)),
                        rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getBoolean(15), rs.getString(16));
            }
        } catch (Exception e) {
            System.out.println("dao.PostDAO.getPostShareUser()");
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Post> getPostShareUser() {
        ArrayList<Post> postUser = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(getPostShareUser);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                postUser.add(new PostShare(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), text.changeUTF8(rs.getNString(5)), rs.getString(6), rs.getString(7), rs.getString(8),
                        text.changeUTF8(rs.getNString(9)), rs.getString(10), text.changeUTF8(rs.getNString(11)),
                        rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getBoolean(15), rs.getString(16)));
            }
        } catch (Exception e) {
            System.out.println("dao.PostDAO.getPostShareUser()");
            e.printStackTrace();
        }
        return postUser;
    }

    public ArrayList<Post> getPostPersonalPage() {
        ArrayList<Post> postUser = new ArrayList<>();
        postUser.addAll(getPostUser());
        postUser.addAll(getPostShareUser());
        return postUser;
    }

    public ArrayList<Post> getPostUser(String id) {
        ArrayList<Post> postUser = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(getPostUserByID);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                postUser.add(new PostUser(rs.getString(1), rs.getString(2),
                        rs.getNString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getInt(7), rs.getInt(8),
                        rs.getBoolean(9), rs.getNString(10),
                        rs.getString(11)));

            }
        } catch (Exception e) {
            System.out.println("dao.PostDAO.getPostUser()");
            e.printStackTrace();
        }
        return postUser;
    }

    public ArrayList<Post> getPostShareUser(String id) {
        ArrayList<Post> postUser = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(getPostShareUserByID);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                postUser.add(new PostShare(rs.getString(1), rs.getNString(2), rs.getString(3),
                        rs.getString(4), rs.getNString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getNString(9), rs.getString(10), rs.getNString(11),
                        rs.getString(12), rs.getInt(13), rs.getInt(14), rs.getBoolean(15), rs.getString(16)));
            }
        } catch (Exception e) {
            System.out.println("dao.PostDAO.getPostShareUser()");
            e.printStackTrace();
        }
        return postUser;
    }

    public ArrayList<Post> getPostPersonalPage(String id) {
        ArrayList<Post> postUser = new ArrayList<>();
        postUser.addAll(getPostUser(id));
        postUser.addAll(getPostShareUser(id));
        postUser.sort((o1, o2) -> o2.getTimePost().compareTo(o1.getTimePost()));
        postUser.forEach((t) -> {
            if (t instanceof PostUser) {
                System.out.println(((PostUser) t).toString());
            } else if (t instanceof PostShare) {
                System.out.println(((PostShare) t).toString());
            }
        });
        return postUser;
    }
}
