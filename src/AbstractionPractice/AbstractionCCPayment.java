package AbstractionPractice;
import AbstractionPractice.AbstractionPayment;

public class AbstractionCCPayment implements AbstractionPayment {
    @Override
    public void processAbstractionPayment(double charges) {
        System.out.println("Processing CC payment in an amount of: USD " + charges);
    }
}
