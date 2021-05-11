package com.dk.chat.api;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dk.model.Message;

@Controller
@CrossOrigin
public class ChatController {
    @MessageMapping("/chat.register")
    @SendTo("/topic/public")
    public Message register(@Payload Message message,SimpMessageHeaderAccessor headerAccessor) {
    	headerAccessor.getSessionAttributes().put("username", message.getName());
		return message;
    	
    }
    
    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public Message sendMessage(@Payload Message message) {
    	return message;
    }
}
