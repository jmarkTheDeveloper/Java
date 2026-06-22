package models;

public class UserAdmin {
    private String adminName;
    private String adminType;
    private String password;

    public UserAdmin(String adminName, String adminType, String password) {
        this.adminName = adminName;
        this.adminType = adminType;
        this.password = password;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminType() {
        return adminType;
    }

    public String getPassword() {
        return password;
    }

    public String toSring() {
        return "Admin Name: " + adminName + "\n" +
                "Admin Type: " + adminType + "\n" +
                "Password: " + "*****";
    }
}
