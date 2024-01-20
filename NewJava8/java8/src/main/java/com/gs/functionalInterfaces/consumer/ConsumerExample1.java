package com.gs.functionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = s -> System.out.println(s.toUpperCase());
        stringConsumer.accept("Gulam Sarwar");
    }
}