package OopsQuestions.question12;

public class Staff extends Employee {
    String title;

    public Staff(String name, String address, int phone_no, String email_address, String office, double salary,
            String title) {
        super(name, address, phone_no, email_address, office, salary);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [Name =" + name + "]";
    }

}
