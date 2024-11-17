package OOPConceptsProblems.AccessModifiers;

public class Person {
    public String name;
    public int age;
    public String address;

    public Person() {
        this.name = "Mugi";
        this.age = 28;
        this.address = "Chennai";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void checkInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }

}
