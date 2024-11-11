package PluggabilityAndDebugging;
import PluggabilityAndDebugging.*;

public class PluggabilityAndDebugginMain {

    public static void main(String[] args) {
        System.out.println("***************  Pluggability and Debugging Ease starts  ********************");

        CreditCardPayment ccPayment = new CreditCardPayment(123);

        ccPayment.processPayment(100);

        UPIPayment upiPayment = new UPIPayment(456);

        upiPayment.processPayment(500);

        PaymentProcessor newpaymentProcessor = new PaymentProcessor(ccPayment);

        newpaymentProcessor.process(500);

        PaymentProcessor newpaymentProcessor2 = new PaymentProcessor(upiPayment);

        newpaymentProcessor2.process(1000);

        System.out.println("***************  Pluggability and Debugging Ease ends here ********************");
    }

}
