package BarangayManagementSystem.services;

import java.util.Map;

import BarangayManagementSystem.models.Accounts;
import BarangayManagementSystem.models.Users;

import java.util.HashMap;

public class UserServices {
    // MODELS: USERS SERVICES
    private Map<String, Users> users = new HashMap<>();

    public boolean registerUsers(Users newUser) {
        if (users.containsKey(newUser.getName())) {
            System.out.println("This User already Exists | Please Create another Username");
            return false;
        }

        users.put(newUser.getName(), newUser);
        System.out.println("The User: " + newUser.getName() + " Has been registered");
        return true;
    }

    public Users findUsers(String name) {
        return users.get(name);
    }
