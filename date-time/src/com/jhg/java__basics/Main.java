package com.jhg.java__basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedTime = ZonedDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy :: hh:mm");

        String dateTimeFormat = dateTime.format(format);

        System.out.println(time);
        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(dateTimeFormat);
        System.out.println(zonedTime);
        System.out.println(zonedTime.getOffset());
    }
}
