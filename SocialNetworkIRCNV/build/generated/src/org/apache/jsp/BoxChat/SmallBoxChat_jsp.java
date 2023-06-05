package org.apache.jsp.BoxChat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SmallBoxChat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .chat-container {\n");
      out.write("                position: fixed;\n");
      out.write("                bottom: 0;\n");
      out.write("                right: 0;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("                margin-right: 50px;\n");
      out.write("                width: 328px;\n");
      out.write("                height: 455px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-box {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                padding: 10px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-header {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                /* Thêm dòng này để căn giữa các phần tử trong chat-header */\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .avatar {\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                margin-right: 10px;\n");
      out.write("                background-image: url('img/friend/avt.png');\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .friend-name {\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-messages {\n");
      out.write("                flex-grow: 1;\n");
      out.write("                overflow-y: scroll;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-input-container {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-input {\n");
      out.write("                flex-grow: 1;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-buttons {\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chat-button,\n");
      out.write("            .like-button {\n");
      out.write("                padding: 6px 12px;\n");
      out.write("                background-color: #1f0999;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
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
      out.write("                max-width: 195px;\n");
      out.write("                width: fit-content;\n");
      out.write("                padding-right: 10px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("            }\n");
      out.write("            .friend {\n");
      out.write("                align-self: flex-start;\n");
      out.write("                background-color: #f0f0f0;\n");
      out.write("                color: black;\n");
      out.write("                margin-left: 10px;\n");
      out.write("                margin-right: auto;\n");
      out.write("            }\n");
      out.write("            /* Thêm CSS cho các biểu tượng */\n");
      out.write("            .chat-header-icons {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .exit-icon,\n");
      out.write("            .minimize-icon {\n");
      out.write("                margin-left: 10px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .minimize-icon {\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"chat-container\">\n");
      out.write("            <div class=\"chat-box\">\n");
      out.write("                <div class=\"chat-header\">\n");
      out.write("                    <div class=\"avatar\"></div>\n");
      out.write("                    <div class=\"friend-name\">Ai đó</div>\n");
      out.write("                    <div class=\"icons\">\n");
      out.write("                        <span class=\"exit-icon\">X</span>\n");
      out.write("                        <span class=\"minimize-icon\">--</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chat-messages\">\n");
      out.write("                    <!-- Tin nhắn trong box chat sẽ được đổ vào đây -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"chat-input-container\">\n");
      out.write("                    <input type=\"text\" class=\"chat-input\" placeholder=\"Nhập tin nhắn\">\n");
      out.write("                    <div class=\"chat-buttons\">\n");
      out.write("                        <button class=\"chat-button\"><i class=\"fas fa-camera\"></i></button>\n");
      out.write("                        <button class=\"like-button\"><i class=\"fas fa-thumbs-up\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/js/all.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            // Xử lý sự kiện khi nhấn nút Gửi hình ảnh\n");
      out.write("            document.querySelector('.chat-button').addEventListener('click', function () {\n");
      out.write("                // TODO: Xử lý gửi hình ảnh\n");
      out.write("                console.log('Gửi hình ảnh');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Xử lý sự kiện khi nhấn nút Like\n");
      out.write("            document.querySelector('.like-button').addEventListener('click', function () {\n");
      out.write("                // TODO: Xử lý like\n");
      out.write("                var chatMessages = document.querySelector('.chat-messages');\n");
      out.write("                chatMessages.innerHTML += '<div class=\"user\"><i class=\"fas fa-thumbs-up\"></i></div>';\n");
      out.write("                chatMessages.scrollTop = chatMessages.scrollHeight;\n");
      out.write("                console.log('Like');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Xử lý sự kiện khi nhấn phím Enter trên input\n");
      out.write("            document.querySelector('.chat-input').addEventListener('keydown', function (event) {\n");
      out.write("                if (event.key === 'Enter') {\n");
      out.write("                    event.preventDefault(); // Ngăn chặn hành vi mặc định của phím Enter\n");
      out.write("\n");
      out.write("                    var message = event.target.value;\n");
      out.write("                    if (message.trim() !== '') {\n");
      out.write("                        var chatMessages = document.querySelector('.chat-messages');\n");
      out.write("                        chatMessages.innerHTML += '<div class=\"user\">' + message + '</div>';\n");
      out.write("                        chatMessages.innerHTML += '<div class=\"user friend\">' + message + '</div>';\n");
      out.write("                        chatMessages.scrollTop = chatMessages.scrollHeight;\n");
      out.write("                        event.target.value = ''; // Xóa nội dung trong input sau khi in ra\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Xử lý sự kiện khi nhấn vào biểu tượng \"Exit\"\n");
      out.write("            document.querySelector('.exit-icon').addEventListener('click', function () {\n");
      out.write("                // Xóa box chat\n");
      out.write("                document.querySelector('.chat-container').remove();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            // Xử lý sự kiện khi nhấn vào biểu tượng \"Minimize\"\n");
      out.write("            document.querySelector('.minimize-icon').addEventListener('click', function () {\n");
      out.write("                // Ẩn box chat\n");
      out.write("                var chatBox = document.querySelector('.chat-box');\n");
      out.write("                chatBox.style.display = 'none';\n");
      out.write("\n");
      out.write("                // Tạo minimizeAvatar\n");
      out.write("                var avatar = document.querySelector('.avatar');\n");
      out.write("                var minimizeAvatar = document.createElement('div');\n");
      out.write("                minimizeAvatar.classList.add('minimize-avatar');\n");
      out.write("                minimizeAvatar.style.backgroundImage = avatar.style.backgroundImage;\n");
      out.write("                minimizeAvatar.style.width = avatar.style.width;\n");
      out.write("                minimizeAvatar.style.height = avatar.style.height;\n");
      out.write("                minimizeAvatar.style.borderRadius = avatar.style.borderRadius;\n");
      out.write("                minimizeAvatar.style.position = 'fixed';\n");
      out.write("                minimizeAvatar.style.bottom = '50px';\n");
      out.write("                minimizeAvatar.style.right = '50px';\n");
      out.write("                minimizeAvatar.style.cursor = 'pointer';\n");
      out.write("                minimizeAvatar.addEventListener('click', function () {\n");
      out.write("                    // Hiển thị lại box chat khi nhấp vào minimizeAvatar\n");
      out.write("                    chatBox.style.display = 'flex';\n");
      out.write("                    minimizeAvatar.remove();\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // Thêm minimizeAvatar vào body\n");
      out.write("                document.body.appendChild(minimizeAvatar);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
