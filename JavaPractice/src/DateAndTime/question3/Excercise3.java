package DateAndTime.question3;

import java.util.Calendar;
import java.util.TimeZone;

public class Excercise3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " "
        + calendar.get(Calendar.MINUTE) + " "+calendar.get(Calendar.SECOND));
    }
}
