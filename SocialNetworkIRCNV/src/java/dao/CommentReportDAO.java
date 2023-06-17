/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.CommentReport;

/**
 *
 * @author TCNJK
 */
public class CommentReportDAO {

    Connection cnn;

    public CommentReportDAO() {
        cnn = new connection().getConnection();
    }

    public List<CommentReport> getData() {
        List<CommentReport> list = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT * FROM ReportCommentView");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String pid = rs.getString(1);
                boolean ipost = rs.getBoolean(2);
                String img = rs.getString(3);
                String content = rs.getString(4);
                int num = rs.getInt(5);
                Date time = rs.getDate(6);
                int status = rs.getInt(8);
                if (status == 1) {
                    list.add(new CommentReport(pid, ipost, img, content, num, time));
                }
            }
            return list;

        } catch (Exception e) {
            System.err.println("getData CommentReportDAO");
            e.printStackTrace();
        }
        return null;
    }

    public void UpdateSkip(String id, boolean isPost) {
        try {
            PreparedStatement ps = cnn.prepareStatement("UPDATE dbo.ReportComment1686\n"
                    + "SET ReportComment1686.Status = 0\n"
                    + "WHERE ReportComment1686.CommentID=? AND ReportComment1686.IsPost=?");
            ps.setString(1, id);
            ps.setBoolean(2, isPost);
            ps.executeUpdate();
            return;

        } catch (Exception e) {
            System.err.println("UpdateSkip CommentReportDAO");
            e.printStackTrace();
        }
    }
}
