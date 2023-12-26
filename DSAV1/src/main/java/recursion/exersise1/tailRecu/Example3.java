package recursion.exersise1.tailRecu;

public class Example3 {

    public static int factorial(int n,int k){
        if (n==0 || n==1)
            return k;
        return factorial(n-1,n*k);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }
}
