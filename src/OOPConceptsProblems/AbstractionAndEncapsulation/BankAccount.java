package OOPConceptsProblems.AbstractionAndEncapsulation;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;

    public BankAccount(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    public double getAccountBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Name: " + name);
    }

}
