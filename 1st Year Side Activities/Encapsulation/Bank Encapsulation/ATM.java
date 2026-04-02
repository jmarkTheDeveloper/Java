import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin;

    ATM(double balance, int finalPIN) {
        this.balance = balance;
        this.pin = finalPIN;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPIN(int finalPIN) {
        if (pin == finalPIN) {
            System.out.println("Welcome to your dashboard");
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public void deposit(Scanner scanner) {
        System.out.println("This is where you will deposit");
        System.out.print("Enter the amount you want to deposit: ");
        double deposit = scanner.nextDouble();

        if (deposit < 0) {
            System.out.println("You cannot deposit nothing");
        } else if (deposit > 0) {
            balance += deposit;
            System.out.println("Your new balance is: " + balance);
        }
    }

    public void withdraw(Scanner scanner) {
        System.out.println("This is where you will withdraw");
        System.out.print("Enter the amount you want to withdraw: ");
        double withdraw = scanner.nextDouble();

        if (withdraw < 0 || withdraw > balance) {
            System.out.println("Error!");
        } else if (withdraw < balance) {
            balance -= withdraw;
        }
    }
}
