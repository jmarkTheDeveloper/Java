package com.java.bank.models;

import java.time.LocalDateTime;

public class Transaction {
    private final String transactionId;
    private final double amount;
    private final LocalDateTime timestamp;
    private final String type;

    public Transaction(String transactionId, double amount, LocalDateTime timestamp, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.timestamp = timestamp;
        this.type = type;
    }

    public String getTransaction() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + "\n" +
                "Amount: " + amount + "\n" +
                "Timestamp: " + timestamp + "\n" +
                "Type: " + type + "\n";
    }
}
