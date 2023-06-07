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
    console.log('Server connect... ');
}
function processMessage(message) {
    var data = JSON.parse(message.data);
    var userId = data.userId;
    var message = data.message;

    var friendIdElement = document.getElementById('friendID');
    var friendId = friendIdElement.innerHTML;

    var userIdElement = document.querySelector('.userID');
    if (message.trim() !== "") {
        if (userId === userIdElement.textContent) {
            chatMessages.innerHTML += '<div class="user">' + message + '</div>';
        } else {
            if (friendId === userId){
                chatMessages.innerHTML += '<div class="user friend">' + message + '</div>';
            }
        }
    }
    chatMessages.scrollTop = chatMessages.scrollHeight;
}
function processClose(message) {
    console.log('Server Disconnect...');
}
function processError(message) {
    console.log('Error...');
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