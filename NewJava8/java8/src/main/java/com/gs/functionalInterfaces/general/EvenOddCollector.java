package com.gs.functionalInterfaces.general;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddCollector {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = evenOddMap.get(true);
        List<Integer> oddNumbers = evenOddMap.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println(evenOddMap);
    }
}