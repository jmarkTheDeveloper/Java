package com.java.bank.models;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountId, String accountNumber, String status, double balance) {
        super(accountId, accountNumber, status, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= -500) {
            this.balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount + " Remaining Balance: " + balance
                    + " From Account Number: " + this.getAccountNumber());
        } else {
            System.out.println(
                    "Withdrawal failed. Please maintain atleast more then -500 dollars inside of your Bank Checking Account "
                            + " Account Number | " + this.getAccountNumber());
        }
    }
}
