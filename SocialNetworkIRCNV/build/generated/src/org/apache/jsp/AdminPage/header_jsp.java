package org.apache.jsp.AdminPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header-area\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <!-- nav and search button -->\n");
      out.write("                    <div class=\"col-md-6 col-sm-8 clearfix\">\n");
      out.write("                        <div class=\"nav-btn pull-left\">\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"search-box pull-left\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" name=\"search\" placeholder=\"Search...\" required>\n");
      out.write("                                <i class=\"ti-search\"></i>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- profile info & task notification -->\n");
      out.write("                    <div class=\"col-md-6 col-sm-4 clearfix\">\n");
      out.write("                        <ul class=\"notification-area pull-right\">\n");
      out.write("                            <li id=\"full-view\"><i class=\"ti-fullscreen\"></i></li>\n");
      out.write("                            <li id=\"full-view-exit\"><i class=\"ti-zoom-out\"></i></li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <i class=\"ti-bell dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <span>2</span>\n");
      out.write("                                </i>\n");
      out.write("                                <div class=\"dropdown-menu bell-notify-box notify-box\">\n");
      out.write("                                    <span class=\"notify-title\">You have 3 new notifications <a href=\"#\">view all</a></span>\n");
      out.write("                                    <div class=\"nofity-list\">\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-key btn-danger\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>You have Changed Your Password</p>\n");
      out.write("                                                <span>Just Now</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-comments-smiley btn-info\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>New Commetns On Post</p>\n");
      out.write("                                                <span>30 Seconds ago</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-key btn-primary\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Some special like you</p>\n");
      out.write("                                                <span>Just Now</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-comments-smiley btn-info\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>New Commetns On Post</p>\n");
      out.write("                                                <span>30 Seconds ago</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-key btn-primary\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Some special like you</p>\n");
      out.write("                                                <span>Just Now</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-key btn-danger\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>You have Changed Your Password</p>\n");
      out.write("                                                <span>Just Now</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\"><i class=\"ti-key btn-danger\"></i></div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>You have Changed Your Password</p>\n");
      out.write("                                                <span>Just Now</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-envelope-o dropdown-toggle\" data-toggle=\"dropdown\"><span>3</span></i>\n");
      out.write("                                <div class=\"dropdown-menu notify-box nt-enveloper-box\">\n");
      out.write("                                    <span class=\"notify-title\">You have 3 new notifications <a href=\"#\">view all</a></span>\n");
      out.write("                                    <div class=\"nofity-list\">\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img1.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">Hey I am waiting for you...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img2.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">When you can connect with me...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img3.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">I missed you so much...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img4.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">Your product is completely Ready...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img2.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">Hey I am waiting for you...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img1.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">Hey I am waiting for you...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <a href=\"#\" class=\"notify-item\">\n");
      out.write("                                            <div class=\"notify-thumb\">\n");
      out.write("                                                <img src=\"assets/images/author/author-img3.jpg\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"notify-text\">\n");
      out.write("                                                <p>Aglae Mayer</p>\n");
      out.write("                                                <span class=\"msg\">Hey I am waiting for you...</span>\n");
      out.write("                                                <span>3:15 PM</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"settings-btn\">\n");
      out.write("                                <i class=\"ti-settings\"></i>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- header area end -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
