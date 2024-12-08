
package com.chatApplication.ChatApplicationwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")  // Handle incoming messages from the client
    @SendTo("/topic/messages/{recipient}")   // Send messages to a specific recipient's topic
    public ChatMessage sendMessage(@Payload ChatMessage message) {
        return message;  // Return the message to the recipient's topic
    }
}


