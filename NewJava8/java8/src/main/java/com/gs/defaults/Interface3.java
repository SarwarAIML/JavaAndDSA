package com.gs.defaults;

public interface Interface3 extends Interface2{
    public default void methodC(){
        System.out.println("inside methodC ");
    }
}