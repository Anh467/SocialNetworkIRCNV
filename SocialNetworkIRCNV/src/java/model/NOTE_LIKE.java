/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import connection.connection;
import java.sql.Connection;
/**
 *
 * @author van12
 */
public class NOTE_LIKE extends NOTE{
    String ObjectID;
    String statusNote;
    String PostID;
    public NOTE_LIKE(String Note_ID, String ObjectID,String User_ID,  String statusNote, String time, boolean isRead, String PostID) {
        super(Note_ID, User_ID, time, isRead);
        this.ObjectID = ObjectID;
        this.statusNote = statusNote;
        this.PostID= PostID;
    }
//    public NOTE_LIKE(String Note_ID, String ObjectID,String User_ID,  String statusNote, String time, boolean isRead) {
//        super(Note_ID, User_ID, time, isRead);
//        this.ObjectID = ObjectID;
//        this.statusNote = statusNote;
//        this.PostID= PostID;
//    }
    public String getPostID() {
        return PostID;
    }

    public void setPostID(String PostID) {
        this.PostID = PostID;
    }

    public String getObjectID() {
        return ObjectID;
    }

    public void setObjectID(String ObjectID) {
        this.ObjectID = ObjectID;
    }

    public String getStatusNote() {
        return statusNote;
    }

    public void setStatusNote(String statusNote) {
        this.statusNote = statusNote;
    }
    //post
    //comment
    public String getStatus(String status){
        if(status.equals("post"))
            return " people have interacted with your post";
        if(status.equals("comment")){
            return " people have interacted with your comment ";
        }
            
        return "";
    }
    public String getDivIcon(String status, User user){
        return "<div class=\"name-box\">"+user.getFullName()+ "<i class=\"fa-sharp fa-solid fa-thumbs-up\"></i>"+" </div>\n";
    }
    public String getDiv() {
//       String href= this.ObjectID;
//       if(href.substring(0, 3).equalsIgnoreCase("CID"))
//           href= this.PostID;
       Connection cnn= new connection().getConnection();
        User user = new dao.UserDAO(cnn).getUserByID(this.getUser_ID());
        Post post = new dao.PostDAO().getPostByID(this.PostID);
        
//       if(this.ObjectID.substring(0, 3).equalsIgnoreCase("CID")){
//           href= new dao.
//       }
        return "<div class=\"friend-requests\" id=\""+super.getNote_ID()+"\" onclick=\"openPost('"+this.PostID+"')\">\n"
                + "                                <!-- Existing friend request boxes -->\n"
                + "\n"
                + "                                <div class=\"friend-box\" id=\"NoteID\">\n"
                
                + "                                    <div class=\"friend-profile\" style=\"background-image: url("+user.getImgUser()+");\"></div>\n"
                + getDivIcon(this.statusNote.trim(), user)
                + "                                    <div class=\"user-name-box\">"+super.getTime()+" <br> "+post.getNumInterface()+getStatus(this.statusNote.trim())+"</div>\n"
                + "                                    <div class=\"request-btn-row\" data-username=\"silvergoose115\">\n"
                + "\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>";
    }
}
