package models;

public class DocumentRequest {
    private String requestId;
    private String residentId;
    private String documentType;
    private String purpose;
    private String dateRequested;
    private String status;

    public DocumentRequest(String requestId, String residentId, String documentType, String purpose,
            String dateRequested, String status) {
        this.requestId = requestId;
        this.residentId = residentId;
        this.documentType = documentType;
        this.purpose = purpose;
        this.dateRequested = dateRequested;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getResidentId() {
        return residentId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getDateRequested() {
        return dateRequested;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return "Request ID: " + requestId + "\n" +
                "Resident ID: " + residentId + "\n" +
                "Document Type: " + documentType + "\n" +
                "Purpose: " + purpose + "\n" +
                "Date Requested: " + dateRequested + "\n" +
                "Status: " + status;
    }
}
