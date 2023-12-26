package recursion.exersise1.gen;

public class RecurssionDemo1 {
    public static void fun1(){
        System.out.println("there is no exit conditions::");
        //will give stack overflow since there is no exit conditions
        fun1();
    }
    public static void main(String[] args) {
        fun1();
    }
}
