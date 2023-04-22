package OopsQuestions.question7;

import java.time.LocalDate;
import java.time.Period;

/**
 * Develop and test a Java class named Student with the (private) instance fields namely, registration
 * number, name, the date of birth and a list of a maximum of three courses a student has registered in. If
 * a student has registered in less than three courses then use null. Provide constructors for the class
 * showing how one constructor can call some other constructor and include accessor and mutator
 * methods for each of the instance fields. Include a method into the class to compute the age of a
 * student. Create an array of objects of three students after receiving input from the keyboard using
 * object of BufferedReader class and display for each student her/his registration number, name and age
 * in a tabular format with column header
 */
public class Student {
    private String regno;
    private String name;
    private LocalDate DOB;
    private String [] course;

    public Student(String regno, String name, LocalDate DOB, String[] course) {
        this.regno = regno;
        this.name = name;
        this.DOB = DOB;
        this.course = course;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public int getAge(){
        return Period.between(DOB,LocalDate.now()).getYears();
    }
    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }
}
