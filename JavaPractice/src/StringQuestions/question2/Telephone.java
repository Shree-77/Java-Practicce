package StringQuestions.question2;

import java.util.Scanner;

/**
 * Write an application that inputs a telephone number as a string in the form (555) 555-5555. The application should extract
 *   the area code (the first three digits of the phone number) as a token, and the last four digits of the phone number as a token.
 *   The seven digits (the first three digits and the last four digits) of the phone number should be concatenated into one string and
 *   be printed.
 */
public class Telephone {
    public static void main(String[] args) {
        String telephone;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the telephone number in the format : (555)-555-5555 : ");
        telephone = in.nextLine();
        String first = telephone.substring(1,4);
        String last = telephone.substring(10,14);
        String concatenated = first.concat(last);

        System.out.println(concatenated);
    }
}
