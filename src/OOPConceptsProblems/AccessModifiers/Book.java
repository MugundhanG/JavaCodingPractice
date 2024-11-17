package OOPConceptsProblems.AccessModifiers;



public class Book {
    public String title;
    public int releaseYear;
    Author name;

    public Book(String title, int releaseYear, Author name) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.name = name;
    }

    public Book(Book anotherbook) {
        this.title = anotherbook.title;
        this.releaseYear = anotherbook.releaseYear;
    }

    public Book shallowCopyBook() {
        return new Book(this.title, this.releaseYear, this.name);
    }

    public Book deepCopyBook() {
        Author newAuthor = new Author(this.name.authorName);
        return new Book(this.title, this.releaseYear, newAuthor);
    }
}


