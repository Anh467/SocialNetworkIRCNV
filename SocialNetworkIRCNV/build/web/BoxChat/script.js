document.getElementById('send-button').addEventListener('click', function () {
    sendMessage();
});

document.getElementById('chat-input').addEventListener('keydown', function (event) {
    if (event.key === 'Enter') {
        event.preventDefault();
        sendMessage();
    }
});

function sendMessage() {
    var messageInput = document.getElementById('chat-input');
    var message = messageInput.value.trim();
    if (message !== '') {
        if (message.trim() !== '') {
            var chatMessages = document.querySelector('.chat-messages');
            chatMessages.innerHTML += '<div class="user">' + message + '</div>';
            chatMessages.innerHTML += '<div class="user friend">' + message + '</div>';
            chatMessages.scrollTop = chatMessages.scrollHeight;
        }
    }
}
