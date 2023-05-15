/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class PostShare extends Post{
//UserIDOwnPost là người chủ của status mà được ng khác share
    private String UserIDOwnPost;

    public PostShare(String UserIDOwnPost, String PostID, String UserID, String Content, String timePost, int NumInterface, int NumComment, boolean Public) {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.UserIDOwnPost = UserIDOwnPost;
    }

    public PostShare() {
    }

    public String getUserIDOwnPost() {
        return UserIDOwnPost;
    }

    public void setUserIDOwnPost(String UserIDOwnPost) {
        this.UserIDOwnPost = UserIDOwnPost;
    }

   
    
}
