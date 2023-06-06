package oca.exam14;

import java.time.*;
import java.time.format.*;

public class Shiny{

    public static void main(String args[]){

        DateTimeFormatter f1 =
                DateTimeFormatter.ofPattern("MMM dd, yyyy"); // Jun 06, 2023

        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15); // 2018-01-15
        LocalDate d2 = d.plusDays(1); // 2018-01-16

        System.out.print(f1.format(d) + " "); //2018-01-15 -> Jan 15, 2018
        System.out.print(d2.format(f1) + " ");//2018-01-16 -> Jan 16, 2018

        //Jan 15, 2018 Jan 16, 2018
    }
}