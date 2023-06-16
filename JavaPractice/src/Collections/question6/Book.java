package Collections.question6;

import java.time.LocalDate;

public class Book {
    String Book_name;
    String Author;
    LocalDate Borrowed_date;
    LocalDate Returned_date;

    public LocalDate getReturned_date() {
        return Returned_date;
    }

    public void setReturned_date(LocalDate returned_date) {
        Returned_date = returned_date;
    }

    public LocalDate getBorrowed_date() {
        return Borrowed_date;
    }

    public void setBorrowed_date(LocalDate borrowed_date) {
        Borrowed_date = borrowed_date;
    }

    public Book(String book_name, String author) {
        Book_name = book_name;
        Author = author;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String patron) {
        Author = patron;
    }

    @Override
    public String toString() {
        return "Book [Book_name=" + Book_name + ", Author=" + Author + "]";
    }

}

class Patron {
    String name;
    String email;

    public Patron(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Patron [name=" + name + ", email=" + email + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
