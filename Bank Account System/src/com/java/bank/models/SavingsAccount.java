package com.java.bank.models;

import java.util.InputMismatchException;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountId, String accountNumber, String status, double balance) {
        super(accountId, accountNumber, status, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= 100) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount + " Remaining Balance: " + balance
                    + " From Account Number: " + this.getAccountNumber());
        } else {
            System.out.println(
                    "Withdrawal failed. Please maintain atleast 100 dollars inside of your Bank Savings Account " +
                            " Account Number | " + this.getAccountNumber());
        }
    }
}
