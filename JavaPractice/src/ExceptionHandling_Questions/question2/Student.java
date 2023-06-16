package ExceptionHandling_Questions.question2;

import java.util.Scanner;

/**
 * Develop a class called Student containing registration number, name and total credits registered by a student.Read students’ information through
 * keyboard. Develop a user-defined exception called CreditsOutOfRange to throw exception whenever the total number of credits registered by a student
 * is either less than 16 or greater than 24 and an exception called NameCaseException should also be thrown if the name of a student is not entered
 * in upper case letters. Show the usage of these exceptions in try-catch-finally block and in throws clause.
 */
public class Student {
    public static void main(String[] args) throws  CreditsOutofRangeException , NameCaseException{
        Scanner in = new Scanner(System.in);
        String Reg_no;
        String name;
        int credits;
        System.out.println("enter students Regno : ");
        Reg_no=in.nextLine();
        try {
            System.out.println("Enter name of the Student : ");
            name = in.nextLine();
            if(!name.equals(name.toUpperCase())){
                throw new NameCaseException("Name not in CAPS");
            }
            System.out.println("Enter credits : ");
            credits=in.nextInt();
            if(credits<16||credits>24){
                throw  new CreditsOutofRangeException("Invalid Credits");
            }
        }catch (NameCaseException e) {
            throw new NameCaseException("Error : " +e.getMessage());
        }catch (CreditsOutofRangeException e){
            throw new CreditsOutofRangeException("Error : " +e.getMessage());
        }finally {
            in.close();
        }
    }


}
