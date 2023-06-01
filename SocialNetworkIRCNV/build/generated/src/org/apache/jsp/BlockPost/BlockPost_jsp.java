package org.apache.jsp.BlockPost;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.Text;
import model.Comment;
import java.util.ArrayList;

public final class BlockPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--<meta charset=\"UTF-8\">-->\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./images/logo.png\" type=\"image/x-icon\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\r\n");
      out.write("              integrity=\"sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ==\"\r\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .dropdown-content {\r\n");
      out.write("                display: none;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                background-color: #f1f1f1;\r\n");
      out.write("                min-width: 160px;\r\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .dropdown-content a {\r\n");
      out.write("                color: black;\r\n");
      out.write("                padding: 12px 16px;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                display: block;\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .dropdown-content a:hover {\r\n");
      out.write("                background-color: #ddd;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .dropdown:hover .dropdown-content {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .dropdown:hover .dropbtn {\r\n");
      out.write("                background-color: #3e8e41;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top{\r\n");
      out.write("                display:flex;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                padding-bottom: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top .dp{\r\n");
      out.write("                width:60px;\r\n");
      out.write("                height:60px;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("                overflow:hidden;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top .dp > img{\r\n");
      out.write("\r\n");
      out.write("                cursor:pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top .post-info{\r\n");
      out.write("                margin-left:10px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top .post-info .name{\r\n");
      out.write("                cursor:pointer;\r\n");
      out.write("                font-size:23px;\r\n");
      out.write("                margin-bottom: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top .post-info .time{\r\n");
      out.write("                font-size:14px;\r\n");
      out.write("                cursor:pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top i{\r\n");
      out.write("                margin-left:auto;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-top > input{\r\n");
      out.write("                height:40px;\r\n");
      out.write("                padding:5px 10px;\r\n");
      out.write("                border-radius:25px;\r\n");
      out.write("                outline:none;\r\n");
      out.write("                border:none;\r\n");
      out.write("                flex:1;\r\n");
      out.write("                background:#eee;\r\n");
      out.write("                margin-left:10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-content{\r\n");
      out.write("                font-size:20px;\r\n");
      out.write("                font-weight:normal;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                max-height: 600px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-content > img{\r\n");
      out.write("                margin:5px 0px;\r\n");
      out.write("                max-height: 530px;\r\n");
      out.write("            }\r\n");
      out.write("            .post .counter{\r\n");
      out.write("                padding: 10px 10%;\r\n");
      out.write("                color: #00587c;\r\n");
      out.write("            }\r\n");
      out.write("            .post .counter{\r\n");
      out.write("                box-shadow: 1px solid #ddd;\r\n");
      out.write("                display:flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                padding:0 10%;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-family: sans-serif;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .post .post-bottom{\r\n");
      out.write("                box-shadow: 1px solid #ddd;\r\n");
      out.write("                display:flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                padding:0 10%;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("                font-family: sans-serif;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-bottom .action{\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                border-radius:10px;\r\n");
      out.write("                transition: .3s ease-in;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .post .post-bottom .action:hover{\r\n");
      out.write("                background:#eee;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Block Post</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" \r\n");
      out.write("              rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");

            Text text= new Text();
            String post_id = request.getParameter("post_id");
            String img_pro = request.getParameter("img_pro");
            //String name_user =text.changeUTF8(request.getParameter("uName"));
            String name_user =request.getParameter("uName");
            String timePost = request.getParameter("time");
            String Public = request.getParameter("Public").equalsIgnoreCase("true") ? "Public" : "Private";
            String Content = request.getParameter("content");
            String img_post = request.getParameter("img_post");
            String num_like = request.getParameter("num_like");
            String num_cmt = request.getParameter("num_cmt");
            String num_share = request.getParameter("num_share");
            request.setAttribute("img_post", img_post);
        
      out.write("\r\n");
      out.write("        <div class=\"post\" style=\"margin: 0px; \" id=\"");
      out.print(post_id);
      out.write("\">\r\n");
      out.write("            <div class=\"post-top\">\r\n");
      out.write("                <p style=\"display: none\">");
      out.print(post_id);
      out.write("</p>\r\n");
      out.write("                <div class=\"dp\" >\r\n");
      out.write("                    <img src=\"/SocialNetworkIRCNV/");
      out.print(img_pro);
      out.write("\" alt=\"\" style=\"width: 100%;\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"post-info\">\r\n");
      out.write("                    <p class=\"name\" style=\"color: #003140\">");
      out.print(name_user);
      out.write("</p>\r\n");
      out.write("                    <span class=\"time\" style=\"color: #70d8ff\">");
      out.print(timePost);
      out.write("</span>\r\n");
      out.write("                    <span class=\"time\" style=\"color: #003140\">");
      out.print(Public);
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <i class=\" dropdown fas fa-ellipsis-h\">\r\n");
      out.write("                    <div >\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"dropdown-content\">\r\n");
      out.write("                            <a href=\"#\" onclick=\"deletePost('");
      out.print(post_id);
      out.write("')\">Delete</a>\r\n");
      out.write("                            <a href=\"#\" onclick=\"\">Modify</a>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </i>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"post-content\" style=\"text-align: center;\">\r\n");
      out.write("                <p style=\"text-align: left;\">");
      out.print(Content);
      out.write("</p>\r\n");
      out.write("                ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img_post!=null && img_post!=''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('/');
          out.print(img_post);
          out.write("\"style=\"margin: 0 auto; width: 100%\"/>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"counter\">\r\n");
      out.write("                <div class=\"count-like\">\r\n");
      out.write("                    <span>");
      out.print(num_like);
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"count-cmt\">\r\n");
      out.write("                    <span>");
      out.print(num_cmt);
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"count-share\">\r\n");
      out.write("                    <span>");
      out.print(num_share);
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"post-bottom\" style=\" width: 90%; color:  #00abfd; border-top: 1px #00587c solid; margin-left: 5%; padding: 0 5%;\">\r\n");
      out.write("                <div class=\"action\">\r\n");
      out.write("                    <i class=\"far fa-thumbs-up\"></i>\r\n");
      out.write("                    <span>Like</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"action\">\r\n");
      out.write("                    <a href=\"#writecomment\" style=\"text-decoration: none; color:  #00abfd;\">\r\n");
      out.write("                        <i class=\"far fa-comment\"></i>\r\n");
      out.write("                        <span>Comment</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"action\">\r\n");
      out.write("                    <i class=\"fa fa-share\"></i>\r\n");
      out.write("                    <span>Share</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>  \r\n");
      out.write("                \r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
