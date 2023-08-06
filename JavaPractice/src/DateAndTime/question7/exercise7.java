package DateAndTime.question7;

import java.util.Calendar;
import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Calendar month = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a month : ");
        int input = scanner.nextInt();
        if(input<0||input>12){
            System.out.println("Invalid Input");
        }
       else {
            month.set(Calendar.YEAR, input,Calendar.DATE);
            System.out.println(month.getActualMaximum(Calendar.DAY_OF_MONTH));
        }
    }
}
