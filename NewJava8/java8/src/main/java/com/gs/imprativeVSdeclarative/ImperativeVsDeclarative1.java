package com.gs.imprativeVSdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative1 {
    public static void main(String[] args) {
        //imperative style of coding

        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum +=i;
        }
        //declarative style off coding

        int sum1 = IntStream.rangeClosed(1, 100).parallel().sum();
        System.out.println("imperative sum :"+sum);
        System.out.println("Declarative sum :"+sum1);

    }
}