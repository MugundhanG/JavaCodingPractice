package OOPConceptsProblems.AccessModifiers;

public class Main {
    public static void main(String[] args) {

        Person myDetailsWithDefaultConstructor = new Person();

        Person myDetailsWithParameterizedConstructor = new Person("Mugundhan", 30, "Bangalore");

        myDetailsWithDefaultConstructor.checkInfo();

        myDetailsWithParameterizedConstructor.checkInfo();

        Author name = new Author("Mugundhan");

        Book originalBook = new Book("Master your leaning", 2023, name);


        Book shallowBook = originalBook.shallowCopyBook();

        shallowBook.name.authorName = "Mugi";

        Book deepBook = originalBook.deepCopyBook();

        deepBook.name.authorName = "Vicky";


        System.out.println("Author checking:");
        System.out.println(originalBook.name.authorName); //It shows mugi since original modified through shallow copy.
        System.out.println(shallowBook.name.authorName); //It shows mugi since modified in shallow copy.
        System.out.println(deepBook.name.authorName); //It shows Vikcy since original not through shallow copy.


    }
}
