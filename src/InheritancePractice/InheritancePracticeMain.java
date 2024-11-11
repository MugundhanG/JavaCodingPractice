package InheritancePractice;
import InheritancePractice.*;

public class InheritancePracticeMain {
    public static void main(String[] args) {

        InheritancePractice inheritancePrac = new InheritancePractice("Mugundhan", 3);
        InheritParentClass inheritanceStudent = new InheritParentClass("Mugi", 3, "Scaler");

        inheritancePrac.welcomeEmployee();
        inheritanceStudent.welcomeStudent();

    }
}
