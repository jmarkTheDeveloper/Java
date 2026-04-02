import java.util.Scanner;

public class userATM {
    public static void main(String[] args) {
        ATM atm = new ATM(500, 123);
        Scanner scanner = new Scanner(System.in);
        userATM myUserAtm = new userATM();

        System.out.println("Welcome to Bank");
        System.out.print("Enter your pin: ");
        if (atm.verifyPIN(scanner.nextInt())) {
            myUserAtm.dashboard(scanner, atm);
        }
    }

    public void dashboard(Scanner scanner, ATM atm) {
        System.out.println("1. Deposit \n" +
                "2. Withdraw ");
        System.out.print("Enter here: ");
        String userOptions = scanner.next();

        if (userOptions.equals("1")) {
            atm.deposit(scanner);
        } else if (userOptions.equals("2")) {
            atm.withdraw(scanner);
        } else {
            System.out.println("Error");
        }
    }
}
