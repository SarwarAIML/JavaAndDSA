package com.gs.functionalInterfaces.function;

import com.gs.data.Student;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> stringFunction = name-> name.toUpperCase();
    static Function<String,String> addSomething = name -> name.concat("something");

    public static void main(String[] args) {
        System.out.println(stringFunction.apply("java8"));
        System.out.println(stringFunction.andThen(addSomething).apply("newJava8::"));

    }
}