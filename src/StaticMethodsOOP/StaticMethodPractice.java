package StaticMethodsOOP;

public class StaticMethodPractice {

    //
    public static String returnMyName(String name, String message) {
      String result = message + " " + name;
        System.out.println(result);
      return result;
    };

    public static int returnMyAge(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        System.out.println(age);
        return age;
    }

}
