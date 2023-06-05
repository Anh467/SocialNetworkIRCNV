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
import model.BoxChatFriend;
import model.FriendAndLastChat;
import model.FriendBoxChat;

/**
 *
 * @author TCNJK
 */
public class BoxChatFriendListDAO {

    Connection cnn;

    public BoxChatFriendListDAO() {
        cnn = new connection().getConnection();
    }

    public FriendBoxChat getBoxChat(String userID, String FriendID) {
        if (FriendID==null || FriendID.isBlank()) {
            return null;
        }
        FriendBoxChat box = new FriendBoxChat(userID, FriendID);
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT * FROM dbo.CHATCONTENT\n"
                    + "WHERE CHATCONTENT.UserID1=? AND CHATCONTENT.UserID2=?\n"
                    + "ORDER BY CHATCONTENT.CreateAt ASC");
            String user1 = userID, user2 = FriendID;
            if (user1.compareToIgnoreCase(user2) < 0) {
                String user = user1;
                user1 = user2;
                user2 = user;
            }
            ps.setString(1, user1);
            ps.setString(2, user2);

            ResultSet rs = ps.executeQuery();
            int i=0;
            while (rs.next()) {
                String chatID = rs.getString(2);
                String u1 = rs.getString(3);
                String mess = rs.getString(5);
                boolean first = rs.getBoolean(6);
                
                boolean ofYou = userID.equals(user2) ^ first;
                                //T T => F=Friend
                box.getList().put(i, mess);
                box.getListWho().put(i, ofYou);
                box.getListChatID().put(i++, chatID);
            }
            return box;

        } catch (Exception e) {
            System.err.println("model.API.PostStatistics");
            e.printStackTrace();
        }
        return null;
    }

    public BoxChatFriend getData(String userID) {
        BoxChatFriend data = new BoxChatFriend(userID);
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT T.UserID1, T.UserID2, T.Mess,T.ofUser1, T.CreateAt\n"
                    + "FROM (\n"
                    + "  SELECT \n"
                    + "    ID.UserID1,\n"
                    + "    ID.UserID2,\n"
                    + "    CHATCONTENT.Mess,\n"
                    + "    CHATCONTENT.ofUser1,\n"
                    + "    CHATCONTENT.CreateAt,\n"
                    + "    RANK() OVER (PARTITION BY ID.UserID1, ID.UserID2 ORDER BY CHATCONTENT.CreateAt DESC) AS Ranking\n"
                    + "  FROM dbo.CHATCONTENT\n"
                    + "  RIGHT JOIN (\n"
                    + "    SELECT USERRELATION.UserID1, USERRELATION.UserID2\n"
                    + "    FROM dbo.USERRELATION\n"
                    + "    WHERE USERRELATION.UserID1 = ? OR USERRELATION.UserID2 = ?\n"
                    + "  ) ID ON ID.UserID1 = CHATCONTENT.UserID1 AND ID.UserID2 = CHATCONTENT.UserID2\n"
                    + ") AS T\n"
                    + "WHERE T.Ranking = 1\n"
                    + "ORDER BY T.CreateAt DESC;");
            ps.setString(1, userID);
            ps.setString(2, userID);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String FriendID = rs.getString(1);
                boolean first = true;
                String mess = rs.getString(3);
                if (FriendID.equals(userID)) {
                    FriendID = rs.getString(2);
                    first = false;
                }
                boolean ofYou = rs.getBoolean(4) ^ first;

                data.getList().add(new FriendAndLastChat(FriendID, mess, true));
            }
            return data;

        } catch (Exception e) {
            System.err.println("model.API.PostStatistics");
            e.printStackTrace();
        }
        return null;
    }
}
