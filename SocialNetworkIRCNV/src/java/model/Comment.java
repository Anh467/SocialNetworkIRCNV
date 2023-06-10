package model;

public class Comment {

    private String NameUser, ImgUser, timeCmt, contentCmt, ImgCmt, IDcmt;
    private int numInter;

    public Comment(String NameUser, String ImgUser, String timeCmt, String contentCmt, int numInter, String ImgCmt, String IDcmt) {
        this.NameUser = NameUser;
        this.ImgUser = "/SocialNetworkIRCNV/"+ImgUser;
        this.timeCmt = timeCmt;
        this.contentCmt = contentCmt;
        this.numInter = numInter;
        this.ImgCmt="/SocialNetworkIRCNV/"+ImgCmt;
        this.IDcmt=IDcmt;
    }

    public String getIDcmt() {
        return IDcmt;
    }

    public void setIDcmt(String IDcmt) {
        this.IDcmt = IDcmt;
    }
    
    public Comment() {
    }

    public String getImgCmt() {
        return ImgCmt;
    }

    public void setImgCmt(String ImgCmt) {
        this.ImgCmt = ImgCmt;
    }
    
    public String getNameUser() {
        return NameUser;
    }

    public void setNameUser(String NameUser) {
        this.NameUser = NameUser;
    }

    public String getImgUser() {
        return ImgUser;
    }

    public void setImgUser(String ImgUser) {
        this.ImgUser = ImgUser;
    }

    public String getTimeCmt() {
        return timeCmt;
    }

    public void setTimeCmt(String timeCmt) {
        this.timeCmt = timeCmt;
    }

    public String getContentCmt() {
        return contentCmt;
    }

    public void setContentCmt(String contentCmt) {
        this.contentCmt = contentCmt;
    }

    public int getNumInter() {
        return numInter;
    }

    public void setNumInter(int numInter) {
        this.numInter = numInter;
    }
    
    
}
