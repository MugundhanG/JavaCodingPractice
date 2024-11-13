package ShallowAndDeepCopies;
import ShallowAndDeepCopies.*;

public class ShallowAndDeepMain {
    public static void main(String[] args) {

        ShallowPractice original = new ShallowPractice("Oringal Shallow Message");
        NewShallowMessage cloned = new NewShallowMessage("Cloned Shallow Message", original);

        //Creating shallow copy
//        ShallowPractice shallowCopy = (ShallowPractice) Object.clone();

    }
}
