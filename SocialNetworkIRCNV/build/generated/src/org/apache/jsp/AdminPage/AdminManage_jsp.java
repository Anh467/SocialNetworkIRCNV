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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Datatable - Admin Manage</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/images/icon/favicon.ico\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/metisMenu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.min.css\">\n");
      out.write("        <!-- amcharts css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.amcharts.com/lib/3/plugins/export/export.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- Start datatable css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css\">\n");
      out.write("        <!-- style css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/typography.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/default-css.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("        <!-- modernizr css -->\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebarMenu.jsp", out, false);
      out.write("\n");
      out.write("            <!-- main content area start -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- page title area start -->\n");
      out.write("            <div class=\"page-title-area\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <div class=\"breadcrumbs-area clearfix\">\n");
      out.write("                            <h4 class=\"page-title pull-left\">Admin Manage</h4>\n");
      out.write("                            <ul class=\"breadcrumbs pull-left\">\n");
      out.write("                                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                <li><span>Admin Manage</span></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminInfoInAnyPage.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- page title area end -->\n");
      out.write("            <div class=\"main-content-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Primary table start -->\n");
      out.write("                    <div class=\"col-11 mt-5\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"header-title\">Data Table Primary</h4>\n");
      out.write("                                <div class=\"data-tables datatable-primary\">\n");
      out.write("                                    <table id=\"dataTable2\" class=\"text-center\">\n");
      out.write("                                        <thead class=\"text-capitalize\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Image</th>\n");
      out.write("                                                <th>FullName</th>\n");
      out.write("                                                <th>Address</th>\n");
      out.write("                                                <th>Mail</th>\n");
      out.write("                                                <th>Account</th>\n");
      out.write("                                                <th>PhoneNumber</th>\n");
      out.write("                                                <th>DOB</th>\n");
      out.write("                                                <th>Nation</th>\n");
      out.write("                                                <th>Role</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                        ");
 Admin_UserManageDAO e = new Admin_UserManageDAO();
                                            List<Admin_UserManage> list = e.getData();
                                            for (Admin_UserManage elem : list) {
                                        
      out.write("\n");
      out.write("                                        <tr class=\"");
      out.print( elem.getUserID());
      out.write("\">\n");
      out.write("                                            <td class=\"user-image\"><img style=\"width: 50px;\" src=\"");
      out.print( elem.getImageUser());
      out.write("\" alt=\"Không Có Ảnh\"></td>\n");
      out.write("                                            <td>");
      out.print( elem.getFullName());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getAddress());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getMail());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getAccount());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getPhoneNumber());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getDob());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print( elem.getNation());
      out.write("</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <div class=\"btn-group\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-light roleButton_");
      out.print(elem.getUserID());
      out.write('"');
      out.write('>');
      out.print( elem.getRoleID());
      out.write("</button>\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-light dropdown-toggle dropdown-toggle-split\" data-toggle=\"dropdown\">\n");
      out.write("                                                        <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                    <div class=\"dropdown-menu\">\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\" onclick=\"changeRole('");
      out.print( elem.getUserID());
      out.write("', 'USER')\">USER</a>\n");
      out.write("                                                        <a class=\"dropdown-item\" href=\"#\" onclick=\"changeRole('");
      out.print( elem.getUserID());
      out.write("', 'ADMIN')\">ADMIN</a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    <script>\n");
      out.write("\n");
      out.write("                                        function skipRow(link, id) {\n");
      out.write("                                            var row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn\n");
      out.write("                                            row = row.parentNode;\n");
      out.write("                                            if (row !== null) {\n");
      out.write("                                                row = row.parentNode;\n");
      out.write("                                                if (row !== null) {\n");
      out.write("                                                    row = row.parentNode;\n");
      out.write("                                                    if (row !== null) {\n");
      out.write("                                                        var oldRow = row;\n");
      out.write("                                                        row = row.previousElementSibling;\n");
      out.write("                                                        if (row !== null) {\n");
      out.write("                                                            if (row.nodeName === 'TR') {\n");
      out.write("                                                                oldRow.remove();\n");
      out.write("                                                                row.remove();\n");
      out.write("                                                                alert('Thành công');\n");
      out.write("                                                                return;\n");
      out.write("                                                            }\n");
      out.write("                                                        }\n");
      out.write("                                                    }\n");
      out.write("                                                }\n");
      out.write("                                            }\n");
      out.write("                                            row = link.parentNode.parentNode; // Lấy thẻ <tr> chứa liên kết được nhấn\n");
      out.write("                                            row.remove();\n");
      out.write("                                            alert('Thành công');\n");
      out.write("                                        }\n");
      out.write("                                        function changeRole(userID, newRole) {\n");
      out.write("                                            var data = {\n");
      out.write("                                                userID: userID,\n");
      out.write("                                                newRole: newRole\n");
      out.write("                                            };\n");
      out.write("                                            $.ajax({\n");
      out.write("                                                url: '../changeRole', // Đường dẫn đến trang xử lý cập nhật vai trò\n");
      out.write("                                                method: 'POST',\n");
      out.write("                                                data: data,\n");
      out.write("                                                success: function (response) {\n");
      out.write("                                                    // Cập nhật lại giá trị vai trò trên giao diện\n");
      out.write("                                                    var elements = document.getElementsByClassName('roleButton_' + userID);\n");
      out.write("                                                    for (var i = 0; i < elements.length; i++) {\n");
      out.write("                                                        var element = elements[i];\n");
      out.write("                                                        element.innerHTML = newRole;\n");
      out.write("                                                    }\n");
      out.write("                                                },\n");
      out.write("                                                error: function (xhr, status, error) {\n");
      out.write("                                                    // Hiển thị thông báo lỗi\n");
      out.write("                                                    alert(\"Error: \" + error);\n");
      out.write("                                                }\n");
      out.write("                                            });\n");
      out.write("\n");
      out.write("                                        }\n");
      out.write("                                    </script>\n");
      out.write("                                    <!-- Add more rows as needed -->\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Primary table end -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- main content area end -->\n");
      out.write("    <!-- footer area start-->\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-area\">\n");
      out.write("            <p>© Copyright 2023.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- footer area end-->\n");
      out.write("</div>\n");
      out.write("<!-- page container area end -->\n");
      out.write("<!-- offset area start -->\n");
      out.write("<!-- offset area end -->\n");
      out.write("<!-- jquery latest version -->\n");
      out.write("<script src=\"assets/js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("<!-- bootstrap 4 js -->\n");
      out.write("<script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"assets/js/metisMenu.min.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery.slimscroll.min.js\"></script>\n");
      out.write("<script src=\"assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Start datatable js -->\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/1.10.18/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js\"></script>\n");
      out.write("<!-- others plugins -->\n");
      out.write("<script src=\"assets/js/plugins.js\"></script>\n");
      out.write("<script src=\"assets/js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
