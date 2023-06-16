package Generics.Practice.question9;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Student {

    String Name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        Name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [Name=" + Name + ", age=" + age + ", grade=" + grade + "]";
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("BatMan", 36, "S"));
        students.add(new Student("Thomas Shelby", 30, "A+"));
        students.add(new Student("Shree", 20, "A"));

        System.out.println("StudentList");
        for (Student student : students) {
            System.out.println(student);
        }
        Collections.sort(students, new AgeComparator());

        System.out.println("\nStudents List sorted by Age (Increasing Order):");
        for (Student student : students) {
            System.out.println(student);
        }

    }

}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
