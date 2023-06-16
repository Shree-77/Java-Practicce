package Collections.question6;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * You are considering creating a library management system, where librarians
 * can keep track of the books they have, the patrons borrowing the books, and
 * the borrow/return dates. Develop and test a Java program that uses HashMap,
 * with Book as the key and Patron as the value, and implements methods where a
 * librarian can add, remove, and update books and patrons to the system.
 */

public class Library {

    private HashMap<Book, Patron> Librarian;

    public Library() {
        Librarian = new HashMap<>();
    }

    public void addBook(Book book, Patron patron) {
        Librarian.put(book, patron);
    }

    public void removeBook(Book book, Patron patron) {
        Librarian.remove(book, patron);
    }

    public void updateBook(Book book, Patron patron) {
        if (Librarian.containsKey(book)) {
            Librarian.put(book, patron);

        } else {
            System.out.println("Book not found!!");
        }
    }

    public void BoorowBook(Book book, Patron patron, LocalDate Borrowed_date) {
        book.setBorrowed_date(Borrowed_date);
        Librarian.put(book, patron);
    }

    public void ReturnBook(Book book, LocalDate Returned_date) {
        book.setReturned_date(Returned_date);
        Librarian.remove(book, Returned_date);
    }

    public void LibraryContents() {
        for (Book book : Librarian.keySet()) {
            System.out.println("Book_name : " + book.Book_name +
                    " Author Name : " + book.getAuthor() + " BorrowedDate : " + book.getBorrowed_date() +
                    " Returned Date : " + book.Returned_date);
            System.out.println();
        }
    }

}
