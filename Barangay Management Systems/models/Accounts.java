package BankAccount.models;

public class Accounts {
    private String accountId;
    private String accountNumber;
    private String accountType;

    Accounts(String accountId, String accountNumber, String accountType) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

}
