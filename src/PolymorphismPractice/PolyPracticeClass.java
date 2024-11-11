package PolymorphismPractice;

public class PolyPracticeClass {

    //Overloaded method with a same name "displayDetail" to print a Sting - companyName
    public void displayDetail(String companyName) {
        System.out.println("Company Name: " + companyName);
    }

    //Overloaded method with a same name "displayDetail" to print an int - workingYear
    public void displayDetail(int workingYear) {
        System.out.println("Working Year: " + workingYear);
    }

    //Overloaded method with a same name "displayDetail" to print a float - workingDuration
    public void displayDetail(float workingDuration) {
        System.out.println("Working Duration: " + workingDuration);
    }

}
