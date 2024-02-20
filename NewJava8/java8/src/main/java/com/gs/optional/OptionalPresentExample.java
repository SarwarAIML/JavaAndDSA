package com.gs.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
       // Optional<String> helloOptional = Optional.ofNullable("Hello Optional");
        Optional<String> helloOptional = Optional.ofNullable(null);
        //isPresent
        System.out.println(helloOptional.isPresent());//it return false if Optional is null
        helloOptional.ifPresent(System.out::println);//it will not print anything is Optional returning Null

    }
}