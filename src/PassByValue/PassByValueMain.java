package PassByValue;
import PassByValue.*;

public class PassByValueMain {
    public static void main(String[] args) {

        //Pass by value with Primitive data types
        int age = 28;
        modifyAge(age);
        System.out.println("Original: " + age);

        //Pass by value with Object Data types
        PassByValueName student = new PassByValueName("Mugi");
        modifyName(student);
        System.out.println("Original Name: " + student.name);

    }

    //The method modifyAge changes age to 25, but age in main remains 28 because only a copy of number was modified.
    static void modifyAge(int age) {
        age = 25;
        System.out.println("Copy: " + age);
    }

    //The modifyName method changes the name attribute of the student object, affecting the original object.
    // This is because st and student both point to the same memory address,
    // so modifying the object through st changes it for student as well.
    static void modifyName(PassByValueName st) {
        st.name = "Mugundhan";
        System.out.println("Modified Name: " + st.name);
    }
}
