package AbstractionPractice;
import AbstractionPractice.AbstractionPayment;

public class AbstractionNetBankingPayment implements AbstractionPayment {
    @Override
    public void processAbstractionPayment(double charges) {
        System.out.println("Processing Net Banking Payment in an amount of USD: " + charges);
    }
}
