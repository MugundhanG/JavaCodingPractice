package Reusability;

public class Project {
    private String projectName;
    private Employee developer;

    public Project(String projectName, Employee developer) {
        this.projectName = projectName;
        this.developer = developer;
    }

    public void displayDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.print("Managed by ");
        developer.displayDetails();
    }
}
