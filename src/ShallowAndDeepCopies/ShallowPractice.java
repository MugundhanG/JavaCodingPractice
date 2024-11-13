package ShallowAndDeepCopies;

class ShallowPractice {
    String shallowMessage;

    public ShallowPractice(String shallowMessage) {
        this.shallowMessage = shallowMessage;
    }

}

class NewShallowMessage implements Cloneable {
    String newShallowMessage;
    ShallowPractice shallowPractice;

    public NewShallowMessage(String newShallowMessage, ShallowPractice shallowPractice) {
        this.newShallowMessage = newShallowMessage;
        this.shallowPractice = shallowPractice;
    }

    // Overriding clone() to create a shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
