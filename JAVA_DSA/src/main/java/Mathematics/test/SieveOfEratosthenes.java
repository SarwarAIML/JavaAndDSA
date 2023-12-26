package Mathematics.test;

import java.util.Arrays;

/**
 *The sieve of Eratosthenes is one of the most efficient ways to find all
 * primes smaller than n when n is smaller than 10 million or so (Ref Wiki).
 */
public class SieveOfEratosthenes {
    /**
     * Time Complexity: O(n*log(log(n)))
     * Auxiliary Space: O(n)
     * @param n
     */
    public static void sieve(int n){
        if (n<=1)
            return;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);

        for (int i = 2; i*i <= n ; i++) {
            
                if (isPrime[i]){
                    for (int j = i*i; j <=n ; j = j+i) {
                        isPrime[j] = false;
                    }
                }
        }
        System.out.println();
        for (int i = 2; i  <=n ; i++) {
            if (isPrime[i]){
                System.out.print(i +" ");
            }

        }

    }
    public static void main(String[] args) {
        sieve(18);
    }

}
