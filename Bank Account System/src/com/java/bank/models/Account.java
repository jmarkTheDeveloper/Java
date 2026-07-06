package com.java.bank.models;

public abstract class Account {
    private String accountId;
    private String accountNumber;
    private String status;
    protected double balance;

    public Account(String accountId, String accountNumber, String status, double balance) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.status = status;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposit: $ " + amount + "From Account Number: " + accountNumber);
        }
    }

    public abstract void withdraw(double amount);

    public String toString() {
        return "Account ID: " + accountId + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Status: " + status + "\n" +
                "Balance: " + balance + "\n";

    }
}
