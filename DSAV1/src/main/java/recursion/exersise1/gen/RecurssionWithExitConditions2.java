package recursion.exersise1.gen;

public class RecurssionWithExitConditions2 {
    public static void fun1(int n){
        if (n == 0)
            return;
        System.out.println("there is exit condition given::");
        fun1(n-1);

    }
    public static void main(String[] args) {
        fun1(5);
    }
}
