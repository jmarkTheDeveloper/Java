package ui;

public class printCentered {
    public static void print(String text) {
        int width = 50;
        int spaces = (width - text.length()) / 2;
        System.out.println(" ".repeat(Math.max(0, spaces)) + text);
    }
}
