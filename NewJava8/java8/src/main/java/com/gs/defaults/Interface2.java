package com.gs.defaults;

public interface Interface2 extends Interface1{

    public default void methodB(){
        System.out.println("inside methodB ");
    }
    public default void methodA(){
        System.out.println(STR."inside methodA ::\{Interface2.class}");
    }
}