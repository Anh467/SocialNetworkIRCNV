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
    private String UserIDownPost, nameUserDown, imgUserDown, timePostDown, contentDown,
            NameShare, img_UserShare;
    private String img_postshare, IDshare;
    private int NumShare;

    public PostShare(String UserIDownPost, String nameUserDown, String imgUserDown, 
            String timePostDown, String contentDown, String PostID, String IDshare, String UserID, 
            String NameShare, String img_UserShare, String Content, String img_postshare, 
            String timePost, int NumInterface, int NumComment, int NumShare, boolean Public) 
    {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.UserIDownPost = UserIDownPost;
        this.img_postshare= img_postshare;
        this.nameUserDown=nameUserDown;
        this.imgUserDown=imgUserDown;
        this.NameShare=NameShare;
        this.NumShare=NumShare;
        this.timePostDown=timePostDown;
        this.img_UserShare=img_UserShare;
        this.contentDown=contentDown;
        this.IDshare=IDshare;
    }

    public String getIDshare() {
        return IDshare;
    }

    public void setIDshare(String IDshare) {
        this.IDshare = IDshare;
    }

    public String getNameUserDown() {
        return nameUserDown;
    }

    public void setNameUserDown(String nameUserDown) {
        this.nameUserDown = nameUserDown;
    }

    public String getImgUserDown() {
        return imgUserDown;
    }

    public void setImgUserDown(String imgUserDown) {
        this.imgUserDown = imgUserDown;
    }

    public String getTimePostDown() {
        return timePostDown;
    }

    public void setTimePostDown(String timePostDown) {
        this.timePostDown = timePostDown;
    }

    public String getContentDown() {
        return contentDown;
    }

    public void setContentDown(String contentDown) {
        this.contentDown = contentDown;
    }

    public String getNameShare() {
        return NameShare;
    }

    public void setNameShare(String NameShare) {
        this.NameShare = NameShare;
    }

    public String getImg_UserShare() {
        return img_UserShare;
    }

    public void setImg_UserShare(String img_UserShare) {
        this.img_UserShare = img_UserShare;
    }

    public int getNumShare() {
        return NumShare;
    }

    public void setNumShare(int NumShare) {
        this.NumShare = NumShare;
    }
    
    public String getImg_postshare() {
        return img_postshare;
    }

    public void setImg_postshare(String img_postshare) {
        this.img_postshare = img_postshare;
    }

    public PostShare() {
    }

    public String getUserIDownPost() {
        return UserIDownPost;
    }

    public void setUserIDownPost(String UserIDOwnPost) {
        this.UserIDownPost = UserIDOwnPost;
    }

   
    
}
