package com.example.Factory;

import com.example.Factory.service.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class FactoryApplication implements CommandLineRunner {

    private final NotificationService notificationService;

    public FactoryApplication(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        notificationService.sendNotification("EMAIL", "Welcome to the Email Notification Service!");
        notificationService.sendNotification("SMS", "Welcome to the SMS Notification Service!");
    }
}
