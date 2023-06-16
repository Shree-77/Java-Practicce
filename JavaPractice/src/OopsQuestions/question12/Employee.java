package OopsQuestions.question12;

public class Employee extends Person {
    String Office;
    double salary;

    public Employee(String name, String address, int phone_no, String email_address, String office, double salary) {
        super(name, address, phone_no, email_address);
        Office = office;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Name =" + name + "]";
    }

}
