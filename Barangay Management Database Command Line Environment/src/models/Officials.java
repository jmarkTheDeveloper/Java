package models;

public class Officials {
    private String officialId;
    private String firstname;
    private String lastname;
    private String position;
    private String termStart;
    private String termEnd;
    private String status;

    public Officials(String officialId, String firstname, String lastname, String position, String termStart,
            String termEnd, String status) {
        this.officialId = officialId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.termStart = termStart;
        this.termEnd = termEnd;
        this.status = status;
    }

    public String getOfficialId() {
        return officialId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPosition() {
        return position;
    }

    public String getTermStart() {
        return termStart;
    }

    public String getTermEnd() {
        return termEnd;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Official ID: " + officialId + "\n" +
                "First Name: " + firstname + "\n" +
                "Last Name: " + lastname + "\n" +
                "Position: " + position + "\n" +
                "Term Start: " + termStart + "\n" +
                "Term End: " + termEnd + "\n" +
                "Status: " + status;
    }
}
