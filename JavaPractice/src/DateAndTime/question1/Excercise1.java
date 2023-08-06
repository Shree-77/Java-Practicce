package DateAndTime.question1;

import java.util.Calendar;

public class Excercise1 {
    public static void main(String[] args) {
        int year=2017;
        int month=Calendar.JUNE;
        int date=1;
        Calendar calendar= Calendar.getInstance();
        calendar.clear();
        System.out.println();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DATE,date);

        System.out.println(calendar.getTime());

    }
}
