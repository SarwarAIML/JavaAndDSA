package com.gs.functionalInterfaces.function;

import java.util.function.Function;

public class FunctionExample1 {

    static  Function<String,String> stringFunction = string -> string.toUpperCase().concat(" World");

    public static String performConcat(String string){
        return stringFunction.apply(string);
    }
    public static void main(String[] args) {
        String returnString = performConcat("Hello");
        System.out.println(returnString);
    }
}