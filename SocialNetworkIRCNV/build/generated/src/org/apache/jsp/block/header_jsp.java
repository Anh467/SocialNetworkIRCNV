package org.apache.jsp.block;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            nav{\r\n");
      out.write("                height:70px;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                padding: 0 2rem;\r\n");
      out.write("                position: sticky;\r\n");
      out.write("                display:flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                background-color: #fff;\r\n");
      out.write("                box-shadow: 0px 1px 3px #ccc;\r\n");
      out.write("                top:0;\r\n");
      out.write("                z-index:99;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-left, nav .nav-right{\r\n");
      out.write("                display:flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-left  img{\r\n");
      out.write("                width:40px;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-left  input{\r\n");
      out.write("                height:40px;\r\n");
      out.write("                padding:5px 10px;\r\n");
      out.write("                border:none;\r\n");
      out.write("                border-radius: 25px;\r\n");
      out.write("                outline:none;\r\n");
      out.write("                background-color: #eee;\r\n");
      out.write("                margin-left: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-middle{\r\n");
      out.write("                display:flex;\r\n");
      out.write("                align-items:flex-end;\r\n");
      out.write("                padding-bottom: 5px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-middle a{\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color:#333;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                margin:0px 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-middle a.active{\r\n");
      out.write("                color:royalblue;\r\n");
      out.write("                position:relative;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-middle a.active::after{\r\n");
      out.write("                content:'';\r\n");
      out.write("                width:100%;\r\n");
      out.write("                height:3px;\r\n");
      out.write("                position:absolute;\r\n");
      out.write("                bottom:0;\r\n");
      out.write("                left:0;\r\n");
      out.write("                background:royalblue;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-middle a > i{\r\n");
      out.write("                font-size: 25px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-right .profile img, .container .left-panel .profile img{\r\n");
      out.write("                height:40px;\r\n");
      out.write("                width:40px;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-right a{\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color:#333;\r\n");
      out.write("                height:40px;\r\n");
      out.write("                width:40px;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                background:#eee;\r\n");
      out.write("                display:grid;\r\n");
      out.write("                place-items: center;\r\n");
      out.write("                margin-left:1rem;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav .nav-right a > i{\r\n");
      out.write("                font-size:18px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
 String id = (String) session.getAttribute("id");
            if (id == null || id.equals("")) {
                response.sendRedirect("http://localhost:8080/SocialNetworkIRCNV/Authen/login.jsp");
                return;
            }
        
      out.write("\r\n");
      out.write("        <nav style=\"background-color: #70d8ff; min-width: 1045px;\">\r\n");
      out.write("            <div class=\"nav-left\">\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/HomePage/HomePage.jsp\">\r\n");
      out.write("                    <img src=\"../data/img/logo.jpg\" alt=\"Logo\">\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <input type=\"text\" placeholder=\"Search Mediabook..\">\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/GetInfor", out, false);
      out.write("\r\n");
      out.write("            ");
 User user = (User) request.getAttribute("user");
                if (user != null) {
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"nav-right\">\r\n");
      out.write("                <span class=\"profile\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PersonalPage/ProfileInfo.jsp    \">\r\n");
      out.write("                        <img src=\"/SocialNetworkIRCNV/");
      out.print(user.getImgUser());
      out.write("\" alt=\"alt\" style=\"width: 100%;\"/>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <a href=\"../BoxChat/GetFriendAndBoxChat\">\r\n");
      out.write("                    <i class=\"fas fa-comments\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <form action=\"http://localhost:8080/SocialNetworkIRCNV/CheckLogin\" method=\"post\">\r\n");
      out.write("                    <button type=\"submit\" style=\"background: none; border: none\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa-solid fa-right-from-bracket\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fas fa-ellipsis-h\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

            } else {

            
      out.write("\r\n");
      out.write("            <div class=\"nav-right\">\r\n");
      out.write("                <span class=\"profile\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Authen/login.jsp\">\r\n");
      out.write("                        <i class=\"fa-solid fa-user\">\r\n");
      out.write("                            <img src=\"https://e7.pngegg.com/pngimages/178/595/png-clipart-user-profile-computer-icons-login-user-avatars-monochrome-black.png\" alt=\"alt\" style=\"width: 100%;\"/>\r\n");
      out.write("                        </i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fas fa-comments\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fas fa-ellipsis-h\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
                }
            
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
