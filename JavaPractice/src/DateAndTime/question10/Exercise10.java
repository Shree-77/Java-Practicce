package DateAndTime.question10;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Exercise10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate then = LocalDate.of(2002, Month.JUNE,5);
        Period diff=Period.between(then,date);
        System.out.println(diff);
    }
}
