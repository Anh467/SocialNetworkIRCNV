/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package action;

import controller.ControlData;
import controller.Text;
import java.util.Date;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.PostUser;
import model.User;

/**
 *
 * @author van12
 */
@MultipartConfig
@WebServlet(name = "NewPost", urlPatterns = {"/NewPost"})
public class NewPost extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void saveFile(Part part, String realPath) {

    }

    //UserID
    //Content
    //ImagePost
    //PublicPost
    public String addNewPost(String UserID, String Content, String ImagePost, String PublicPost) {
        if (PublicPost == null) {
            PublicPost = "1";
        } else if (PublicPost.equalsIgnoreCase("Public")) {
            PublicPost = "1";
        } else {
            PublicPost = "0";
        }
        return new dao.PostUserDAO().newPost(UserID, Content, ImagePost, PublicPost);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                Text text= new Text();
                //
                HttpSession session = request.getSession();
                String id = (String) session.getAttribute("id");
                
                String content = text.changeUTF8(request.getParameter("content"));
                String isPublic = request.getParameter("privacy");
                //get path image
                Part part = request.getPart("photo");
                String PostID = "";
                if (part != null && part.getSubmittedFileName()!=null) {
                    //khởi tạo controldata
                    ControlData data = new ControlData(part, getServletContext());
                    // save to db
                    PostID = addNewPost(id, content, data.getFilename(), isPublic);
                    //khowri tao cho viec bai post
                    data.createInitForPost(PostID);
                    //create folder
                    data.creatFolder();
                    // save image
                    data.SaveImage();
                    System.out.println("path: " + data.getRealPath());
                }
                else PostID = addNewPost(id, content, "", isPublic);
                //respone
//                String publicpost = isPublic.endsWith("1") ? "Public" : "Private";
                User user = new dao.UserDAO().getUserByID(id);
                PostUser postUser = new dao.PostUserDAO().getPost(PostID);
//                String pathImg = "http://localhost:8080/SocialNetworkIRCNV/data/post/" + postUser.getImagePost();
                out.println("<div class=\"post\" style=\"margin: 0px;\" id=\"" + postUser.getPostID() + "\">\n"
                        + "            <div class=\"post-top\">\n"
                        + "                <div class=\"dp\" >\n"
                        + "                    <img src='/SocialNetworkIRCNV/" + user.getImgUser() + "' alt=\"\" style=\"width: 100%;\" >\n"
                        + "                </div>\n"
                        + "                <div class=\"post-info\">\n"
                        + "                    <p class=\"name\" style=\"color: #003140\">" + user.getFullName() + "</p>\n"
                        + "                    <span class=\"time\" style=\"color: #70d8ff\">" + postUser.getTimePost() + "</span>\n"
                        + "                     <span class=\"time\" style=\"color: #003140\">" + ((postUser.isPublic() == true) ? "Public" : "private") + "</span>"
                        + "                </div>\n"
                        + "                 <i class=\" dropdown fas fa-ellipsis-h\">\n"
                        + "                    <div >\n"
                        + "                        \n"
                        + "                        <div class=\"dropdown-content\">\n"
                        + "                            <a href=\"#\" onclick=\"deletePost('" + postUser.getPostID() + "')\">Delete</a>\n"
                        + "                            <a href=\"#\" onclick=\"\">Modify</a>\n"
                        + "                            \n"
                        + "                        </div>\n"
                        + "                    </div>\n"
                        + "                </i>"
                        + "               "
                        + "            </div>\n"
                        + "\n"
                        + "            <div class=\"post-content\" style=\"text-align: center;\">\n"
                        + "                <p style=\"text-align: left;\">" + postUser.getContent() + "</p>\n"
                        + "                <img src='/SocialNetworkIRCNV/" + postUser.getImagePost() + "' style=\"width: 100%;margin: 0 auto;\"/>\n"
                        + "            </div>\n"
                        + "            <div class=\"counter\">\n"
                        + "                <div class=\"count-like\">\n"
                        + "                    <span>" + postUser.getNumInterface() + "</span>\n"
                        + "                </div>\n"
                        + "                <div class=\"count-cmt\">\n"
                        + "                    <span>" + postUser.getNumComment() + "</span>\n"
                        + "                </div>\n"
                        + "                <div class=\"count-share\">\n"
                        + "                    <span>" + postUser.getNumShare() + "</span>\n"
                        + "                </div>\n"
                        + "            </div>\n"
                        + "               \n"
                        + "            \n"
                        + "            <div class=\"post-bottom\" style=\" width: 90%; color:  #00abfd; border-top: 1px #00587c solid; margin-left: 5%; padding: 0 5%;\">\n"
                        + "                <div class=\"action\">\n"
                        + "                    <i class=\"far fa-thumbs-up\"></i>\n"
                        + "                    <span>Like</span>\n"
                        + "                </div>\n"
                        + "                <div class=\"action\">\n"
                        + "                    <a href=\"#writecomment\" style=\"text-decoration: none; color:  #00abfd;\">\n"
                        + "                        <i class=\"far fa-comment\"></i>\n"
                        + "                        <span>Comment</span>\n"
                        + "                    </a>\n"
                        + "                </div>\n"
                        + "                <div class=\"action\">\n"
                        + "                    <i class=\"fa fa-share\"></i>\n"
                        + "                    <span>Share</span>\n"
                        + "                </div>\n"
                        + "            </div>"
                        + "</div>");
            } catch (Exception e) {
                System.out.println("action.Upload.doPost()");
                e.printStackTrace();
                request.getRequestDispatcher("nonice.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
