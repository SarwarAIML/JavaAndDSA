package com.gs.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int value = 4 ;
    public static void main(String[] args) {
   //     int value = 4 ;
        //this will work with instance variables
        value++;
        Consumer<Integer> consumer = (i) ->{
            System.out.println(value + i);

        };
    //    value = 5; not allowed since getting used in lambda
        consumer.accept(5);
    }
}