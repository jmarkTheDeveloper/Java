package service;

import dao.ResidentDAO;
import models.Resident;

public class ResidentService {
    public boolean registerNewResident(Resident resident) {
        boolean isValid = true;

        while (!isValid) {

            // firstname validation
            if (resident.getFirstname() == null || resident.getFirstname().isBlank()) {
                System.out.println("You must input your First Name");
                return false;
            } else {
                System.out.println("Success!");
                isValid = true;
            }

            // lastname validation
            if (resident.getLastname() == null || resident.getFirstname().isBlank()) {
                System.out.println("You must input your Last Name");
                return false;
            } else {
                System.out.println("Success!");
                isValid = true;
            }

            // age validation
            if (resident.getAge() <= 0 || resident.getAge() >= 200) {
                System.out.println("Age cannot be below 0 or more than 200");
                return false;
            }

            
        }


    }
}
