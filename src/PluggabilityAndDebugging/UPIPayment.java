package PluggabilityAndDebugging;

public class UPIPayment implements Payment{
    private int UPIID;

    public UPIPayment(int UPIID){
        this.UPIID = UPIID;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment using: " + UPIID + " for an amount of INR " + amount);
    }
}
