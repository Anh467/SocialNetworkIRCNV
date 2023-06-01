/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;

/**
 *
 * @author van12
 */
public class ControlData {
    String pathForDb;
    Part part;
    String realPath;
    String realPathBuild;
    String filename;
    String projectRootPath;
//    public String getRootProject(ServletContext context) {
//
//        String projectPath = context.getRealPath("/");
//        int lastIndexOfWeb = projectPath.lastIndexOf("\\build");
////        String projectRootPath = projectPath.substring(0, lastIndexOfWeb) + "\\web";
//        return projectPath.substring(0, lastIndexOfWeb);
//    }

    public ControlData() {

    }

    public Part getPart() {
        return part;
    }

    public String getRealPath() {
        return realPath;
    }

    public String getRealPathBuild() {
        return realPathBuild;
    }

    public String getFilename() {
        return filename;
    }

    public String getProjectRootPath() {
        return projectRootPath;
    }

    public ControlData(Part part, String realPath, String realPathBuild, String filename, String projectRootPath) {
        this.part = part;
        this.realPath = realPath;
        this.realPathBuild = realPathBuild;
        this.filename = filename;
        this.projectRootPath = projectRootPath;
    }

    public ControlData(Part part, ServletContext context) {
        this.part = part;
        this.filename = Path.of(part.getSubmittedFileName()).getFileName().toString();
        String projectPath = context.getRealPath("/");
        int lastIndexOfWeb = projectPath.lastIndexOf("\\build");
        this.projectRootPath = projectPath.substring(0, lastIndexOfWeb);
    }
// chỉ khởi tạo 1 lần dành cho từng phần như lưu ảnh bài viết(post), ảnh đại diện(avatar), ảnh nền (backGround)
    public void createInitForPost(String PostID) {
        this.realPathBuild = projectRootPath + "\\build\\web\\data\\post\\" + PostID;
        this.realPath = projectRootPath + "\\web\\data\\post\\" + PostID;
        this.pathForDb= "data\\post\\"+ PostID;
    }

    public void createInitForAvatar(String UserID) {
        this.realPathBuild = projectRootPath + "\\build\\web\\data\\user\\" + UserID + "\\avatar";
        this.realPath = projectRootPath + "\\web\\data\\post\\" + UserID + "\\avatar";
        this.pathForDb= "data\\post\\" + UserID + "\\avatar";
    }

    public void createInitForBackGround(String UserID) {
        this.realPathBuild = projectRootPath + "\\build\\web\\data\\user\\" + UserID + "\\background";
        this.realPath = projectRootPath + "\\web\\data\\post\\" + UserID + "\\background";
        this.pathForDb= "data\\post\\" + UserID + "\\background";
    }

    //UserID
    //Content
    //ImagePost
    //PublicPost
// tạo folder
    public void creatFolder() throws Exception {
        //create folder
        if (!Files.exists(Path.of(this.realPath))) {
            Files.createDirectories(Path.of(this.realPath));
        }
        if (!Files.exists(Path.of(this.realPathBuild))) {
            Files.createDirectories(Path.of(this.realPathBuild));
        }
    }

    public void SaveImage() throws Exception {
        //part.write(realPath + "\\" + filename);
        //part.write(realPathBuild + "\\" + filename);
        //System.out.println("path: " + realPath + "\\" + filename);
        InputStream inputStream = this.part.getInputStream();
        OutputStream outputStream1 = new FileOutputStream(this.realPath + "\\" + this.filename);
        OutputStream outputStream2 = new FileOutputStream(this.realPathBuild + "\\" + this.filename);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream1.write(buffer, 0, length);
            outputStream2.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
