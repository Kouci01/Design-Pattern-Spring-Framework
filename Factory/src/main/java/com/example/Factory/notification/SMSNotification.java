package com.example.Factory.notification;

public class SMSNotification implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
