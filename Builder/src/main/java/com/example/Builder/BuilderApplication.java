package com.example.Builder;

import com.example.Builder.builder.model.User;
import com.example.Builder.builder.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilderApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            User user = userService.registerUser(
                    "john_doe", "john@example.com", "John", "Doe", "123 Street", "123-456-7890"
            );

            System.out.println("User registered: ");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Full Name: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Address: " + user.getAddress());
            System.out.println("Phone: " + user.getPhoneNumber());
        };
    }
}
