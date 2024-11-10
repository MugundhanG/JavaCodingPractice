package PluggabilityAndDebugging;

public class PaymentProcessor {
    private Payment paymentMethod;

    public PaymentProcessor(Payment paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.processPayment(amount);
    }
}
