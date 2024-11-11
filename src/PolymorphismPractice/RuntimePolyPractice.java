package PolymorphismPractice;
import PolymorphismPractice.*;

public class RuntimePolyPractice extends PolyPracticeClass {

    //Method is overridden with printing difference sentence.
    @Override
    public void displayDetail(String companyName) {
        System.out.println("Company Name with a overridden method: " + companyName);
    }

    //If @Override is not used, Java will still allow method overriding to happen, but you lose the benefits of the automatic checks and readability:
    public void displayDetail(int workingYear) {
        System.out.println("Company Working year with a overridden method: " + workingYear);
    }
}
