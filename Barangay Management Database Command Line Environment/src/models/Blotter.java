package models;

public class Blotter {
    private String blotterId;
    private String complainantId;
    private String respondentName;
    private String incidentType;
    private String incidentDate;
    private String status;
    private String details;

    public Blotter(String blotterId, String complainantId, String respondentName, String incidentType,
            String incidentDate, String status, String details) {
        this.blotterId = blotterId;
        this.complainantId = complainantId;
        this.respondentName = respondentName;
        this.incidentType = incidentType;
        this.incidentDate = incidentDate;
        this.status = status;
        this.details = details;
    }

    public String getBlotterId() {
        return blotterId;
    }

    public String getComplainantId() {
        return complainantId;
    }

    public String getRespondentName() {
        return respondentName;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String toString() {
        return "Blotter ID: " + blotterId + "\n" +
                "Complainant ID: " + complainantId + "\n" +
                "Respondent Name: " + respondentName + "\n" +
                "Incident Type: " + incidentType + "\n" +
                "Incident Date: " + incidentDate + "\n" +
                "Status: " + status + "\n" +
                "Details: " + details;
    }
}
