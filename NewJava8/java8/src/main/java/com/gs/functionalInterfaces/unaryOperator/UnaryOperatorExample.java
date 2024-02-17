package com.gs.functionalInterfaces.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static UnaryOperator<String> unaryOperator = s -> s.concat(" Java");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Hello"));
    }
}