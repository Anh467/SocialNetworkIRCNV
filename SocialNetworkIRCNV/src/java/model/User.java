/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

/**
 *
 * @author 84384
 */
public class User extends Person{

    private String Nation, imgUser, coverImg;

    public User() {
    }

    public User(String FullName, String Mail, String DOB, boolean Gender) {
        super(FullName, Mail, DOB, Gender);
    }

    public User(String Nation, String imgUser) {
        this.Nation = Nation;
        this.imgUser = imgUser;
        
    }

    public User(String Nation, String imgUser, String UserID, String FullName, String Address, String Mail, String PhoneNumber, String DOB, boolean Gender) {
        super(UserID, FullName, Address, Mail, PhoneNumber, DOB, Gender);
        this.Nation = Nation;
        this.imgUser = imgUser;
    }

    public User(String Nation, String imgUser, String coverImg, String UserID, String FullName, String Address, String Mail, String PhoneNumber, String DOB, boolean Gender) {
        super(UserID, FullName, Address, Mail, PhoneNumber, DOB, Gender);
        this.Nation = Nation;
        this.imgUser = imgUser;
        this.coverImg = coverImg;
    }
    
    public String getNation() {
        return Nation;
    }

    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    public String getImgUser() {
        return imgUser;
    }

    public void setImgUser(String imgUser) {
        this.imgUser = imgUser;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }
    
    
}
