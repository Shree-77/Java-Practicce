package DateAndTime.question9;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Birthday in YYYY-MM-DD format ");
        String input = scan.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
Date bday = null;
        try{
            bday=dateFormat.parse(input);
        }catch (ParseException e){
            System.out.println("Invalid Date format");
        }

        Calendar birthdate = Calendar.getInstance();
        birthdate.setTime(bday);

        int age=now.get(Calendar.YEAR)-birthdate.get(Calendar.YEAR);
        if(now.get(Calendar.MONTH)<=birthdate.get(Calendar.MONTH)&&
        now.get(Calendar.DAY_OF_MONTH)<birthdate.get(Calendar.DAY_OF_MONTH)){
            age--;
        }
        System.out.println(age);

    }
}
