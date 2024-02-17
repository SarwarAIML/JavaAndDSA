package com.gs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxMinExampleUsingReduce {

    public static int findMaxValue(List<Integer> integerList){
        System.out.println("==================findMaxValue()================================");
        return integerList.stream().reduce(0,(x, y) -> x>y?x:y);
    }
    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        System.out.println("==================findMaxValueOptional()================================");
        return integerList.stream().reduce((x, y) -> x>y?x:y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        System.out.println("==================findMaxValueOptional()================================");
        return integerList.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,4,5,6,7,10);
        //here it will return zero if list is empty which is not correct ,it should return empty
        System.out.println(findMaxValue(integers));
        Optional<Integer> maxValueOptional = findMaxValueOptional(integers);
        maxValueOptional.ifPresent(System.out::println);
        Optional<Integer> minValueOptional = findMinValueOptional(integers);
        minValueOptional.ifPresent(System.out::println);
    }
}