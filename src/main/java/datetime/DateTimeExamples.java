package datetime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {

    public static void main(String[] args) {
        // Represents a Date: 06/08/1990
        LocalDate localDate = LocalDate.now();
        LocalDate localDateCustom = LocalDate.of(1990, Month.AUGUST, 6);
        localDateCustom.plusDays(1);
        localDateCustom.plusMonths(1);
        localDateCustom.minusDays(1);
        localDateCustom.minusMonths(1);

        // Represents a Time: 11:40:00.000
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeCustom = LocalTime.of(11, 40, 00, 100000);

        // Represents a Date and Time: 06/08/1990 11:40:00.000
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime.of(localDate,  localTime);

        // Represent a instant on time line (milisseconds from 01/01/1970)
        // 09/08/1990 11:40:00 GMT/UMC
        Instant instant = Instant.now();
        Instant startInstant = Instant.ofEpochMilli(0);
        Instant.now().plus(1, ChronoUnit.DAYS);
//        Instant.now().plus(1, ChronoUnit.MONTHS); // Error because miliseconds quantity may can vary

        // LocalDateTime with timezone
        // 06/08/1990 11:40:00 GMT-3 (America/Sao_Paulo)
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        ZonedDateTime.of(localDateTime, ZoneId.of("America/Montevideo"));

        // Add hour to date
        LocalDateTime localDateAddHour = LocalDate.now().atTime(15, 0, 0);
        System.out.println(localDateAddHour);

        // Change LocalDate and LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now().withDayOfMonth(30);
        LocalDateTime localDateTime2 = LocalDateTime.now().with(ChronoField.DAY_OF_MONTH, 30);
        System.out.println(localDateTime2);

    }
}
