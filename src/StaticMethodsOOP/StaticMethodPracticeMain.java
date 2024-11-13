package StaticMethodsOOP;
import StaticMethodsOOP.*;

public class StaticMethodPracticeMain {
    public static void main(String[] args) {

        //A static method is one that belongs to the class rather than instances of the class.
        // It can be called without creating an object of the class.
        String myName = StaticMethodPractice.returnMyName("Mugundhan", "Software Development Engineer");
        int myAge = StaticMethodPractice.returnMyAge(2024, 1996);
    }
}
