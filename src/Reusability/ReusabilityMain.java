package Reusability;

public class ReusabilityMain {
    public static void main(String[] args) {
        System.out.println("***************  Reusability starts  ********************");
        RegularEmployee regularEmployee = new RegularEmployee(1, "Mugi", 75000.00);

        regularEmployee.displayDetails();

        ContractEmployee contractEmployee = new ContractEmployee(2, "Vicky", 300.00);

        contractEmployee.displayDetails();

        Project project = new Project("Scaler Academy", regularEmployee);

        project.displayDetails();

        Printer printer = new Report("report");
        printer.print();
        System.out.println("***************  Reusability ends  ********************");
    }

}
