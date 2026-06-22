package models;

public class Project {
    private String projectId;
    private String projectName;
    private String projectType;
    private String budget;
    private String startDate;
    private String endDate;

    public Project(String projectId, String projectName, String projectType, String budget, String startDate,
            String endDate) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectType = projectType;
        this.budget = budget;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjecId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getBudget() {
        return budget;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String toString() {
        return "Project ID: " + projectId + "\n" +
                "Project Name: " + projectName + "\n" +
                "Project Type: " + projectType + "\n " +
                "Budget: " + budget + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate;
    }
}
