/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author TCNJK
 */
public class ChangeRoleDAO {

    Connection cnn;

    public ChangeRoleDAO() {
        cnn = new connection().getConnection();
    }

    public boolean change(String id, String Roleid) {
        try {
            PreparedStatement ps;
            ps = cnn.prepareStatement("UPDATE dbo.UserInfor\n"
                    + "SET UserInfor.RoleID=?\n"
                    + "WHERE UserInfor.UserID=?");
            ps.setString(1, Roleid);
            ps.setString(2, id);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.err.println("DeleteUser UserReportDAO");
            e.printStackTrace();
        }
        return false;
    }
}
