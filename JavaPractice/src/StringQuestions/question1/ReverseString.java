package StringQuestions.question1;
/**
 * Write an application that inputs a line of text and tokenizes the line using space character as delimiter
 *    and outputs the tokens in reverse order.
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = in.nextLine();

        String[] tokens = line.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
    }
}

