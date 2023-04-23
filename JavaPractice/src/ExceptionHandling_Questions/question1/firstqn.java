package ExceptionHandling_Questions.question1;
/**
 *  Write a program that asks the user to input a set of floating-point values. When the user enters a value that is not a number,
 *   give the user two more chances to enter the value.After three chances, quit reading input. Add all correctly specified values
 *   and print the sum when the user is done entering data. Use exception handling to detect improper inputs.
 */

import java.util.Scanner;

public class firstqn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number = 0;
        int attempt = 0;

        while (attempt < 3) {
            try {
                System.out.println("Enter any decimal number : ");
                number = in.nextDouble();

                break;

            } catch (Exception e) {
                System.out.println("Invalid Input");
                attempt++;
                if(attempt==3)
                    break;
            }
            in.nextLine();
        }
        System.out.println(number);
    }
}
