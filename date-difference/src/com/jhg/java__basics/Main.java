package com.jhg.java__basics;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(1981, 01, 29);
        LocalDate secondDate = LocalDate.of(1984, 05, 29);

        Period periodOfTime = Period.between(firstDate, secondDate);

        System.out.println("The difference of time is: ");
        System.out.println(periodOfTime.getYears() + " Years");
        System.out.println(periodOfTime.getMonths() + " Months");
        System.out.println(periodOfTime.getDays() + " Days");
    }
}
