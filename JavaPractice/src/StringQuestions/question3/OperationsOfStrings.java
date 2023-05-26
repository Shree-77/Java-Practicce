package StringQuestions.question3;

import java.util.Scanner;

/**
 * Write an application involving switch-case-default that performs one of the
 * following actions:
 * (i) reads a line of text and outputs the text twice—once in all uppercase
 * letters and once in all lowercase
 * letters;
 * (ii) reads a line of text and a search character and uses String method
 * indexOf to determine the number
 * of occurrences of the character in the text;
 * (iii) reads a line of text, tokenizes the line using space characters as
 * delimiters and outputs only those
 * words beginning with the letter "b";
 * (iv) reads a line of text, tokenizes it using space characters as delimiters
 * and outputs only those words
 * ending with the letters "ED".
 */
public class OperationsOfStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to Perform the Operations:\n" +
                "1. Upper and LowerCase\n" +
                "2. IndexOF\n" +
                "3. Words Start with B\n" +
                "4. Words End with ED");

        int option = in.nextInt();

        switch (option) {
            case 1:
                UpperLower();
                break;
            case 2:
                IndexOF();
                break;
            case 3:
                Word_starts_B();
                break;
            case 4:
                Word_Ends_ED();
                break;
            default:
                System.out.println("Enter any number within 5");
        }
    }

    static void UpperLower() {
        String Text;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Text : ");
        Text = in.nextLine();
        System.out.println(Text.toLowerCase());
        System.out.println(Text.toUpperCase());
    }

    static void IndexOF() {
        String Text;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Line of Text : ");
        Text = in.nextLine();
        System.out.println("Enter character to search : ");
        char character = in.nextLine().charAt(0);

        int index = Text.indexOf(character);
        int count = 0;
        while (index != -1) {
            count++;
            index = Text.indexOf(character, index + 1);
        }
        System.out.println("The character '" + character + "' appears " + count + " times in the text.");
    }

    static void Word_starts_B() {
        String Text;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of Text : ");
        Text = in.nextLine();
        String[] Tokens = Text.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String token : Tokens) {
            if (token.charAt(0) == 'b') {
                answer.append(token);
            }
        }
        System.out.println(answer);
    }

    static void Word_Ends_ED() {
        String Text;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of Text : ");
        Text = in.nextLine();
        String[] Tokens = Text.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String token : Tokens) {
            if (token.endsWith("ed")) {
                answer.append(token);
            }
        }
        System.out.println(answer);
    }

}
