package PluggabilityAndDebugging;

public class CreditCardPayment implements Payment {
    private int cvv;

    public CreditCardPayment(int cvv){
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment using: " + cvv + " for an amount of INR " + amount);
    }
}
