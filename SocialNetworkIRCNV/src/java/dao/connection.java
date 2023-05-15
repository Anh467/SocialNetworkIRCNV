/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package dao;

/**
 *
 * @author 84384
 */

import connect.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection {

    public Connection getConnection() {
        Config c= new Config();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://" + c.serverName + ";databaseName=" + c.databaseName + "; Encrypt=false;";
            Connection con = DriverManager.getConnection(connectionUrl, c.user, c.password);
            System.out.println("True at connection/ connect2");
            return con;
        } catch (Exception e) {
            System.out.println("false at connection/ connect2");
            e.printStackTrace();
        }
        return null;

    }
}
