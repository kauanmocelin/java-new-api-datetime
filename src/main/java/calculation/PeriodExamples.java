package calculation;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// Responsible to handle Date: day, month, year, etc
public class PeriodExamples {

    public static void main(String[] args) {
        Period period = Period.of(1, 5, 3);
        System.out.println(period);

        Period years = Period.ofYears(5);
        System.out.println(years);

        Period between = Period.between(LocalDate.now(), LocalDate.of(2022, Month.AUGUST, 6));
        System.out.println(between);

        Period plusDays = between.plusDays(10);
        System.out.println(plusDays);

        Period until = LocalDate.now().until(LocalDate.of(2022, Month.AUGUST, 6));
        System.out.println(until);

        LocalDate nowPlusFiveYears = LocalDate.now().plus(years);
        System.out.println(nowPlusFiveYears);
    }
}
