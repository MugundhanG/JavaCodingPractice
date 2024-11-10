package AbstractionPractice;

public class LearnAbstractionAbstractClass extends AbstractionPracticeAbstractClass {

    //Using Parent method using Super keyword in the child class constructor
    public LearnAbstractionAbstractClass(String coding) {
        super(coding);
    }

    //Overriding abstract method without body under parent class
    //This is mandatory in Java. Abstract Methods of the Parent class must be overridden by a child class. Otherwise, it throws compilation error.
    @Override
    public void makeCode() {
        System.out.println("I am making code to Learn Abstraction");
    }

}
