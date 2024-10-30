package com.example.Decorator.controller;

import com.example.Decorator.service.MessageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MessageController {
    private final MessageService messageService;

    public MessageController(@Qualifier("encryptedMessageDecorator") MessageService messageService){
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return messageService.sendMessage(message);
    }
}
