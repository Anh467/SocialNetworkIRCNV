/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 84384
 */
public class Post {

    private String PostID, UserID, Content, timePost;
    private int NumInterface, NumComment;
    private boolean Public;
  

    public Post(String PostID, String UserID, String Content, String timePost, int NumInterface, int NumComment, boolean Public) {
        this.PostID = PostID;
        this.UserID = UserID;
        this.Content = Content;
        this.timePost = timePost;
        this.NumInterface = NumInterface;
        this.NumComment = NumComment;
        this.Public = Public;
    }
    
    public Post(String UserID, String Content,String Public){
        this.UserID= UserID;
        this.Content= Content;
        this.Public= this.Public;
    }
    public Post() {
    }

    public String getPostID() {
        return PostID;
    }

    public void setPostID(String PostID) {
        this.PostID = PostID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public int getNumInterface() {
        return NumInterface;
    }

    public void setNumInterface(int NumInterface) {
        this.NumInterface = NumInterface;
    }

    public int getNumComment() {
        return NumComment;
    }

    public void setNumComment(int NumComment) {
        this.NumComment = NumComment;
    }

    public boolean isPublic() {
        return Public;
    }

    public void setPublic(boolean Public) {
        this.Public = Public;
    }

    
}
