package com.gs.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier,int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <numberOfTimes ; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sequentialStreamSum(){
        return IntStream.rangeClosed(1,100000).sum();
    }
    public static int parallelStreamSum(){
        return IntStream.rangeClosed(1,100000).parallel().sum();
    }


    public static void main(String[] args) {
        System.out.println("no of available processor ::"+Runtime.getRuntime().availableProcessors());

        System.out.println();
        System.out.println("Sequential Stream Result : "+
                checkPerformanceResult(ParallelStreamExample::sequentialStreamSum,20));

        System.out.println("Parallel Stream Result : "+
                checkPerformanceResult(ParallelStreamExample::parallelStreamSum,20));
    }
}