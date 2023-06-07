/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unuse;

import java.util.ArrayList;
import model.PostUser;
import java.sql.*;

/**
 *
 * @author van12
 */
public class PersonalPostDAO {

    Connection cnn;

    PersonalPostDAO() {
        cnn = new connection.connection().getConnection();
    }

    String getPersonPost = "SELECT ImagePost, NumShare, PostID, UserID, Content, TimePost, NumInterface, NumComment, PublicPost\n"
            + "FROM dbo.POST\n"
            + "WHERE POST.UserID= ? \n"
            + "ORDER BY TimePost";

    public ArrayList<PostPersonalUser> getPersonPost(String id) {
        ArrayList<PostPersonalUser> postUserList = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement(getPersonPost);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                postUserList.add(new PostPersonalUser(rs.getString(1), Integer.parseInt(rs.getString(2)), rs.getString(3), rs.getString(3), rs.getString(4), rs.getString(5), Integer.parseInt(rs.getString(6)), Integer.parseInt(rs.getString(8)), rs.getBoolean(8)));
            }
        } catch (Exception e) {
            System.out.println("dao.PersonalPostDAO.getPersonPost()");
        }
        return postUserList;
    }
}
