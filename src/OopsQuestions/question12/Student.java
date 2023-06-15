package OopsQuestions.question12;

public class Student extends Person {
    String Regno;

    public Student(String name, String address, int phone_no, String email_address, String regno) {
        super(name, address, phone_no, email_address);
        Regno = regno;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + "]";
    }

}
