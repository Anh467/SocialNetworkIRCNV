package org.apache.jsp.BoxChat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("        <style>\n");
      out.write("            /* CSS cho box chat */\n");
      out.write("            .chat-container {\n");
      out.write("                width: 80%;\n");
      out.write("                height: 80vh;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: auto;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                position: fixed;\n");
      out.write("                top: 50%;\n");
      out.write("                right: 50px;\n");
      out.write("                transform: translate(0, -50%);\n");
      out.write("                overflow-y: auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-header {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("                padding: 10px;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .avatar {\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-name {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-messages {\n");
      out.write("                flex-grow: 1;\n");
      out.write("                overflow-y: auto;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-input-container {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-input {\n");
      out.write("                flex-grow: 1;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                padding: 8px 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .send-button {\n");
      out.write("                padding: 6px;\n");
      out.write("                border: none;\n");
      out.write("                background-color: transparent;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .user {\n");
      out.write("                background-color: #2e17ff;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 8px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                align-self: flex-end;\n");
      out.write("                max-width: 80%;\n");
      out.write("                width: fit-content;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend {\n");
      out.write("                align-self: flex-start;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                color: black;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            .friend-list {\n");
      out.write("                width: 8%;\n");
      out.write("                height: 80vh;\n");
      out.write("                overflow-y: scroll;\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .friend-item {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-bottom: 1px solid #ccc;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-avatar {\n");
      out.write("                width: 40px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                background-color: #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-info {\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-name {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-last-message {\n");
      out.write("                font-size: 12px;\n");
      out.write("                color: #999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-list {\n");
      out.write("                flex: 0 0 auto;\n");
      out.write("                width: 300px; /* Điều chỉnh kích thước theo nhu cầu */\n");
      out.write("                margin-right: 70px; /* Khoảng cách 50px với chat-container */\n");
      out.write("                position: fixed;\n");
      out.write("                top: 12%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-container {\n");
      out.write("                flex: 1 1 auto;\n");
      out.write("                margin: 0;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <ul class=\"friend-list\">\n");
      out.write("                    ");

                        BoxChatFriend data = (BoxChatFriend) session.getAttribute("boxChatFriendData");
                        for (FriendAndLastChat last : data.getList()) {
                            String friendName = last.getFriendID();
                            String lastMessage = last.getLastChat();
                    
      out.write("\n");
      out.write("                    <a href=\"GetFriendAndBoxChat?Friendid=");
      out.print(friendName);
      out.write("\">\n");
      out.write("                        <li class=\"friend-item\">\n");
      out.write("                            <div class=\"friend\">\n");
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
FriendBoxChat box = (FriendBoxChat) session.getAttribute("friendBoxChatData");
                String FriendId= box.getFriendID();
            
      out.write("\n");
      out.write("            <div class=\"chat-container\">\n");
      out.write("                <div class=\"chat-header\">\n");
      out.write("                    <div class=\"avatar\"></div>\n");
      out.write("                    <div class=\"friend-name\">");
      out.print(FriendId);
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
      out.write("        <script>\n");
      out.write("            document.getElementById('send-button').addEventListener('click', function () {\n");
      out.write("                sendMessage();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            document.getElementById('chat-input').addEventListener('keydown', function (event) {\n");
      out.write("                if (event.key === 'Enter') {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    sendMessage();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function sendMessage() {\n");
      out.write("                var messageInput = document.getElementById('chat-input');\n");
      out.write("                var message = messageInput.value.trim();\n");
      out.write("                if (message !== '') {\n");
      out.write("                    if (message.trim() !== '') {\n");
      out.write("                        var chatMessages = document.querySelector('.chat-messages');\n");
      out.write("                        chatMessages.innerHTML += '<div class=\"user\">' + message + '</div>';\n");
      out.write("                        chatMessages.innerHTML += '<div class=\"user friend\">' + message + '</div>';\n");
      out.write("                        chatMessages.scrollTop = chatMessages.scrollHeight;\n");
      out.write("                        messageInput.value = '';\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
