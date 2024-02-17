package com.gs.numericstreams;

import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println("Range count:: "+intStream.count());
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        System.out.println("rangeClosed count :: "+IntStream.rangeClosed(1,50).count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        System.out.println("Long Stream rangeClosed count :: "+ LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();

        IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value+","));
    }
}