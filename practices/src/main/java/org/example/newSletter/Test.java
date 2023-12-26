package org.example.newSletter;

public interface Test {

    public void m1();
}

class Child implements Test{

    @Override
    public void m1() {
        System.out.println("child m1");
    }

    public static void main(String[] args) {
        Test t = new Child();
        t.m1();

    }
}
