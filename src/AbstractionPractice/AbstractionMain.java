package AbstractionPractice; // This one mentioned the package name which means that this is created under name of the package (folder)
import AbstractionPractice.*; // This one used to get all functionalities from other files in this package (folder)

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

        System.out.println("***************  Own methods Abstraction practice starts ********************");

        Bat mycricBat = new CricketBat("Cricket Bat");
        Bat mybadmintonBat = new CricketBat("Badminton Bat");
        mycricBat.showsportsBat(mycricBat.sportsBat());
        mybadmintonBat.showsportsBat(mybadmintonBat.sportsBat());

        System.out.println("***************  Own methods Abstraction practice ends ********************");


    }

}
