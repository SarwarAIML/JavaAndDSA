package com.gs.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

    public static Optional<String> ofNullable(){
        Optional<String> optionalString = Optional.ofNullable("Hello");
       // Optional<String> optionalString = Optional.ofNullable(null); //it will return Optional.empty();
        return optionalString;
    }

    public static Optional<String> of(){
        Optional<String> optionalString = Optional.of("Hello");
      //  Optional<String> optionalString = Optional.of(null);//it will return null
        return optionalString;
    }

    public static Optional<String> empty(){

        return Optional.empty();
    }


    public static void main(String[] args) {
        System.out.println("ofNullable::: "+ofNullable().get());
        System.out.println("of::: "+of());//you may expect null pointer exception if of method returning null object
        System.out.println("empty::: "+empty());

    }
}