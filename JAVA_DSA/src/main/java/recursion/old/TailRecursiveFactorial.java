package recursion.old;

public class TailRecursiveFactorial {

    public static int fact(int n){
        if (n==0 ){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int tailFact(int n,int k){

       if (n==0 ) return k;
       return tailFact(n-1,k*n);
    }


    public static void main(String[] args) {

        System.out.println(TailRecursiveFactorial.fact(5));
        System.out.println(TailRecursiveFactorial.tailFact(5,1));
    }
}
