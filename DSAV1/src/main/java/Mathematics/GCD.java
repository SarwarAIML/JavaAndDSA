package Mathematics;

public class GCD {
   //euclidean algorithm

    public static int gcd(int a,int b){
        if (b==0)
            return a;
        else
            return gcd(b,a%b);
    }
    //general Implementations
    public static int gcd1(int a,int b){
        int res = Math.min(a,b);
        while (res > 0)
        {
            if (a%res ==0 && b%res==0){
                break;
            }
            res --;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("GCD of (12,15) is :::"+GCD.gcd1(12,15));
        System.out.println("GCD of (12,15) is :::"+GCD.gcd(12,15));

    }
}
