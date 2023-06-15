package OopsQuestions.question12;

/**
 * Consider a class Person and its two subclasses named Student and
 * Employee. Make Faculty and Staff subclasses of Employee. A person
 * has a name, address, phone number, and email address. A student has a
 * registration number. An employee has an office and salary. A faculty member
 * has a rank. A staff member has a title. Override the toString method in each
 * class to display the person’s name. Write a test program that creates a
 * Person,
 * Student, Employee, Faculty, and Staff object and invokes their toString()
 * methods.
 */

public class Person {
    String name;
    String address;
    int phone_no;
    String email_address;

    public Person(String name, String address, int phone_no, String email_address) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.email_address = email_address;
    }

}
