package org.apache.jsp.AdminPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import dao.Admin_UserManageDAO;
import model.Admin_UserManage;

public final class AdminManage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Admin_UserManage elem;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\" lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Datatable - Admin Manage</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/images/icon/favicon.ico\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/metisMenu.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\">\r\n");
      out.write("        <!-- amcharts css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("        <!-- Start datatable css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css\">\r\n");
      out.write("        <!-- style css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/typography.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/default-css.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\r\n");
      out.write("        <!-- modernizr css -->\r\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebarMenu.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- main content area start -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- page title area start -->\r\n");
      out.write("            <div class=\"page-title-area\">\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("                        <div class=\"breadcrumbs-area clearfix\">\r\n");
      out.write("                            <h4 class=\"page-title pull-left\">Admin Manage</h4>\r\n");
      out.write("                            <ul class=\"breadcrumbs pull-left\">\r\n");
      out.write("                                <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                                <li><span>Admin Manage</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminInfoInAnyPage.jsp", out, false);
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- page title area end -->\r\n");
      out.write("            <div class=\"main-content-inner\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Primary table start -->\r\n");
      out.write("                    <div class=\"col-11 mt-5\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h4 class=\"header-title\">Data Table Primary</h4>\r\n");
      out.write("                                <div class=\"data-tables datatable-primary\">\r\n");
      out.write("                                    <table id=\"dataTable2\" class=\"text-center\">\r\n");
      out.write("                                        <thead class=\"text-capitalize\">\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>Image</th>\r\n");
      out.write("                                                <th>FullName</th>\r\n");
      out.write("                                                <th>Address</th>\r\n");
      out.write("                                                <th>Mail</th>\r\n");
      out.write("                                                <th>Account</th>\r\n");
      out.write("                                                <th>PhoneNumber</th>\r\n");
      out.write("                                                <th>DOB</th>\r\n");
      out.write("                                                <th>Nation</th>\r\n");
      out.write("                                                <th>Role</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                        ");
      out.write("\r\n");
      out.write("                                        ");
 Admin_UserManageDAO e = new Admin_UserManageDAO();
                                            List<Admin_UserManage> list = e.getData();
                                            for (Admin_UserManage elem : list) {
                                        
      out.write("\r\n");
      out.write("                                        <tr class=\"");
      out.print( elem.getUserID());
      out.write("\">\r\n");
      out.write("                                            <td class=\"user-image\"><img style=\"width: 50px;\" src=\"");
      out.print( elem.getImageUser());
      out.write("\" alt=\"Không Có Ảnh\"></td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getFullName());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getAddress());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getMail());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getAccount());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getPhoneNumber());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getDob());
      out.write("</td>\r\n");
      out.write("                                            <td>");
      out.print( elem.getNation());
      out.write("</td>\r\n");
      out.write("                                            <td>\r\n");
      out.write("                                                <div class=\"btn-group\">\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-light roleButton_");
      out.print(elem.getUserID());
      out.write('"');
      out.write('>');
      out.print( elem.getRoleID());
      out.write("</button>\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-light dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\">\r\n");
      out.write("                                                        <span class=\"sr-only\">Toggle Dropdown</span>\r\n");
      out.write("                                                    </button>\r\n");
      out.write("                                                    <div class=\"dropdown-menu\">\r\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\" onclick=\"changeRole('");
      out.print( elem.getUserID());
      out.write("', 'USER')\">USER</a>\r\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\" onclick=\"changeRole('");
      out.print( elem.getUserID());
      out.write("', 'ADMIN')\">ADMIN</a>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    <script>\r\n");
      out.write("\r\n");
      out.write("                                        function skipRow(link, id) {\r\n");
      out.write("                                            var row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn\r\n");
      out.write("                                            row = row.parentNode;\r\n");
      out.write("                                            if (row !== null) {\r\n");
      out.write("                                                row = row.parentNode;\r\n");
      out.write("                                                if (row !== null) {\r\n");
      out.write("                                                    row = row.parentNode;\r\n");
      out.write("                                                    if (row !== null) {\r\n");
      out.write("                                                        var oldRow = row;\r\n");
      out.write("                                                        row = row.previousElementSibling;\r\n");
      out.write("                                                        if (row !== null) {\r\n");
      out.write("                                                            if (row.nodeName === 'TR') {\r\n");
      out.write("                                                                oldRow.remove();\r\n");
      out.write("                                                                row.remove();\r\n");
      out.write("                                                                alert('Thành công');\r\n");
      out.write("                                                                return;\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        }\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                }\r\n");
      out.write("                                            }\r\n");
      out.write("                                            row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn\r\n");
      out.write("                                            row.remove();\r\n");
      out.write("                                            alert('Thành công');\r\n");
      out.write("                                        }\r\n");
      out.write("                                        function changeRole(userID, newRole) {\r\n");
      out.write("                                            var data = {\r\n");
      out.write("                                                userID: userID,\r\n");
      out.write("                                                newRole: newRole\r\n");
      out.write("                                            };\r\n");
      out.write("                                            $.ajax({\r\n");
      out.write("                                                url: '../changeRole', // Đường dẫn đến trang xử lý cập nhật vai trò\r\n");
      out.write("                                                method: 'POST',\r\n");
      out.write("                                                data: data,\r\n");
      out.write("                                                success: function (response) {\r\n");
      out.write("                                                    // Cập nhật lại giá trị vai trò trên giao diện\r\n");
      out.write("                                                    var elements = document.getElementsByClassName('roleButton_' + userID);\r\n");
      out.write("                                                    for (var i = 0; i < elements.length; i++) {\r\n");
      out.write("                                                        var element = elements[i];\r\n");
      out.write("                                                        element.innerHTML = newRole;\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                },\r\n");
      out.write("                                                error: function (xhr, status, error) {\r\n");
      out.write("                                                    // Hiển thị thông báo lỗi\r\n");
      out.write("                                                    alert(\"Error: \" + error);\r\n");
      out.write("                                                }\r\n");
      out.write("                                            });\r\n");
      out.write("\r\n");
      out.write("                                        }\r\n");
      out.write("                                    </script>\r\n");
      out.write("                                    <!-- Add more rows as needed -->\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Primary table end -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- main content area end -->\r\n");
      out.write("    <!-- footer area start-->\r\n");
      out.write("    <footer>\r\n");
      out.write("        <div class=\"footer-area\">\r\n");
      out.write("            <p>© Copyright 2023.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- footer area end-->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- page container area end -->\r\n");
      out.write("<!-- offset area start -->\r\n");
      out.write("<!-- offset area end -->\r\n");
      out.write("<!-- jquery latest version -->\r\n");
      out.write("<script src=\"assets/js/vendor/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("<!-- bootstrap 4 js -->\r\n");
      out.write("<script src=\"assets/js/popper.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/metisMenu.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.slicknav.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Start datatable js -->\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js\"></script>\r\n");
      out.write("<!-- others plugins -->\r\n");
      out.write("<script src=\"assets/js/plugins.js\"></script>\r\n");
      out.write("<script src=\"assets/js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
