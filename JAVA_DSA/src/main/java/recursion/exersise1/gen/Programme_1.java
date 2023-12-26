package recursion.exersise1.gen;

public class Programme_1 {
    public static void fun1(int n){
        if (n == 0) return;
      //  System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }



    public static void main(String[] args) {
        fun1(3);
    }
}
