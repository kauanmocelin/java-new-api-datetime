package calculation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChroneExamples {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(1987, 11, 10,12,0,0);

        System.out.println(ChronoUnit.DAYS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(birthday, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthday, LocalDateTime.now()));
    }
}
