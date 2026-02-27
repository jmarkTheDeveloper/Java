import java.util.Scanner;

public class backEnd {

    // this method allows the print to be centered
    public static void printCentered(String text) {
    int terminalWidth = 65; 
    int padding = (terminalWidth - text.length()) / 2;
    String centered = " ".repeat(padding) + text;
    System.out.println(centered);
    }

    public static void  validInput(frontEnd frontEnd, Scanner scanner) {
        
    }
}
