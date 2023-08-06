package DateAndTime.question6;

import java.util.Calendar;

public class exercise6 {
    public static void main(String[] args) {
        Calendar date= Calendar.getInstance();
        date.set(Calendar.DAY_OF_MONTH,date.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(date.getTime());
    }
}
