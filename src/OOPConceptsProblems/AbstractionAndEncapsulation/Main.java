package OOPConceptsProblems.AbstractionAndEncapsulation;


public class Main {
    public static void main(String[] args) {

     /*Problem statement 1: Create a BankAccount class that encapsulates details like account number, balance, and account holder name.
     Provide methods for depositing, withdrawing, and checking the balance.
     Ensure sensitive data is not directly accessible but can be retrieved through methods. */
      BankAccount account = new BankAccount(12345, 75000.00, "Mugi");

      System.out.println("*****Before modification**********");
      account.displayAccountDetails();

      account.deposit(25000.00);
      account.withdraw(50000.00);

      System.out.println("*****After modification**********");

      System.out.println(account.getAccountBalance());
      account.displayAccountDetails();

      /*Problem statement 2: Design an abstract class Shape with methods calculateArea() and calculatePerimeter().
      Create concrete classes Circle and Rectangle that implement these methods.*/

        Shape circle = new Circle(500.00);

        Shape rectangle = new Rectangle(1000.00, 500.00);

        circle.calculateArea();
        rectangle.calculatePerimeter();

        circle.checkArea();
        circle.checkPerimeter();

        rectangle.checkPerimeter();
        rectangle.checkArea();

    }
}
