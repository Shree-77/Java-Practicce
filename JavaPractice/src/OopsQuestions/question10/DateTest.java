package OopsQuestions.question10;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(6, 5, 2002);
        date.displayDate();

        date.setDay(12);
        date.setMonth(12);
        date.setYear(2012);

        date.displayDate();
    }
}
