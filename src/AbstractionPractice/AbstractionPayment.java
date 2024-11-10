package AbstractionPractice;

public interface AbstractionPayment {
    //Interfaces in Java can only declare method signatures; they cannot provide method implementations.
    //In Java interfaces, methods cannot have a body.
    void processAbstractionPayment(double charges);
}
