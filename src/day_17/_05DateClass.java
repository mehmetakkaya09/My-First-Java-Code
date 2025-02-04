package day_17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _05DateClass {

    public static void main(String[] args) {
        // 3000
        // Regression
        // 3 Jahren
        // 52 mal in einem Jahr
        // 156
        // erste Jahr hatten wir ein Bug in Recordings & Course Material - sdt20d
        // wir haben dieses Bug gehandelt.
        // 3. Jahr wurde nochmal gleiche Bug existiert.
        // wir müssen Datums wissen -- wann haben wir das gehandelt. und wie haben wir das gemacht.

        // Datum Info kann ich alle details erreichen.

        Date date = new Date();

        long time = date.getTime();

        System.out.println("time = " + time);

        //1738702219000
        //1738702243582

        LocalDate localDate = LocalDate.now();

        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();

        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDateTime = " + localDateTime);

        int dayOfYear = localDate.getDayOfYear();

        System.out.println("dayOfYear = " + dayOfYear);

        int second = localTime.getSecond();
        System.out.println("second = " + second);

    }


}
