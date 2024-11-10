package Reusability;

public class Invoice implements Printer {
    @Override
    public void print() {
        System.out.println("Printing Invoice");
    }
}
