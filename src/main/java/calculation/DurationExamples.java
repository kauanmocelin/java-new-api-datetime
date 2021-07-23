package calculation;

import java.time.Duration;
import java.time.LocalTime;

// Responsible to handle Time: hour, minute, second, etc
public class DurationExamples {

    public static void main(String[] args) {
        Duration duration = Duration.ofDays(1);
        System.out.println(duration);

        Duration ofHours = Duration.ofHours(1);
        System.out.println(ofHours);

        Duration ofMinutes = Duration.ofMinutes(500);
        System.out.println(ofMinutes);

        Duration between = Duration.between(LocalTime.now(), LocalTime.of(18, 0));
        System.out.println(between);

        Duration plus = between.plusMillis(1000);
        System.out.println(plus);
    }
}
