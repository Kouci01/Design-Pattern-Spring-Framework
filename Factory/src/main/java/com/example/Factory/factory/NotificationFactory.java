package com.example.Factory.factory;

import com.example.Factory.notification.Notification;

public interface  NotificationFactory {
    Notification createNotification(String channel);
}
