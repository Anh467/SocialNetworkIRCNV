package org.apache.jsp.Authen;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Autofocus Field</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"otp.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            height: 100vh;\n");
      out.write("            background: #000000; /* fallback for old browsers */\n");
      out.write("            background: - webkit - linear - gradient(to right, #434343, #000000); /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("            background: linear - gradient(to right, #434343, #000000); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container{\n");
      out.write("            display: flex;\n");
      out.write("            flex-flow: column;\n");
      out.write("            height: 100% ;\n");
      out.write("            align-items: space - around;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .userInput{\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input{\n");
      out.write("            margin: 10px;\n");
      out.write("            height: 35px;\n");
      out.write("            width: 65px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: arimo;\n");
      out.write("            font-size: 1.2rem;\n");
      out.write("            background: #eef2f3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1{\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: arimo;\n");
      out.write("            color: honeydew;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        button{\n");
      out.write("            width: 150px;\n");
      out.write("            height: 40px;\n");
      out.write("            margin: 25px auto 0px auto;\n");
      out.write("            font-family: arimo;\n");
      out.write("            font-size: 1.1rem;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            background: #616161; /* fallback for old browsers */\n");
      out.write("            background: - webkit - linear - gradient(to right, #9bc5c3, #616161); /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("            background: linear - gradient(to right, #9bc5c3, #616161); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function clickEvent(first, last) {\n");
      out.write("                if (first.value.length) {\n");
      out.write("                    document.getElementById(last).focus();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>ENTER OTP</h1>\n");
      out.write("                <div class=\"userInput\">\n");
      out.write("                    <input type=\"text\" id='ist' maxlength=\"1\" onkeyup=\"clickEvent(this, 'sec')\">\n");
      out.write("                    <input type=\"text\" id=\"sec\" maxlength=\"1\" onkeyup=\"clickEvent(this, 'third')\">\n");
      out.write("                    <input type=\"text\" id=\"third\" maxlength=\"1\" onkeyup=\"clickEvent(this, 'fourth')\">\n");
      out.write("                    <input type=\"text\" id=\"fourth\" maxlength=\"1\" onkeyup=\"clickEvent(this, 'fifth')\">\n");
      out.write("                    <input type=\"text\" id=\"fifth\" maxlength=\"1\" onkeyup=\"clickEvent(this, 'sixth')\">\n");
      out.write("                    <input type=\"text\" id=\"sixth\" maxlength=\"1\" onkeyup=\"clickEvent(this, 'seventh')\">\n");
      out.write("                    <input type=\"text\" id=\"seventh\" maxlength=\"1\">\n");
      out.write("                </div>\n");
      out.write("                <button>CONFIRM</button>\n");
      out.write("            </div>\n");
      out.write("        </body>\n");
      out.write("    </html>");
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
