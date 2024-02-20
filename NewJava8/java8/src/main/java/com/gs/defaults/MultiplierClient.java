package com.gs.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> inputList = Arrays.asList(1,3,5);
        System.out.println(STR."Result is : \{multiplier.multiply(inputList)}");
        System.out.println(STR."Input List size is : \{multiplier.size(inputList)}");
        System.out.println(STR."Is Empty : \{Multiplier.isEmpty(inputList)}");
    }
}