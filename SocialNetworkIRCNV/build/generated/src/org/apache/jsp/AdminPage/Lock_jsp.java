package org.apache.jsp.AdminPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Lock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <form action=\"new_window.jsp\" method=\"GET\">\n");
      out.write("            <label for=\"day\">Ngày:</label>\n");
      out.write("            <input type=\"number\" id=\"day\" name=\"day\" min=\"0\" required value=\"0\"><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"hour\">Giờ:</label>\n");
      out.write("            <input type=\"number\" id=\"hour\" name=\"hour\" min=\"0\" max=\"23\" required value=\"0\"><br><br>\n");
      out.write("\n");
      out.write("            <label for=\"minute\">Phút:</label>\n");
      out.write("            <input type=\"number\" id=\"minute\" name=\"minute\" min=\"0\" max=\"59\" required value=\"0\"><br><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            const dayInput = document.getElementById('day');\n");
      out.write("            const hourInput = document.getElementById('hour');\n");
      out.write("            const minuteInput = document.getElementById('minute');\n");
      out.write("\n");
      out.write("            minuteInput.addEventListener('input', function () {\n");
      out.write("                if (parseInt(this.value) >= 60) {\n");
      out.write("                    hourInput.value = parseInt(hourInput.value) + Math.floor(parseInt(this.value) / 60);\n");
      out.write("                    this.value = parseInt(this.value) % 60;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            hourInput.addEventListener('input', function () {\n");
      out.write("                if (parseInt(this.value) >= 24) {\n");
      out.write("                    dayInput.value = parseInt(dayInput.value) + Math.floor(parseInt(this.value) / 24);\n");
      out.write("                    this.value = parseInt(this.value) % 24;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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
