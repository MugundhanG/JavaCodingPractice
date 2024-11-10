package Reusability;

public class Report implements Printer {
    private String message;

    public Report(String message) {
        this.message = message;
    }
    @Override
    public void print() {
        System.out.println("Printing " + message);
    }
}
