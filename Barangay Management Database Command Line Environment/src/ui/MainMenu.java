package ui;

import java.util.Scanner;
import config.DatabaseConfig;
import models.Resident;
import dao.ResidentDAO;
import models.UserAdmin;
import dao.UserAdminDAO;

public class MainMenu {
    public static void main(String[] args) {
        UserAdminDAO testAdminDAO = new UserAdminDAO();
        UserAdmin testAdmin = new UserAdmin("admin", "Super Admin", "password123");
        testAdminDAO.addAdmin(testAdmin);
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(50));
        printCentered.print("Welcome to Barangay Management Systems");
        System.out.println("=".repeat(50));

        try {
            System.out.print("Please Enter Your Username: ");
            String username = scanner.nextLine();

            System.out.print("Please Enter your password: ");
            String password = scanner.nextLine();
            UserAdminDAO adminDAO = new UserAdminDAO();
            UserAdmin authenticatedUser = adminDAO.authenticate(username, password);

            if (authenticatedUser != null) {
                System.out.println("Login Successful! Welcome: " + authenticatedUser.getAdminName());
            } else {
                System.out.println("Invalid Username or Password: Access Denied!");
            }
        } catch (Exception e) {
            System.out.println("Please input right credentials");
        }
    }
}