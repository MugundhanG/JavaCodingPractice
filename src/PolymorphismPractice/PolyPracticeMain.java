package PolymorphismPractice;
import PolymorphismPractice.*;

public class PolyPracticeMain {
    public static void main(String[] args) {

        PolyPracticeClass polyPractice = new PolyPracticeClass();
        RuntimePolyPractice runtimePolyPractice = new RuntimePolyPractice();

        //Compile-Time (Static) Polymorphism (Method overloading)
        polyPractice.displayDetail(2024);
        polyPractice.displayDetail(3.5f);
        polyPractice.displayDetail("Ntrust");

        //Run-time polymorphism (Method overriding)
        runtimePolyPractice.displayDetail("Colliers");
        runtimePolyPractice.displayDetail(2024);

    }
}
