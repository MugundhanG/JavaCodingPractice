package AbstractionPractice;
import AbstractionPractice.*;

public class AbstractionMain {

    public static void main(String[] args) {
        System.out.println("***************  Abstraction practice starts ********************");
        //Creating new instance (object) of a class "Abstraction Practice"
        AbstractionPracticeAbstractClass newAbsPractice = new LearnAbstractionAbstractClass("Mugi Code");
        newAbsPractice.displayCode(); //Just using the method from parent class without any modification
        newAbsPractice.makeCode(); //We are using the Overridden method from a parent class in our own class

        AbstractionPayment newAbsCCPayment = new AbstractionCCPayment();
        newAbsCCPayment.processAbstractionPayment(500.00);

        AbstractionPayment newAbsNetPayment = new AbstractionNetBankingPayment();
        newAbsNetPayment.processAbstractionPayment(10800.00);

        System.out.println("***************  Abstraction practice ends ********************");
    }

}
