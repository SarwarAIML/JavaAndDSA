package com.gs.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamsBoxedExample {
    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0,(x,y)->x+y);
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("duration is sequantial stream: " +duration);
        return sum;
    }
    public static int parallelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0,(x,y)->x+y);
        long duration = System.currentTimeMillis()-startTime;
        System.out.println("duration is Parallel stream: " +duration);
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(toList());


        sequentialSum(integerList);
        parallelSum(integerList);
    }
}