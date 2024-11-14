package ShallowAndDeepCopies;
import ShallowAndDeepCopies.*;

public class ShallowAndDeepMain {
    public static void main(String[] args) {

        ShallowAndDeepPractice originalShallow = new ShallowAndDeepPractice("Mugi", 2024, "Scaler");

        //We are creating shallowCopy and change the year in copy. But the year is changed in both original and shallow copy.
        ShallowAndDeepPractice shallowCopy = originalShallow.shallowCopy();
        shallowCopy.year = 2025;

        System.out.println("Printed from Shallow Copies: " +
                "Shallow Copy Year - " + shallowCopy.year +
                " & Original Year - " + originalShallow.year);

        //We are creating deepCopy and change the student name in copy. Here the student name is changed only in the dee copy.
        //and does not affect the original one.
        ShallowAndDeepPractice deepCopy = originalShallow.deepCopy();
        deepCopy.stName = "Mugundhan";

        System.out.println("Printed from Deep Copies: " +
                "Deep Copy Student Name - " + deepCopy.stName +
                " & Original Student Name - " + originalShallow.stName);

    }
}
