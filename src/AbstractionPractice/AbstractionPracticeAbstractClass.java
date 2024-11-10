package AbstractionPractice;

public abstract class AbstractionPracticeAbstractClass {
    protected String code;

    //Constructor
    public AbstractionPracticeAbstractClass(String code) {
        this.code = code;
    }

    //Abstract method without body. It should not have an implementations, and it can leave the implementation to the further subclasses.
    public abstract void makeCode();

    //Concrete method with body
    public void displayCode() {
        System.out.println("This is my code for abstraction practice: " + this.code);
    }
}
