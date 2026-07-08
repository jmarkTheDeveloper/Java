package com.java.bank.services;

import java.util.HashMap;
import com.java.bank.models.Account;

public class BankService {
    private HashMap<String, Account> accountsDatabase;

    public BankService() {
        this.accountsDatabase = new HashMap<>();
    }

    public void openNewAccount(Account account) {
        if (account == null) {
            System.out.println("There is no account exist");
            return;
        }

        String accounts = account.getAccountNumber();
        accountsDatabase.put(accounts, account);
    }

    public Account getAccount(String accountNumber) {
        if (accountNumber == null) {
            System.out.println("There is no account exist");
            return null;
        }

        Account findAccount = accountsDatabase.get(accountNumber);
        return findAccount;

    }

    public Account deleteAccount(String accountNumber) {
        if (accountNumber == null) {
            System.out.println("There is no account exist0");
            return null;
        }

        Account deleteAccount = accountsDatabase.remove(accountNumber);
        return deleteAccount;
    }

    public boolean transferMoney(String senderAccountNumber, String recieverAccountNumber, double amount) {
        Account sender = getAccount(senderAccountNumber);
        Account reciever = getAccount(recieverAccountNumber);

        if (sender == null || reciever == null) {
            System.out.println("One or both accounts do not exist");
            return false;
        }

        if (sender.getBalance() < amount) {
            System.out.println("");
        }
    }
}
