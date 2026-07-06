package com.java.bank.models;

public class User {
    private String userId;
    private String username;
    private int age;
    private Account account;

    public User(String userId, String username, int age, Account account) {
        this.userId = userId;
        this.username = username;
        this.age = age;
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void celebrateBirthday() {
        this.age++;
    }

    public Account getAccount() {
        return account;
    }

    public String toString() {
        return "User ID: " + userId + "\n" +
                "Username: " + username + "\n" +
                "Age: " + age + "\n" +
                "Account: " + account;
    }
}
