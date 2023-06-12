/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class PostShare extends Post {
//UserIDOwnPost là người chủ của status mà được ng khác share

    private String UserIDownPost, nameUserDown, imgUserDown, timePostDown, contentDown,
            NameShare, img_UserShare;
    private String IDshare, img_post;

    public PostShare(String UserIDownPost, String nameUserDown, String imgUserDown,
            String timePostDown, String contentDown, String PostID, String IDshare, String UserID,
            String NameShare, String img_UserShare, String Content,
            String timePost, int NumInterface, int NumComment, String Public, String img_post) {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.UserIDownPost = UserIDownPost;
        this.nameUserDown = nameUserDown;
        this.imgUserDown = "/SocialNetworkIRCNV/" + imgUserDown;
        this.NameShare = NameShare;
        this.timePostDown = timePostDown;
        this.img_UserShare = "/SocialNetworkIRCNV/" + img_UserShare;
        this.contentDown = contentDown;
        this.IDshare = IDshare;
        this.img_post = "/SocialNetworkIRCNV/" + img_post;
    }

    public PostShare(String UserIDownPost, String nameUserDown, String imgUserDown,
            String timePostDown, String contentDown, String PostID, String IDshare, String UserID,
            String NameShare, String img_UserShare, String Content,
            String timePost, int NumInterface, int NumComment, String Public) {
        super(PostID, UserID, Content, timePost, NumInterface, NumComment, Public);
        this.UserIDownPost = UserIDownPost;
        this.nameUserDown = nameUserDown;
        this.imgUserDown = "/SocialNetworkIRCNV/" + imgUserDown;
        this.NameShare = NameShare;
        this.timePostDown = timePostDown;
        this.img_UserShare = "/SocialNetworkIRCNV/" + img_UserShare;
        this.contentDown = contentDown;
        this.IDshare = IDshare;
    }

    public String getImg_post() {
        return img_post;
    }

    public void setImg_post(String img_post) {
        this.img_post = img_post;
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

    public PostShare() {
    }

    public String getUserIDownPost() {
        return UserIDownPost;
    }

    public void setUserIDownPost(String UserIDOwnPost) {
        this.UserIDownPost = UserIDOwnPost;
    }

    @Override
    public String toString() {
        return super.toString() + "PostShare{" + "UserIDownPost=" + UserIDownPost + ", nameUserDown=" + nameUserDown + ", imgUserDown=" + imgUserDown + ", timePostDown=" + timePostDown + "\n, contentDown=" + contentDown + ", NameShare=" + NameShare + ", img_UserShare=" + img_UserShare + ", IDshare=" + IDshare + ", img_post=" + this.img_post + '}';
    }

    public String getDiv() {
        return "\n"
                + "\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    \n"
                + "    <body>\n"
                + "        <div class=\"share\"  style=\"margin: 10px; width: 700px;\" id=\""+this.IDshare+"\">\n"
                + "            <div class=\"share-head\">\n"
                + "                <div class=\"dp\" >\n"
                + "                    <img src=\""+this.img_UserShare+"\" alt=\"\" style=\"width: 100%;\" >\n"
                + "                </div>\n"
                + "                <div class=\"share-info\">\n"
                + "                    <p class=\"name\" style=\"color: #003140\">"+this.NameShare+"</p>\n"
                + "                    <span class=\"time\" style=\"color: #70d8ff\">"+this.getTimePost()+"</span>\n"
                + "                    <span class=\"time\" style=\"color: #003140\">"+this.getPrivacyName()+"</span>\n"
                + "                </div>\n"
                + "                <i class=\" dropdown fas fa-ellipsis-h\">\n"
                + "                    <div >\n"
                + "\n"
                + "                        <div class=\"dropdown-content\">\n"
                + "                            <a href=\"#\" onclick=\"deletePost('"+this.IDshare+"', 'Share')\">Delete</a>\n"
                + "                            <a href=\"#\" onclick=\"modifyPost('"+this.IDshare+"', '"+this.getImg_UserShare()+"', '"+this.getNameShare()+"', '"+this.getTimePostDown()+"',\n"
                + "                                            '"+this.getPrivacyName()+"', '"+this.getContent().trim()+"', '"+this.img_post+"')\">Modify</a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </i>\n"
                + "\n"
                + "            </div>\n"
                + "            <div class=\"share-content\">\n"
                + "                "+this.getContent().trim()+"\n"
                + "            </div>\n"
                + "            <div class=\"share-body\">\n"
                + "                <div class=\"share-top\" >\n"
                + "                    <div class=\"dp\" >\n"
                + "                        <img src=\""+this.getImgUserDown()+"\" alt=\"\" style=\"width: 100%;\" >\n"
                + "                    </div>\n"
                + "                    <div class=\"share-info\">\n"
                + "                        <p class=\"name\" style=\"color: #003140\">"+this.getNameUserDown()+"</p>\n"
                + "                        <span class=\"time\" style=\"color: #70d8ff\">"+this.getTimePostDown()+"</span>\n"
                + "                    </div>\n"
                + "\n"
                + "                </div>\n"
                + "\n"
                + "                <div class=\"share-content\" style=\"text-align: center;\" >\n"
                + "                    <p style=\"text-align: left;\">"+this.getContentDown().trim()+"</p>\n"
                + "                    <img style=\"max-width: 100%\" src=\""+this.getImg_post()+"\" />\n"
                + "                </div>\n"
                + "            </div> \n"
                + "\n"
                + "            <div class=\"counter\">\n"
                + "                <div class=\"count-like\">\n"
                + "                    <span>"+this.getNumInterface()+"</span>\n"
                + "                </div>\n"
                + "                <div class=\"count-cmt\">\n"
                + "                    <span>"+this.getNumComment()+"</span>\n"
                + "                </div>\n"
                + "                <div class=\"count-share\">\n"
                + "                    <span>"+"</span>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "            <div class=\"share-bottom\" style=\" width: 90%; color:  #00abfd; border-top: 1px #00587c solid; margin-left: 5%; padding: 0 5%;\">\n"
                + "                <div class=\"action\">\n"
                + "                    <i class=\"far fa-thumbs-up\"></i>\n"
                + "                    <span>Like</span>\n"
                + "                </div>\n"
                + "                <div class=\"action\">\n"
                + "                    <a href=\"#writecomment-share\" style=\"text-decoration: none; color:  #00abfd;\">\n"
                + "                        <i class=\"far fa-comment\"></i>\n"
                + "                        <span>Comment</span>\n"
                + "                    </a>\n"
                + "                </div>\n"
                + "                <div class=\"action\" onclick=\"SharePost('"+this.getPostID()+"', '"+this.getImgUserDown()+"', '"+this.getNameUserDown()+"', '"+this.getContentDown().trim()+"', '"+this.getImg_post()+"')\">\n"
                + "                    <i class=\" dropdown fa fa-share\">\n"
                + "                        <span>Share</span>\n"
                + "                    </i>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </div>\n"
                + "\n"
                + "    </body>\n"
                + "</html>";
    }
}
