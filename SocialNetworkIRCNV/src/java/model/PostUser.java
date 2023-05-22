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
    private String ImagePost, FullNameUser, ImgUser;
    private int NumShare;

    public PostUser(String PostID, String UserID, String Content, String ImagePost, String timePost, int NumInterface,
              int NumComment, int NumShare, boolean Public, String FullNameUser, String ImgUser) {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.ImagePost = ImagePost;
        this.NumShare = NumShare;
        this.ImgUser = ImgUser;
        this.FullNameUser = FullNameUser;
    }

    public String getFullNameUser() {
        return FullNameUser;
    }

    public void setFullNameUser(String FullNameUser) {
        this.FullNameUser = FullNameUser;
    }

    public String getImgUser() {
        return ImgUser;
    }

    public void setImgUser(String ImgUser) {
        this.ImgUser = ImgUser;
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

    
    @Override
    public String toString() {
        return "PostUser{" +"ImagePost=" + super.getPostID()+ super.isPublic() + super.getContent() + ImagePost + ", NumShare=" + NumShare + '}';
    }
    
    
}
