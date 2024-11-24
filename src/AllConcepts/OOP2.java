package AllConcepts;

public class OOP2 extends OOP {
    private int birthYear;

    public OOP2(int birthYear, int age, String name) {
        super(age, name);
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void displayall() {
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }


}
