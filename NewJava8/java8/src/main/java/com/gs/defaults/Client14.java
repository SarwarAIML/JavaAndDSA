package com.gs.defaults;

public class Client14 implements Interface1,Interface4{

    public  void methodA(){
        System.out.println(STR."inside methodA :: \{Client14.class}");
    }

    public static void main(String[] args) {
        Client14 client14 = new Client14();
        client14.methodA();
    }
}