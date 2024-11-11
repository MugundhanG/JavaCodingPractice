package EncapsulationPractice;
import EncapsulationPractice.*;

public class EncapsulationPracticeMain {
    public static void main(String[] args) {

        EncapsulationPractice encapPractice = new EncapsulationPractice("My Encap Code", 2);

        //displaying initial values
        encapPractice.displayEncapsulationCode();
        encapPractice.displayEncapsulationDuration();

        //Modifying initial values using setter method
        encapPractice.setCode("My Encap Code using set method");
        encapPractice.setCodeDuration(4);
        encapPractice.displayEncapsulationCode();
        encapPractice.displayEncapsulationDuration();

        encapPractice.getCode();

    }
}
