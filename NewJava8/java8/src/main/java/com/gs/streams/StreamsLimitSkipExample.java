package com.gs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream().limit(2).reduce((a,b)->a+b);
    }
    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3)
                .reduce((a,b)->a+b);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> optionalLimitSum = limit(integerList);
        optionalLimitSum.ifPresent(System.out::println);
        Optional<Integer> optionalSkipSum = skip(integerList);
        optionalSkipSum.ifPresent(System.out::println);
    }
}