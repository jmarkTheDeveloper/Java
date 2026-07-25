package com.sora.models;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private int senderAccountId;
    private int receiverAccountId;
    private double amount;
    private String transactionType;
    private String status;
    private LocalDateTime transactionDate;

    public Transaction(int transactionId, int senderAccountId, int receiverAccountId, double amount,
            String transactionType, String status, LocalDateTime transactionDate) {
        this.transactionId = transactionId;
        this.senderAccountId = senderAccountId;
        this.receiverAccountId = receiverAccountId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.status = status;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getSenderAccountId() {
        return senderAccountId;
    }

    public int getReceiverAccountId() {
        return receiverAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
}
