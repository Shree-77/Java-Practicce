package StringQuestions.question4;

import java.util.Scanner;

public class Code3digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer code for a character (0-255): ");
        int code = scanner.nextInt();
        char c = (char) code;
        System.out.println("The corresponding character is: " + c);
        System.out.println("All possible three-digit codes and corresponding characters:");
        for (int i = 0; i <= 255; i++) {
            String codeStr = String.format("%03d", i);
            char ch = (char) i;
            System.out.println(codeStr + " -> " + ch);
        }
    }
}
