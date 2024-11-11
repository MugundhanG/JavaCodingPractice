package InheritancePractice;

public class InheritancePractice {
    public String name;
    public int ID;

    public InheritancePractice(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public void welcomeEmployee() {
        System.out.println("Welcome, " + name + "(Employee ID: " + ID + ") - From a Parent class");
    }
}
