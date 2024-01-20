package com.gs.lambda;

import java.util.SortedMap;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        //lambda syntax () -> {};
        //prior to java8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable1");
            }
        };
        new Thread(runnable).start();
        //with tha java8
        Runnable runnable1 = () ->
        {
            System.out.println("inside Runnable1.1");
        };
        new Thread(runnable1).start();
        new Thread(() -> System.out.println("inside Runnable2")).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside Runnable2.1");
            }
        }).start();

        Runnable runnableLambdaMultiStatements = () -> {
            System.out.println("Inside Runnable 3");
            System.out.println("Inside Runnable 3");
        };
        new Thread(runnableLambdaMultiStatements).start();
    }

}