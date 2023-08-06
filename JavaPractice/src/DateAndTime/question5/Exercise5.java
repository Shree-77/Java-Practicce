package DateAndTime.question5;

import java.util.Calendar;

public class Exercise5 {
    public static void main(String[] args) {
        Calendar last = Calendar.getInstance();
        System.out.println(last.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
