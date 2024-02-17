package com.gs.functionalInterfaces.BinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer*integer2;
        System.out.println( binaryOperator.apply(10,5));
        System.out.println("max and min by example using comparator");
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of max by ::"+maxBy.apply(10,15));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of max by ::"+minBy.apply(10,15));


    }
}