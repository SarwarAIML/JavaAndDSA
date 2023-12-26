package Mathematics;

public class FactorialOfAnumber {
    public static void main(String[] args) {
        System.out.println("Factorial of number ::"+ FactorialOfAnumber.factorial(5));
        System.out.println("Factorial of number ::"+ FactorialOfAnumber.fact(5));
    }

    public static int factorial(int n){
        if(n == 0 || n==1)
            return 1;
      int res = 1;
        for (int i = 2; i <=n ; i++)
             res = res * i;
        return res;
    }

    public static int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
}
