package Mathematics.test;

public class GCD_HCF_of_twoNumbers {

    /**
     * Euclidean Algorithm Code
     * @param a
     * @param b
     * @return
     *
     *        static int gcd(int a, int b)
     *    {
     * 		while(a!=b)
     *        {
     * 			if(a > b)
     * 				a = a - b;
     * 			else
     * 				b = b - a;
     *        }
     *
     * 		return a;
     *    }
     */
    public static int getGCD(int a,int b){
        if (b==0){
            return a;
        }else {
            return getGCD(b,a%b);
        }
    }

    public static void main(String[] args) {
        System.out.println(getGCD(12,15));
    }
}
