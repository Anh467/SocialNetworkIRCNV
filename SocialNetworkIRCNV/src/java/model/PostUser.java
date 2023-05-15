/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class PostUser extends Post{
    private String ImagePost;
    private int NumShare;

    public PostUser(String ImagePost, int NumShare, String PostID, String UserID, String Content, String timePost, int NumInterface, int NumComment, boolean Public) {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.ImagePost = ImagePost;
        this.NumShare = NumShare;
    }

    public PostUser() {
    }

    public String getImagePost() {
        return ImagePost;
    }

    public void setImagePost(String ImagePost) {
        this.ImagePost = ImagePost;
    }

    public int getNumShare() {
        return NumShare;
    }

    public void setNumShare(int NumShare) {
        this.NumShare = NumShare;
    }

    

    
    
}
