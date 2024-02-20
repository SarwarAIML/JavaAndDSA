package com.gs.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(STR."Current Date is \{localDate}");

        LocalDate localDate1 = LocalDate.of(2018, 03,03);
        System.out.println(localDate1);

        System.out.println(STR."Year Day Date \{LocalDate.ofYearDay(2018, 365)}");

        //System.out.println("Epoch Day " + LocalDate.ofEpochDay(1));


        /**
         * Getting Values from Local Date
         */
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println(STR."Day of Month using get : \{localDate.get(ChronoField.DAY_OF_MONTH)}");

        /**
         * Modifying Values in Local Date
         */
        System.out.println(STR."Plus Weeks  : \{localDate.plusWeeks(1)}");
        System.out.println(STR."Plus Years : \{localDate.plusYears(1)}");
        System.out.println(STR."Plus Days \{localDate.plusDays(1)}");
        System.out.println(STR."Plus Months : \{localDate.plusMonths(1)}");
        System.out.println(STR."Minus Months : \{localDate.minusMonths(1)}");
        System.out.println(STR."Chrono Unit : \{localDate.minus(2, ChronoUnit.YEARS)}");
        System.out.println(STR."With Year : \{localDate.withYear(2019)}");
        System.out.println(STR."With Year Chrono Field : \{localDate.with(ChronoField.YEAR, 2019)}");
        System.out.println(STR."With Temporal Adjusters : \{localDate.with(TemporalAdjusters.lastDayOfMonth())}");
        System.out.println(STR."With Temporal Adjusters : \{localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY))}"); // maps to the first friday of the week

        /**
         * Unsupported Scenarios
         */
        //  System.out.println("Chrono Unit : " + localDate.minus(2, ChronoUnit.SECONDS));
        System.out.println(STR."is Supported : \{localDate.isSupported(ChronoUnit.DAYS)}");

        /**
         * Additional Support Methods
         */
        System.out.println(STR."Not a Leap Year : \{localDate.isLeapYear()}");
        LocalDate localDate2 = LocalDate.of(2020,01,31);
        System.out.println(STR."Leap Year : \{localDate2.isLeapYear()}");

        System.out.println(STR."isBefore : \{localDate1.isBefore(localDate)}");
        System.out.println(STR."isAfter : \{localDate1.isAfter(localDate)}");
        System.out.println(STR."isEqual : \{localDate1.isEqual(localDate)}");
    }
}