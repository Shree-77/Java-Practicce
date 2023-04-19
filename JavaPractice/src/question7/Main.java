package question7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student #" + (i+1));

            System.out.print("Registration Number: ");
            String regNumber = reader.readLine();

            System.out.print("Name: ");
            String name = reader.readLine();

            System.out.print("Date of Birth (yyyy-mm-dd): ");
            String dobStr = reader.readLine();
            LocalDate dob = LocalDate.parse(dobStr);

            System.out.print("Courses (comma-separated, up to three): ");
            String[] courses = reader.readLine().split(",", 3);

            Student student = new Student(regNumber, name, dob, courses);
            students[i] = student;
        }

        System.out.printf("%-20s%-20s%-10s\n", "Registration Number", "Name", "Age");
        for (Student student : students) {
            System.out.printf("%-20s%-20s%-10d\n", student.getRegno(), student.getName(), student.getAge());
        }
    }
}

