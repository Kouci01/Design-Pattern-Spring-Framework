package com.example.Factory.notification;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}
