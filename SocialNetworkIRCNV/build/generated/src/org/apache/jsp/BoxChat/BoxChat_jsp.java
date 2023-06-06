package org.apache.jsp.BoxChat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BoxChatFriendListDAO;
import java.util.Hashtable;
import model.FriendBoxChat;
import model.FriendAndLastChat;
import model.BoxChatFriend;

public final class BoxChat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"sendMessage()\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <ul class=\"friend-list\">\n");
      out.write("                    ");

                        String UID = (String) session.getAttribute("id");
                        String FID = request.getParameter("Friendid");
                        BoxChatFriendListDAO e = new BoxChatFriendListDAO();
                        BoxChatFriend data = e.getData(UID);
                        FriendBoxChat box = e.getBoxChat(UID, FID);
                        if (data != null) {
                    
      out.write("\n");
      out.write("                    <p id=\"UserID\" class=\"userID\" style=\"display: none;\">");
      out.print(data.getUserID());
      out.write("</p>\n");
      out.write("                    ");
}
                        for (FriendAndLastChat last : data.getList()) {
                            String friendName = last.getFriendID();
                            String lastMessage = last.getLastChat();
                    
      out.write("\n");
      out.write("                    <!--GetFriendAndBoxChat-->\n");
      out.write("                    <a href=\"BoxChat.jsp?Friendid=");
      out.print(friendName);
      out.write("\">\n");
      out.write("                        <li class=\"friend-item\">\n");
      out.write("                            <div class=\"friendV\">\n");
      out.write("                                <div class=\"friend-avatar\"></div>\n");
      out.write("                                <div class=\"friend-info\">\n");
      out.write("                                    <div class=\"friend-name\">");
      out.print( friendName);
      out.write("</div>\n");
      out.write("                                    <div class=\"friend-last-message\">");
      out.print( lastMessage);
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <!-- Thêm các mục bạn bè khác vào đây -->\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");

                String FriendId = "";
                String FriendName = "";
                if (box != null) {
                    FriendId = box.getFriendID();
                    FriendName = box.getFriendName();
                }
            
      out.write("\n");
      out.write("            <div class=\"chat-container\">\n");
      out.write("                <div class=\"chat-header\">\n");
      out.write("                    <div class=\"avatar\"></div>\n");
      out.write("                    <div class=\"friendID\" id=\"friendID\" style=\"display: none;\">");
      out.print(FriendId);
      out.write("</div>\n");
      out.write("                    <div class=\"FriendName\" id=\"FriendName\" >");
      out.print(FriendName);
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chat-messages\" id=\"chat-messages\">\n");
      out.write("                    ");

                        if (box != null) {
                            Hashtable<Integer, String> boxChat = box.getList();
                            Hashtable<Integer, String> boxChatID = box.getListChatID();
                            Hashtable<Integer, Boolean> boxChatWho = box.getListWho();
                            for (int i = 0; i < boxChat.size(); i++) {
                                String ChatID = boxChatID.get(i);
                                String mess = boxChat.get(i);
                                Boolean who = boxChatWho.get(i);
                    
      out.write("<div><q style=\"display: none;\">");
      out.print(ChatID);
      out.write("</q>");

                        if (who) {
                        
      out.write("\n");
      out.write("                        <div class=\"user\">\n");
      out.write("\n");
      out.write("                            ");
      out.print(mess);
      out.write("\n");
      out.write("                        </div>");

                        } else {
                        
      out.write("<div class=\"user friend\">");
      out.print(mess);
      out.write("</div>");

                            }
                        
      out.write("</div>");

                                }
                            }
      out.write("\n");
      out.write("                    <!-- Tin nhắn trong box chat sẽ được đổ vào đây -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chat-input-container\">\n");
      out.write("                    <input type=\"text\" class=\"chat-input\" id=\"chat-input\" placeholder=\"Type a message\" >\n");
      out.write("                    <button class=\"send-button\" id=\"send-button\" ><i class=\"fas fa-paper-plane\" ></i></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"script.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
