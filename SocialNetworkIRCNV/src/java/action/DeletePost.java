/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author van12
 */
@WebServlet(name = "DeletePost", urlPatterns = {"/DeletePost"})
public class DeletePost extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String PostID = request.getParameter("PostID");
        String Type = request.getParameter("Type");
        System.out.println("PostID: " + PostID);
        String UserID = (String) request.getSession().getAttribute("id");
        String role = (String) request.getSession().getAttribute("userRole");
        dao.PostUserDAO api = new dao.PostUserDAO();
        boolean checkExist= api.checkExistPostUser(PostID, UserID);
        try ( PrintWriter out = response.getWriter()) {
            if (Type.equalsIgnoreCase("Post")) {
                /* TODO output your page here. You may use following sample code. */
                if (checkExist || role.equals("Admin") || role.equals("Master Admin")) {
                    api.deletePost(PostID, UserID);
                    out.print("true");

                } else {
                    if(!checkExist)
                        out.print("You can't delete other post");
                    else
                    out.print("false");
                }

            } else if (Type.equalsIgnoreCase("Share")) {
                if (api.checkExistPostUser(PostID, UserID) || role.equals("Admin") || role.equals("Master Admin")) {
                    api.deletePostShare(PostID, UserID);
                    out.print("true");

                } else {
                    if(!checkExist)
                        out.print("You can't delete other post");
                    else
                    out.print("false");
                }
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
