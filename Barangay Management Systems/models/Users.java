package BarangayManagementSystem.models;

public class Users {
    private String name;
    private int age;
    private String phonenumber;
    private String email;

    public Users(String name, int age, String phonenumber, String email) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

}
