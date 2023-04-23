package ExceptionHandling_Questions.question1;

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
