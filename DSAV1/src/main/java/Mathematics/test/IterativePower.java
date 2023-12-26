package Mathematics.test;


/* Iterative Function to
calculate (x^n) in O(logn) */
public class IterativePower {

    public static int power(int x,int n){
        int res = 1;
        while (n> 0){
            // If n is odd,
            // multiply
            // x with result
            if ((n & 1) == 1){
                res = res * x;
            }
            // n must be even now
            n = n >> 1; // n = n/2
            x = x * x; // Change x to x^2
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
