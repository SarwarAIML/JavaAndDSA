package com.gs.numericstreams;

import com.gs.streams.StreamsLimitSkipExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class NumericStreamsExample {
    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream().reduce(0,(a,b)->a+b); //unboxing operations Integer to int
    }
    public static int sumOfNumbersIntStreams(){
        return IntStream.rangeClosed(1,6).sum();
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumOfNumbers(integers));
        System.out.println(sumOfNumbersIntStreams());
    }
}