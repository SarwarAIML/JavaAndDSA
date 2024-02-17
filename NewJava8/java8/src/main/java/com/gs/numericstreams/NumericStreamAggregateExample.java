package com.gs.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is : "+sum);
        OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
        optionalInt.ifPresent(System.out::println);

        OptionalLong optionalmin = LongStream.rangeClosed(51, 100).min();
        optionalmin.ifPresent(System.out::println);

        OptionalDouble optionalDouble = LongStream.rangeClosed(51, 100).average();
        optionalDouble.ifPresent(System.out::println);
    }
}