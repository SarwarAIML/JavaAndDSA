package com.gs.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {
    public static void main(String[] args) {

        //localDate
        LocalDate localDate = LocalDate.now();
        System.out.println(STR."LocalDate : \{localDate}");

        //localTime
        LocalTime localTime = LocalTime.now();
        System.out.println(STR."LocalTime : \{localTime}");
        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(STR."LocalDateTime : \{localDateTime}");

    }
}