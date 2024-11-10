package AbstractionPractice;

public abstract class AbstractionPractice {
    protected String code;

    //Constructor
    public AbstractionPractice(String code) {
        this.code = code;
    }

    //Abstract method without body
    public abstract void makeCode();

    //Concrete method with body
    public void displayCode() {
        System.out.println("This is my code for abstraction practice: " + this.code);
    }
}
