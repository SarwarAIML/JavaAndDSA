package Mathematics.test;

public class Factorial {

    public static int getFactorial(int n){
        if (n == 0 || n==1)
            return 1;
        int res = 1;
        for (int i = 2; i <=n ; i++) {
            res = res * i;
        }
        return res;
    }

    public static int getFactRec(int n){
        if (n == 0)
            return 1;
        return n * getFactRec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactRec(5));
    }
}
