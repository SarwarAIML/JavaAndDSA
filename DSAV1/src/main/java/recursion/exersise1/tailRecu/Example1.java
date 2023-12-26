package recursion.exersise1.tailRecu;

public class Example1 {
    public static void fun(int n){
        if (n==0)
            return;
        System.out.print(n +" ");
        fun(n-1);

    }

    public static void main(String[] args) {
        fun(5);
    }
}
