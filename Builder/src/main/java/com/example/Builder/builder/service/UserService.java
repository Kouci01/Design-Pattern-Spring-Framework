package com.example.Builder.builder.service;

import com.example.Builder.builder.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User registerUser(String username, String email, String firstName, String lastName, String address,
                             String phoneNumber){
        User user = new User.Builder(username,email)
                .firstName(firstName)
                .lastName(lastName)
                .address(address)
                .phoneNumber(phoneNumber)
                .build();
        return user;
    }
}
