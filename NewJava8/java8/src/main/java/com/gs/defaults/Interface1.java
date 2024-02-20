package com.gs.defaults;

public interface Interface1 {

    public default void methodA(){
        System.out.println(STR."inside methodA :: \{Interface1.class}");
    }
}