package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeRun {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        datetime = datetime.plusDays(7);
        System.out.println(datetime.getDayOfWeek());
        System.out.println(datetime);

        datetime = datetime.minusDays(datetime.getDayOfWeek().getValue() - 1);
        System.out.println(datetime.getYear());
        System.out.println(datetime.getMonthValue());
        System.out.println(datetime.getDayOfMonth());
        datetime = LocalDateTime.of(datetime.getYear(), datetime.getMonthValue(), datetime.getDayOfMonth(), 0, 0, 0);

        System.out.println("date");
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime dt = date.atTime(0, 0,0);
        System.out.println(dt);
    }
}
