package recursion.exersise1.basecases;

public class Factorial {
    public static int fact(int n){
        if (n == 0)
            return 1;
        return n * fact(n-1);//fact(0) that is n == 0 would be a base case
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
