package StringQuestions.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = in.nextLine();

        // Split the line into tokens using space as delimiter
        String[] tokens = line.split(" ");

        // Output the tokens in reverse order
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
    }
}

