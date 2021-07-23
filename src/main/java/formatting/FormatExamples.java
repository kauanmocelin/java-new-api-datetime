package formatting;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class FormatExamples {

    public static void main(String[] args) {
        DateTimeFormatter formatterISO = DateTimeFormatter.ISO_DATE;
        formatterISO.format(LocalDateTime.now());

        DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        // Locale.setDefault(Locale.US); // To change FormatStyle FULL
        DateTimeFormatter formatterFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);

        System.out.println(formatterShort.format(LocalDateTime.now()));
        System.out.println(formatterMedium.format(LocalDateTime.now()));
        System.out.println(formatterFull.format(ZonedDateTime.now()));

        // Custom formatter
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        System.out.println(customFormat.format(LocalDateTime.now()));

        // To format from Object LocalDateTime
        System.out.println(LocalDateTime.now().format(customFormat));

        // To parse string date based on custom format
        TemporalAccessor parse = customFormat.parse("29-07-2019 11-39-47");
        LocalDateTime localDateTime = LocalDateTime.from(parse);
        System.out.println(localDateTime);
    }
}
