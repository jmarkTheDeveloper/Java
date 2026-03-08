import java.util.InputMismatchException;
import java.util.Scanner;

public class backEnd {

    // this method allows the print to be centered
    public static void printCentered(String text) {
        int terminalWidth = 65;
        int padding = (terminalWidth - text.length()) / 2;
        String centered = " ".repeat(padding) + text;
        System.out.println(centered);
    }

    // this method is the backEnd options for the finance tracker main window
    public void financeTrackerMainWindowOptions(Scanner scanner, int options, FrontEnd frontEnd,
            InputMismatchException e) {
        boolean validInput = false;

        while (!validInput) {
            try {
                if (options == 1) {
                    this.addMoney(scanner, frontEnd, e);
                    break;
                }

                if (options == 2) {
                    this.addMoney(scanner, frontEnd, e);
                }

                if (options == 3) {
                    this.addMoney(scanner, frontEnd, e);
                }
            } catch (InputMismatchException ex) {
                System.out.println("Error! " + ex.getMessage());
            }
        }
    }

    public void addMoney(Scanner scanner, FrontEnd frontEnd, InputMismatchException e) {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Do you want to add money? (y/n): ");
                String option = scanner.nextLine();

                if (!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n")) {
                    throw new InputMismatchException("Your input must be Y or N only");
                }

                if (option.equalsIgnoreCase("n")) {
                    System.out.println("Going back!");
                    this.financeTrackerMainWindowOptions(scanner, 0, frontEnd, e);
                    return;
                }

                validInput = true;
                System.out.println("Please wait....");

            } catch (InputMismatchException inputError) {
                System.out.println("Error! " + inputError.getMessage());
            }
        }
    }
}
