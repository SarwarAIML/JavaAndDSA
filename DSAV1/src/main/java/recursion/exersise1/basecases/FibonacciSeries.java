package recursion.exersise1.basecases;

public class FibonacciSeries {

    public static int fib(int n){
        if (n == 0 || n == 1)
            return n ;
        return fib(n-1) + fib(n-2); //fib(0) and fib(1) is the corner case
        //that is n =  and n == 1 is the corner case here or we also called the base case
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}
