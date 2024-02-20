package com.gs.defaults;

public class Client123 implements Interface1,Interface2,Interface3{

    public  void methodA(){
        System.out.println(STR."inside methodA :: \{Client123.class}");
    }
    //call resolution order
    //1->class that implements the default method
    //2-> sub interface that extends the parent interface and overriding the default methods

    public static void main(String[] args) {
        Client123 client123 = new Client123();
        client123.methodA();//resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }
}