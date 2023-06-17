package org.apache.jsp.AdminPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserReports_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/images/icon/favicon.ico\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/metisMenu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\">\n");
      out.write("        <!-- amchart css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- others css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/typography.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/default-css.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("        <!-- modernizr css -->\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebarMenu.jsp", out, false);
      out.write("\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("        <!-- jquery latest version -->\n");
      out.write("        <script src=\"assets/js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("        <!-- bootstrap 4 js -->\n");
      out.write("        <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/metisMenu.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- start chart js -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js\"></script>\n");
      out.write("        <!-- start highcharts js -->\n");
      out.write("        <script src=\"https://code.highcharts.com/highcharts.js\"></script>\n");
      out.write("        <script src=\"https://code.highcharts.com/modules/exporting.js\"></script>\n");
      out.write("        <script src=\"https://code.highcharts.com/modules/export-data.js\"></script>\n");
      out.write("        <!-- start amcharts -->\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/amcharts.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/ammap.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/maps/js/worldLow.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/serial.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/plugins/export/export.min.js\"></script>\n");
      out.write("        <script src=\"https://www.amcharts.com/lib/3/themes/light.js\"></script>\n");
      out.write("        <!-- all line chart activation -->\n");
      out.write("        <!--<script src=\"assets/js/line-chart.js\"></script>-->\n");
      out.write("        <script src=\"scriptst.js\"></script>\n");
      out.write("        <!-- all pie chart -->\n");
      out.write("        <script src=\"assets/js/pie-chart.js\"></script>\n");
      out.write("        <!-- all bar chart -->\n");
      out.write("        <script src=\"assets/js/bar-chart.js\"></script>\n");
      out.write("        <!-- all map chart -->\n");
      out.write("        <script src=\"assets/js/maps.js\"></script>\n");
      out.write("        <!-- others plugins -->\n");
      out.write("        <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
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
