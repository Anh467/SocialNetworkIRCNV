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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.PostStatistics;

/**
 *
 * @author TCNJK
 */
public class PostStatisticsDAO {

    Connection cnn;

    public PostStatisticsDAO() {
        cnn = new connection().getConnection();
    }

    public List<PostStatistics> getData() {
        List<PostStatistics> list = new ArrayList<>();
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT * FROM (SELECT TOP 12 MonthDate, PostCount\n"
                    + "				FROM PostStatistics\n"
                    + "				ORDER BY MonthDate DESC) a\n"
                    + "ORDER BY a.MonthDate ASC;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate(1);
                LocalDate localDate = date.toLocalDate();
                int month = localDate.getMonthValue();
                int year = localDate.getYear();
                int number = rs.getInt(2);
                list.add(new PostStatistics(month+"/"+year%100, number));
            }
            return list;

        } catch (Exception e) {
            System.err.println("model.API.CheckLogin");
            e.printStackTrace();
        }
        return null;
    }
}
