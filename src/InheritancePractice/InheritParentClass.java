package InheritancePractice;
import InheritancePractice.*;

public class InheritParentClass extends InheritancePractice {
    public String batch;

    public InheritParentClass(String name, int ID, String batch) {
            //Inherits name and ID from a parent class using Super keyword
            super(name, ID);
            this.batch = batch;
    }


    public void welcomeStudent() {
        System.out.println("Welcome," + name + "(Student ID: " + ID + ")" + " Batch Name: " + batch + " - From a Child class");
    }
}
