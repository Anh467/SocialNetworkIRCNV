<%-- 
    Document   : BoxChat
    Created on : Jun 5, 2023, 9:34:49 AM
    Author     : TCNJK
--%>

<%@page import="dao.BoxChatFriendListDAO"%>
<%@page import="java.util.Hashtable"%>
<%@page import="model.FriendBoxChat"%>
<%@page import="model.FriendAndLastChat"%>
<%@page import="model.BoxChatFriend"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
        <style>
            /* CSS cho box chat */
            .chat-container {
                width: 80%;
                height: 80vh;
                border: 1px solid #ccc;
                border-radius: 5px;
                margin: auto;
                display: flex;
                flex-direction: column;
                position: fixed;
                top: 50%;
                right: 50px;
                transform: translate(0, -50%);
                overflow-y: auto;
            }

            .chat-header {
                background-color: #f1f1f1;
                padding: 10px;
                display: flex;
                align-items: center;
            }

            .avatar {
                width: 30px;
                height: 30px;
                border-radius: 50%;
                margin-right: 10px;
                background-color: #ccc;
            }

            .friend-name {
                font-weight: bold;
            }

            .chat-messages {
                flex-grow: 1;
                overflow-y: auto;
                padding: 10px;
            }

            .chat-input-container {
                display: flex;
                align-items: center;
                padding: 10px;
            }

            .chat-input {
                flex-grow: 1;
                border: none;
                border-radius: 20px;
                padding: 8px 12px;
            }

            .send-button {
                padding: 6px;
                border: none;
                background-color: transparent;
                cursor: pointer;
            }

            .user {
                background-color: #2e17ff;
                color: #fff;
                padding: 8px;
                border-radius: 10px;
                margin-bottom: 5px;
                align-self: flex-end;
                max-width: 80%;
                width: fit-content;
                padding-right: 10px;
                margin-left: auto;
                word-wrap: break-word;
            }

            .friend {
                align-self: flex-start;
                background-color: #f0f0f0;
                color: black;
                margin-left: 10px;
                margin-right: auto;
            }
            .friend-list {
                width: 8%;
                height: 80vh;
                overflow-y: scroll;
                padding: 0;
                margin: 0;
                list-style: none;
            }
            .friend-item {
                display: flex;
                align-items: center;
                padding: 10px;
                border-bottom: 1px solid #ccc;
                cursor: pointer;
            }

            .friend-avatar {
                width: 40px;
                height: 40px;
                border-radius: 50%;
                background-color: #ccc;
            }

            .friend-info {
                margin-left: 10px;
            }

            .friend-name {
                font-weight: bold;
            }

            .friend-last-message {
                font-size: 12px;
                color: #999;
            }

            .container {
                display: flex;
            }

            .friend-list {
                flex: 0 0 auto;
                width: 300px; /* Điều chỉnh kích thước theo nhu cầu */
                margin-right: 70px; /* Khoảng cách 50px với chat-container */
                position: fixed;
                top: 12%;
            }

            .chat-container {
                flex: 1 1 auto;
                margin: 0;
                display: flex;
                flex-direction: column;
            }

        </style>
    </head>
    <body onload="sendMessage()">
        <div class="container">
            <div class="sidebar">
                <ul class="friend-list">
                    <%
                        String UID = (String) session.getAttribute("id");
                        String FID = request.getParameter("Friendid");
                        BoxChatFriendListDAO e = new BoxChatFriendListDAO();
                        BoxChatFriend data = e.getData(UID);
                        FriendBoxChat box = e.getBoxChat(UID, FID);
                        if (data != null) {
                    %>
                    <p id="UserID" class="userID" style="display: none;"><%=data.getUserID()%></p>
                    <%}
                        for (FriendAndLastChat last : data.getList()) {
                            String friendName = last.getFriendID();
                            String lastMessage = last.getLastChat();
                    %>
                    <!--GetFriendAndBoxChat-->
                    <a href="BoxChat.jsp?Friendid=<%=friendName%>">
                        <li class="friend-item">
                            <div class="friend">
                                <div class="friend-avatar"></div>
                                <div class="friend-info">
                                    <div class="friend-name"><%= friendName%></div>
                                    <div class="friend-last-message"><%= lastMessage%></div>
                                </div>
                            </div>
                        </li>
                    </a>
                    <%}%>
                    <!-- Thêm các mục bạn bè khác vào đây -->
                </ul>

            </div>
            <%
                String FriendId = "";
                String FriendName="";
                if (box != null) {
                    FriendId = box.getFriendID();
                    FriendName= box.getFriendName();
                }
            %>
            <div class="chat-container">
                <div class="chat-header">
                    <div class="avatar"></div>
                    <div class="friendID" id="friendID" style="display: none;"><%=FriendId%></div>
                    <div class="FriendName" id="FriendName" ><%=FriendName%></div>
                </div>
                <div class="chat-messages" id="chat-messages">
                    <%
                        if (box != null) {
                            Hashtable<Integer, String> boxChat = box.getList();
                            Hashtable<Integer, String> boxChatID = box.getListChatID();
                            Hashtable<Integer, Boolean> boxChatWho = box.getListWho();
                            for (int i = 0; i < boxChat.size(); i++) {
                                String ChatID = boxChatID.get(i);
                                String mess = boxChat.get(i);
                                Boolean who = boxChatWho.get(i);
                    %><div><q style="display: none;"><%=ChatID%></q><%
                        if (who) {
                        %>
                        <div class="user">

                            <%=mess%>
                        </div><%
                        } else {
                        %><div class="user friend"><%=mess%></div><%
                            }
                        %></div><%
                                }
                            }%>
                    <!-- Tin nhắn trong box chat sẽ được đổ vào đây -->
                </div>
                <div class="chat-input-container">
                    <input type="text" class="chat-input" id="chat-input" placeholder="Type a message" >
                    <button class="send-button" id="send-button" ><i class="fas fa-paper-plane" ></i></button>
                </div>
            </div>
        </div>
        <script>
            document.getElementById('send-button').addEventListener('click', function () {
                sendMessagever1();
            });

            document.getElementById('chat-input').addEventListener('keydown', function (event) {
                if (event.key === 'Enter') {
                    event.preventDefault();
                    sendMessagever1();
                }
            });
            var chatMessages = document.querySelector('.chat-messages');
            function sendMessagever1() {
                var friendId = document.getElementById('friendID').textContent;
                var messageInput = document.getElementById('chat-input');
                var message = messageInput.value.trim();
                if (message !== '') {
                    if (message.trim() !== '') {
                        $.ajax({
                            url: 'SavaChat', // Đường dẫn đến file xử lý lưu tin nhắn (cần tạo file luu-tin-nhan.php)
                            method: 'POST',
                            data: {message: message, friendId: friendId},
                            success: function (response) {
                                sendMessage();
                                chatMessages.scrollTop = chatMessages.scrollHeight;
                                messageInput.value = '';
                            },
                            error: function () {
                                // Xử lý khi có lỗi xảy ra trong quá trình gửi tin nhắn
                            }
                        });
                    }
                }
            }
            var websocket = new WebSocket("ws://localhost:8080/SocialNetworkIRCNV/chatRoomServer");

            websocket.onopen = function (message) {
                processOpen(message);
            };
            websocket.onmessage = function (message) {
                processMessage(message);
            };
            websocket.onclose = function (message) {
                processClose(message);
            };
            websocket.onerror = function (message) {
                processError(message);
            };

            function processOpen(message) {
                chatMessages.value += "Server connect... \n";
            }
            function processMessage(message) {
                var data = JSON.parse(message.data);
                var userId = data.userId;
                var message = data.message;
                var userIdElement = document.querySelector('.userID');
                if (message.trim() !== "") {
                    if (userId === userIdElement.textContent) {
                        chatMessages.innerHTML += '<div class="user">' + message + '</div>';
                    } else {
                        chatMessages.innerHTML += '<div class="user friend">' + message + '</div>';
                    }
                }
                chatMessages.scrollTop = chatMessages.scrollHeight;
            }
            function processClose(message) {
                chatMessages.value += "Server Disconnect... \n";
            }
            function processError(message) {
                chatMessages.value += "Error... " + message + " \n";
            }

            function sendMessage() {
                if (typeof websocket != 'undefined' && websocket.readyState == WebSocket.OPEN) {
                    var messageInput = document.getElementById('chat-input');

                    var userIdElement = document.querySelector('.userID');
                    var userId = userIdElement.textContent;

                    var friendIdElement = document.getElementById('friendID');
                    var friendId = friendIdElement.innerHTML;
                    var data = {
                        message: messageInput.value,
                        userID: userId,
                        friendID: friendId
                    };

                    websocket.send(JSON.stringify(data));
                }
            }
        </script>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    </body>

</html>
