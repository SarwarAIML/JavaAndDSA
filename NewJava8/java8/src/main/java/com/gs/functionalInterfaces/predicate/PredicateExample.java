package com.gs.functionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {


    private final static Predicate<Integer> predicate = integer-> integer%2==0;
    private final static Predicate<Integer> predicate1 = integer-> integer%5==0;
    public static void predicateAnd(int number){
        System.out.println(predicate.and(predicate1).test(number));
    }
    public static void predicateOR(int number){
        System.out.println(predicate.or(predicate1).test(number));
    }
    public static void PredicateNagate(int number){
        System.out.println(predicate.or(predicate1).negate().test(number));
    }


    public static void main(String[] args) {
        System.out.println(predicate.test(10));
        predicateAnd(25);
        predicateOR(8);
        PredicateNagate(8);
    }
}