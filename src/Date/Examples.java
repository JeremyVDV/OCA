package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class ExampleLocalDateTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDateTime ldt = LocalDateTime.of(2017,1,1,0,0);
        ldt.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Format date ISO_DATE: " + ldt.format(DateTimeFormatter.ISO_DATE));
        ldt = ldt.plusWeeks(5);
        System.out.println("Added 5 weeks: " + ldt.format(DateTimeFormatter.ISO_DATE));


        System.out.println("Get every month between 2017, 1 and 5");
        LocalDateTime start = LocalDateTime.of(2017,1,1,0,0);
        LocalDateTime end = LocalDateTime.of(2017,5,1,0,0);
        Period p = Period.ofMonths(1);

        while(start.isBefore(end)) {
            System.out.println("Geef elke maand terug " + start.format(DateTimeFormatter.ISO_DATE));
            start = start.plus(p);
        }
    }
}