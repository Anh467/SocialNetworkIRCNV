package Websocket;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/chatRoomServer")
public class ChatBoxServerEndpoint {

    static Set<Session> users = Collections.synchronizedSet(new HashSet<Session>());

    @OnOpen
    public void handleOpen(Session session) {
        users.add(session);
    }

    @OnMessage
    public void handleMessage(String message, Session userSession) throws IOException {
        // Create a JsonParser instance
        JsonParser parser = new JsonParser();

        // Parse the JSON string into a JsonElement
        JsonElement jsonElement = parser.parse(message);

        // Extract the data from the JSON element
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String chatMessage = jsonObject.get("message").getAsString();
        String userID = jsonObject.get("userID").getAsString();

        if (userID == null) {
            userSession.getUserProperties().put("username", message);
            userSession.getBasicRemote().sendText("System: you are connectd as  " + message);
        } else {
            for (Session session : users) {
                session.getBasicRemote().sendText(userID + ": " + message);
            }
        }
    }

    @OnClose
    public void handleClose(Session session) {
        users.remove(session);
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }
}
