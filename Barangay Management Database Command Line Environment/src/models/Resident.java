package models;

public class Resident {
    private String residentId;
    private String firstname;
    private String lastname;
    private int age;
    private String status;
    private String employment_status;
    private String home_type;

    public Resident(String residentId, String firstname, String lastname, int age, String status,
            String employment_status,
            String home_type) {
        this.residentId = residentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.status = status;
        this.employment_status = employment_status;
        this.home_type = home_type;
    }

    public String getResidentId() {
        return residentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public String getEmploymentStatus() {
        return employment_status;
    }

    public String getHomeType() {
        return home_type;
    }

    public String toString() {
        return "First Name: " + firstname + "\n" +
                "Last Name: " + lastname + "\n" +
                "Age: " + age + "\n" +
                "Status: " + status + "\n" +
                "Employment Status: " + employment_status + "\n" +
                "Home Type: " + home_type;
    }
}
