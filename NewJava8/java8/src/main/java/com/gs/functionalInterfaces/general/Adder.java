package com.gs.functionalInterfaces.general;

@FunctionalInterface
public interface Adder {
    int sum(int a,int b);
}
class AdderTest{
    public static void main(String[] args) {
        Adder adder = (a,b)-> a+b;
        int sum = adder.sum(2, 5);
        System.out.println(sum);
    }
}