package Mathematics.test;

/**
 * a * b = lcm of (a,b) * HCF (a,b)
 * lcm of (a,b) = a*b / HCF (a,b)
 */

public class LCMofTwoNumbers {

    public static int getLCMofTwoNumbers(int a,int b)
    {
        return (a * b)/getHCFofTowNumbers(a,b) ;
    }

    private static int getHCFofTowNumbers(int a, int b) {
        if (b==0)
            return a;
        else
            return getHCFofTowNumbers(b,a % b);
    }

    public static void main(String[] args) {
        System.out.println(getLCMofTwoNumbers(4,6));
    }
}
