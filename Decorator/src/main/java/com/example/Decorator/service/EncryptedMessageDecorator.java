package com.example.Decorator.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EncryptedMessageDecorator implements MessageService{
    private final MessageService messageService;

    public EncryptedMessageDecorator(@Qualifier("htmlMessageDecorator") MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public String sendMessage(String message) {
        String encryptedMessage = new StringBuilder(message).reverse().toString();
        return "Encrypted(" + messageService.sendMessage(encryptedMessage) + ")";
    }
}
