package Collections.question6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Batman: The doom that came to Gotham", "Mike migniola and Richard pace");
        Patron patron = new Patron("Shree", "Shreeviswa7@gmail.com");

        Book book2 = new Book("Batman : The killing joke", "Alan Moore");
        Patron patron2 = new Patron("Heisenberg", "Walterwhite@brba.com");

        Book book3 = new Book("Batman Knightfall", "Dough Moench");
        Patron patron3 = new Patron("Thomas shelby", "ThomasShelby@PeakyBlinders.com");

        library.addBook(book2, patron2);
        library.addBook(book3, patron3);
        library.addBook(book, patron);
        LocalDate boorowDate = LocalDate.of(2023, 6, 3);
        library.BoorowBook(book3, patron3, boorowDate);
        LocalDate retunDate = LocalDate.of(2023, 6, 6);
        library.ReturnBook(book3, retunDate);

        library.LibraryContents();

    }
}
