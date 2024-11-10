import AbstractionPractice.*;
import Modularity.product.Product;
import Modularity.product.ProductService;
import Modularity.user.UserService;
import Modularity.user.User;
import PluggabilityAndDebugging.CreditCardPayment;
import PluggabilityAndDebugging.PaymentProcessor;
import PluggabilityAndDebugging.UPIPayment;
import Reusability.Printer;
import Reusability.RegularEmployee;
import Reusability.ContractEmployee;
import Reusability.Project;
import Reusability.Report;


public class Main {
    public static void main(String[] args) {

        System.out.println("***************  Modularity starts  ********************");
        ProductService productService = new ProductService();

        productService.addProduct(new Product(1, "Laptop"));
        productService.addProduct(new Product(2, "Monitor"));
        productService.addProduct(new Product(3, "Keyboard"));

        UserService userService = new UserService();

        userService.addUser(new User(1, "Mugi"));
        userService.addUser(new User(2, "Suresh"));
        userService.addUser(new User(3, "Vicky"));

        System.out.println("Products:");
        productService.getProducts().forEach(p -> System.out.println("ID: " + p.getProductId() + " Name: " + p.getProductName()));

        System.out.println("User:");
        userService.getUsers().forEach(u -> System.out.println("ID: " + u.getUserId() + " Name: " + u.getUserName()));
        System.out.println("***************  Modularity ends  ********************");

        System.out.println("***************  Reusability starts  ********************");
        RegularEmployee regularEmployee = new RegularEmployee(1, "Mugi", 75000.00);

        regularEmployee.displayDetails();

        ContractEmployee contractEmployee = new ContractEmployee(2, "Vicky", 300.00);

        contractEmployee.displayDetails();

        Project project = new Project("Scaler Academy", regularEmployee);

        project.displayDetails();

        Printer printer = new Report("report");
        printer.print();
        System.out.println("***************  Reusability ends  ********************");

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

        System.out.println("***************  Abstraction practice starts ********************");

        AbstractionPracticeAbstractClass newAbsPractice = new LearnAbstractionAbstractClass("Mugi Code"); //Creating new instance (object) of a class "Abstraction Practice"
        newAbsPractice.displayCode(); //Just using the method from parent class without any modification
        newAbsPractice.makeCode(); //We are using the Overridden method from a parent class in our own class

        AbstractionPayment newAbsCCPayment = new AbstractionCCPayment();
        newAbsCCPayment.processAbstractionPayment(500.00);

        AbstractionPayment newAbsNetPayment = new AbstractionNetBankingPayment();
        newAbsNetPayment.processAbstractionPayment(10800.00);

        System.out.println("***************  Abstraction practice ends ********************");



    }





























}