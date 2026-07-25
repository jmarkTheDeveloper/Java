package com.sora.models;

public class User {
    private int userId;
    private String username;
    private String email;
    private String phoneNumber;
    private int age;
    private String passwordHash;

    public User(int userId, String username, String email, String phoneNumber, int age, String passwordHash) {
        this.username = username;
        this.userId = userId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.passwordHash = passwordHash;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\n" +
                "User ID: " + userId + "\n" +
                "Age: " + age + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email;
    }

}
