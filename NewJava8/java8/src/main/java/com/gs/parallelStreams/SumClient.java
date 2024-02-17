package com.gs.parallelStreams;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .forEach(sum::performSum);//500500
        System.out.println(sum.getTotal());
        System.out.println("=====================================");

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);//1001000 you will get unexpected result here
        System.out.println(sum.getTotal());
    }
}