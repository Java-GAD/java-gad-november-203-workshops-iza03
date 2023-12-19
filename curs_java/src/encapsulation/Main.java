package encapsulation;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
