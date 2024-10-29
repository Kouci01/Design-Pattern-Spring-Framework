package com.example.Builder.builder.model;

public class User {
    private final String username;
    private final String email;

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phoneNumber;

    private User(Builder builder){
        this.username = builder.username;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {
        // Required fields
        private final String username;
        private final String email;

        // Optional fields
        private String firstName;
        private String lastName;
        private String address;
        private String phoneNumber;

        // Constructor for mandatory fields
        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        // Setter methods for optional fields
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        // Build method to create User instance
        public User build() {
            return new User(this);
        }
    }
}
