/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package connection;

/**
 *
 * @author 84384
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    private Connection cnn;

    public connection() {
        Config c = new Config();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://" + "DESKTOP-ULQ9JUL\\TCNJK:1433" + ";databaseName=" + c.databaseName + "; Encrypt=false;";
            Connection con = DriverManager.getConnection(connectionUrl, "sa", "lioooo0000");
            System.out.println("True at connection/ connect2");
            this.cnn = con;
        } catch (Exception e) {
            System.out.println("false at connection/ connect2");
            e.printStackTrace();
            cnn = null;
        }
        
    }

    public Connection getConnection() {

        return cnn;
    }

    public void closeConnection() throws Exception {
        cnn.close();
    }
}
