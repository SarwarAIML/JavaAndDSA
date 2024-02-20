package com.gs.defaults;

public interface Interface4 {

    public default void methodA(){
        System.out.println(STR."inside methodA :: \{Interface4.class}");
    }
}