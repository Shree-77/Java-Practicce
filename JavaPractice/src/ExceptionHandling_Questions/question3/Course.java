package ExceptionHandling_Questions.question3;



import java.util.Scanner;

/**
 *    Develop a class called Course containing course code, course name and number of credits assigned for the course.
 *    Read courses’ information through keyboard. Develop a user-defined exception called InvalidCreditAssigned to throw exception whenever the
 *    number of credit assigned to a course is less than three and an exception called InValidCourseCode should also be thrown if the course code does
 *    not start with AEC. Show the usage of these exceptions in try-catch-finally block and in throws clause.
 */

public class Course {
    public static void main(String[] args) throws InvalidCreditAssignedException {
        String CourseCode;
        String CourseName;
        int credits;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Course name : ");
        CourseName=in.nextLine();

        try{
            System.out.println("Enter Credits : ");
            credits= in.nextInt();
            if(credits<3){
                throw new InvalidCreditAssignedException("Credits less than 3");
            }
            System.out.println("Enter the Course Code : ");
            CourseCode = in.nextLine();
            if(CourseCode.startsWith("AEC"))
                throw new InvalidCourseCodeException("Course Code Starts with AEC ");
        }catch (InvalidCreditAssignedException e){
            throw new InvalidCreditAssignedException("Error " + e.getMessage());
        }catch (InvalidCourseCodeException e){
            throw new InvalidCourseCodeException("Error : " +e.getMessage());
        }finally {
            in.close();
        }
    }
}
