package com.example.Decorator.service;

import org.springframework.stereotype.Service;

@Service
public class BasicMessageService implements MessageService{
    @Override
    public String sendMessage(String message) {
        return "Message: "+message;
    }
}
