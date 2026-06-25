package ui;

import config.DatabaseConfig;
import models.Resident;
import dao.ResidentDAO;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("--- Starting CRUD (Update & Delete) Test ---");

        try {
            ResidentDAO residentDAO = new ResidentDAO();

            // --- TEST 1: UPDATE OPERATION ---
            System.out.println("\n[Test 1] Updating RES-101 to Inactive & Unemployed...");
            residentDAO.updateResidentStatus("RES-101", "Inactive", "Unemployed");

            Resident updatedRes = residentDAO.getResidentId("RES-101");
            System.out.println("After Update:\n" + updatedRes);

            // --- TEST 2: SOFT DELETE ---
            System.out.println("\n[Test 2] Soft-deleting RES-101 (Archive)...");
            residentDAO.deleteResidentSoft("RES-101");

            Resident softDeletedRes = residentDAO.getResidentId("RES-101");
            System.out.println("After Soft Delete:\n" + softDeletedRes); // Notice status is now "Archived"

            // --- TEST 3: HARD DELETE ---
            // Let's create a temporary resident to hard delete
            Resident temp = new Resident("RES-999", "Temp", "User", 30, "Active", "Employed", "Apartment");
            System.out.println("\n[Test 3] Inserting temporary resident RES-999...");
            residentDAO.addResident(temp);

            System.out.println("Hard-deleting RES-999 permanently...");
            residentDAO.deleteResidentHard("RES-999");

            Resident hardDeletedRes = residentDAO.getResidentId("RES-999");
            if (hardDeletedRes == null) {
                System.out.println("🎉 Confirm: RES-999 is completely gone from the database!");
            } else {
                System.out.println("❌ Error: RES-999 still exists!");
            }

        } catch (Exception e) {
            System.err.println("Unexpected test failure: " + e.getMessage());
        } finally {
            DatabaseConfig.closeConnection();
            System.out.println("\n--- Connection Closed ---");
        }
    }
}
