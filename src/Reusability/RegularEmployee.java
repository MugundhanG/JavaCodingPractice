package Reusability;

public class RegularEmployee extends Employee {
        private double salary;

        public RegularEmployee(int empId, String empName, double salary) {
            super(empId, empName);
            this.salary = salary;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Regular Employee Salary: " + salary);
        }

}
