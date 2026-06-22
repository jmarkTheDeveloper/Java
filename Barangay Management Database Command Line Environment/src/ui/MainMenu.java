package ui;

import config.DatabaseConfig;
import models.Resident;
import dao.ResidentDAO;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("--- Starting Insert Test ---");

        try {
            ResidentDAO residentDAO = new ResidentDAO();

            // Create a test resident
            Resident resident1 = new Resident(
                    "RES-101",
                    "Juan",
                    "Dela Cruz",
                    23,
                    "Active",
                    "Employed",
                    "Single Family");

            // Test 1: Insert the resident for the first time (should succeed)
            System.out.println("\nTesting: Inserting Resident RES-101...");
            residentDAO.addResident(resident1);

            // Test 2: Try inserting the exact same resident again (should fail with
            // duplicate error, NOT crash!)
            System.out.println("\nTesting: Inserting duplicate Resident RES-101...");
            residentDAO.addResident(resident1);

        } catch (Exception e) {
            System.err.println("Unexpected test failure: " + e.getMessage());
        } finally {
            DatabaseConfig.closeConnection();
            System.out.println("\n--- Connection Closed ---");
        }
    }
}