package Reusability;

public class ContractEmployee extends Employee{

    private double hourlyRate;

    public ContractEmployee(int empId, String empName, double hourlyRate) {
        super(empId, empName);
        this.hourlyRate = hourlyRate;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Contact Employee Hourly Rate: " + hourlyRate);
    }

}
