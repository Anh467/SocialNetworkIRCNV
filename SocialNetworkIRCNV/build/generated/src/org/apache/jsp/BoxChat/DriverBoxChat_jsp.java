package org.apache.jsp.BoxChat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DriverBoxChat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>DriverBoxChat</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"#\" id=\"loadBoxChat\">\n");
      out.write("            <i class=\"fas fa-comments\"></i>\n");
      out.write("        </a>\n");
      out.write("        <script>\n");
      out.write("            document.querySelector('a[href=\"#\"]').addEventListener('click', function (event) {\n");
      out.write("                event.preventDefault(); // Ngăn chặn hành vi mặc định của liên kết\n");
      out.write("\n");
      out.write("                // Gọi SmallBoxChat.jsp\n");
      out.write("                fetch('../BoxChat/SmallBoxChat.jsp')\n");
      out.write("                        .then(function (response) {\n");
      out.write("                            return response.text();\n");
      out.write("                        })\n");
      out.write("                        .then(function (data) {\n");
      out.write("                            // Chèn nội dung vào trang hiện tại\n");
      out.write("                            var div = document.createElement('div');\n");
      out.write("                            div.innerHTML = data;\n");
      out.write("                            document.body.appendChild(div);\n");
      out.write("\n");
      out.write("                            // Thực thi các chức năng trong SmallBoxChat.jsp (nếu có)\n");
      out.write("                            // ... (Thêm mã JavaScript cho chức năng của SmallBoxChat.jsp)\n");
      out.write("                        })\n");
      out.write("                        .catch(function (error) {\n");
      out.write("                            console.log('Lỗi khi tải SmallBoxChat.jsp:', error);\n");
      out.write("                        });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
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
