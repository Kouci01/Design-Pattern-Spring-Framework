package com.example.Factory.factory;

import com.example.Factory.notification.EmailNotification;
import com.example.Factory.notification.Notification;
import com.example.Factory.notification.SMSNotification;
import org.springframework.stereotype.Component;

@Component
public class NotificationFactoryImpl implements NotificationFactory{
    @Override
    public Notification createNotification(String channel) {
        if ("EMAIL".equalsIgnoreCase(channel)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(channel)) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown channel: " + channel);
    }
}
