package com.example.Decorator.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HtmlMessageDecorator implements MessageService{
    private final MessageService messageService;

    public HtmlMessageDecorator(@Qualifier("basicMessageService") MessageService messageService){
        this.messageService = messageService;
    }

    @Override
    public String sendMessage(String message) {
        return "<html><body>" + messageService.sendMessage(message) + "</body></html>";
    }
}
