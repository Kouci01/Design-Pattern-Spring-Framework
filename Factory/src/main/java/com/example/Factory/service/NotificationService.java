package com.example.Factory.service;

import com.example.Factory.factory.NotificationFactory;
import com.example.Factory.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationFactory notificationFactory;

    @Autowired
    public NotificationService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void sendNotification(String channel, String message) {
        Notification notification = notificationFactory.createNotification(channel);
        notification.sendNotification(message);
    }}
