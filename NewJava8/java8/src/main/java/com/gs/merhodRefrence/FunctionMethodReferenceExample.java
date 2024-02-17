package com.gs.merhodRefrence;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCaseLambda = string -> string.toUpperCase();
    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("toUpperCaseLambda :: "+toUpperCaseLambda.apply("java8"));
        System.out.println("toUpperCaseMethodReference :: "+toUpperCaseMethodReference.apply("java8"));
    }
}