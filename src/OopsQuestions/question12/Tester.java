package OopsQuestions.question12;

public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Shree", "Bangalore", 123456789, "Shree@gmail.com");
        Employee employee = new Employee("Dick", "Gotham", 1234567, "Dick@BAtman_DC", "Batcave", 736781);
        Staff staff = new Staff("CatWomen", "Gotham", 827356, "Busy@burgling.dc", "parties", 877, "Burgler");
        Student student = new Student("Robin", "Gotham", 0, "Robin_Dont_have@mobile", "DC001");
        Faculty faculty = new Faculty("Batman", "Gotham", 2534, "Batman@Dark.Dc", "Batcave", 72365892,
                "Senior_Faculty");

        System.out.println(employee.toString());
        System.out.println(staff.toString());
        System.out.println(student.toString());
        System.out.println(faculty.toString());
    }
}
