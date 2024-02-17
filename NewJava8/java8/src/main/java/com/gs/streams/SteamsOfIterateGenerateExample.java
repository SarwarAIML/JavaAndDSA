package com.gs.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SteamsOfIterateGenerateExample {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("sarwar", "Imraan", "Afreen", "BAHAR");
        stringStream.forEach(System.out::println);
        System.out.println(":::::::::::::::::::Iterate Example:::::::::::");
        Stream<Integer> integerStream = Stream.iterate(1, x -> x * 2)
                .limit(10);
        integerStream.forEach(System.out::println);
        System.out.println("steams generate example");
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(5)
                .forEach(System.out::println);
    }
}