package DateAndTime.question11;

import java.time.LocalDate;

public class Exercise11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.plusDays(-10));
        System.out.println(today.plusDays(10));
    }
}
