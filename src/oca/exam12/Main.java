package oca.exam12;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2019, Month.DECEMBER, 23);
        System.out.println(localDate);

        System.out.println(localDate.plusDays(300));
        System.out.println(localDate.minusDays(4000));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM -> yyyy : dd");
        System.out.println(formatter.format(localDate));
        System.out.println(localDate.format(formatter));

    }
}
