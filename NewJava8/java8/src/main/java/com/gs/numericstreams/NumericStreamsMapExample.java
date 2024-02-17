package com.gs.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamsMapExample {

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(value -> new Integer(value))
                .collect(toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong(i->i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i->i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Map to Object ::"+mapToObject());
        System.out.println("Map to mapToLong ::"+mapToLong());
        System.out.println("Map to mapToLong ::"+mapToDouble());
    }
}