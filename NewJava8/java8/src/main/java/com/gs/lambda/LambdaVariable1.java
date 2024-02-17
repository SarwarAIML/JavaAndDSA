package com.gs.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        //lambda variable and local variable can not be same
        int i = 0;
        Consumer<Integer> c1 = (i1) -> {
            System.out.println("Value is : "+i);
        };
    }
}