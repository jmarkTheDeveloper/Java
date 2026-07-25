package com.sora.models;

public class Account {
    private int accountId;
    private int userId;
    private String accountNumber;
    private double balance;
    private String accountType;
    private String status;

    public Account(int accountId, int userId, String accountNumber, double balance, String accountType, String status) {
        this.accountId = accountId;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + "\n" +
                "User ID: " + userId + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Balance: " + balance + "\n" +
                "Account Type: " + accountType + "\n" +
                "Status: " + status;
    }
}
