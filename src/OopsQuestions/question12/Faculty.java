package OopsQuestions.question12;

public class Faculty extends Employee {
    String Rank;

    public Faculty(String name, String address, int phone_no, String email_address, String office, double salary,
            String rank) {
        super(name, address, phone_no, email_address, office, salary);
        Rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty [Name =" + name + "]";
    }

}
