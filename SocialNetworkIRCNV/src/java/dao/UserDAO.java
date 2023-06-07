/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author 84384
 */
public class UserDAO {

    Connection cnn;

    public UserDAO() {
        cnn = new connection.connection().getConnection();
    }

    public ArrayList<User> getProfile() {
        ArrayList<User> profile = new ArrayList<>();
        String Query = "SELECT UserId,FullName, Address, Mail, PhoneNumber, Dob, Gender, Nation, ImageUser, ImageBackGround FROM  dbo.UserInfor ";
        try {
            PreparedStatement ps = cnn.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserID(rs.getString(1));
                user.setFullName(rs.getString(2));
                user.setGender(rs.getBoolean(3));
                user.setDOB(rs.getString(4));
                user.setAddress(rs.getString(5));
                user.setImgUser(rs.getString(6));
                user.setCoverImg(rs.getString(7));
                user.setMail(rs.getString(8));
                user.setNation(rs.getString(9));
                user.setPhoneNumber(rs.getString(10));
                profile.add(user);
            }
        } catch (Exception e) {
        }
        return profile;

    }

    public User getUserByID(String userId) {
        String Query = "SELECT UserID, FullName, Address, Mail, PhoneNumber, Dob, Gender, Nation, ImageUser, ImageBackGround FROM  dbo.UserInfor WHERE UserID = ?";
        try {
            PreparedStatement ps = cnn.prepareStatement(Query);
            ps.setString(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getNString(8), rs.getString(9),
                        rs.getString(10), rs.getString(1),
                        rs.getNString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getBoolean(7));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void updateInfo(User user) {
        String query = "update UserInfor set \n"
                + "FullName =  ? ,\n"
                + "Address =  ? ,\n"
                + "Mail = ? ,\n"
                + "PhoneNumber = ? ,\n"
                + "Dob = ? ,\n"
                + "Gender = ? ,\n"
                + "Nation =      ? \n"
                //                + "ImageUser = ? ,\n"
                //                + "ImageBackGround = ? \n"
                + "where UserID = ? ;";
//        String query1 = "update UserInfor set \n"
//                + "FullName = N'NgocAndepccccctraicc',\n"
//                + "Address =N'DaNang',\n"
//                + "Mail ='ngocan2002@gmail.com',\n"
//                + "PhoneNumber = '0945227000',\n"
//                + "Dob = '02-12-2002',\n"
//                + "Gender = 0,\n"
//                + "Nation =N'Hue',\n"
//                + "ImageUser = '',\n"
//                + "ImageBackGround = ''\n"
//                + "where UserID = 'UID00000001';";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setNString(1, user.getFullName());
            ps.setNString(2, user.getAddress());
            ps.setString(3, user.getMail());
            ps.setString(4, user.getPhoneNumber());
            ps.setString(5, user.getDOB());
            ps.setBoolean(6, user.isGender());
            ps.setNString(7, user.getNation());
//            ps.setString(8, user.getImgUser());
//            ps.setString(9, user.getCoverImg());
            ps.setString(8, user.getUserID());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("dao.UserDAO.updateInfo()");
            e.printStackTrace();
        }
    }

    public void updateAvatar(String filename, String UserID) {
        String query = "update UserInfor set ImageUser =  ? where UserID = ? ";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, filename);
            ps.setString(2, UserID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("dao.UserDAO.updateAvatar()");
            e.printStackTrace();
        }
    }

    public void updateBackground(String filename, String UserID) {
        String query = "update UserInfor set ImageBackGround =  ? where UserID = ? ";
        try {
            PreparedStatement ps = cnn.prepareStatement(query);
            ps.setString(1, filename);
            ps.setString(2, UserID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("dao.UserDAO.updateBackground()");
            e.printStackTrace();
        }
    }

}
