package mathematics;

import java.util.Arrays;

public class Mathematics {

    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static boolean isPalindromeNumbers(int number) {

        int temp = number;
        int reverseNumber = 0;
        while (temp != 0) {
            int r = temp % 10;
            reverseNumber = reverseNumber * 10 + r;
            temp = temp / 10;
        }
        return reverseNumber == number;
    }


    /**
     * @param n
     * @return We have 2 approaches to solve the problem: Iterative approach & Recursive approach
     * 1) Iterative Approach
     * Time Complexity: O(n)
     * <p>
     * Space Complexity: O(1)
     */
    public static int IterativeFactorialOfNumber(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * @param n
     * @return We have 2 approaches to solve the problem: Iterative approach & Recursive approach
     * 1) Iterative Approach
     * Time Complexity: O(n)
     * <p>
     * Space Complexity: O(n)
     */
    public static int recursiveFactorialOfNumber(int n) {

        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorialOfNumber(n - 1);
    }


    /**
     * Problem Description: We are given a number.
     * The task is to find the Number of Trailing Zeros in the factorial of the number.
     *
     * @param number 1) Naive Approach:
     *               time : O(n)
     *               space : O(1)
     *               A simple method is to first calculate the factorial of n, then count trailing 0s in the
     *               result (We can count trailing 0s by
     *               repeatedly dividing the factorial by 10 till the remainder is not 0).
     *               <p>
     *               But, this method can cause overflow for slightly bigger numbers as
     *               the factorial of a number is a big number. So, we prefer the Efficient Approach
     */

    public static int countTrailingZerosIterative(int number) {

        if (number == 0 || number == 1)
            return 1;
        int fact = 1;
        int count = 0;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }

    /**
     * 2) Efficient Approach
     *
     * @param n
     * @return Trailing 0s in n! = Count of 5s in prime factors
     * of n! = floor(n/5) + floor(n/25) + floor(n/125) +..
     * <p>
     * time : log(n)
     * space O(1)
     */
    public static int countTrailingZeroAfterFactorialOfANumber(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + (i / 5);
        }
        return res;
    }


    /**
     * @param a
     * @param b
     * @return Problem Description: We are given two numbers. The task is to find the GCD / HCF of the numbers.
     * <p>
     * GCD: Greatest Common Divisor
     * <p>
     * HCF: Highest Common Factor
     * <p>
     * We have 3 approaches to solve the problem: Naive Approach, Euclidean Approach & Optimised Euclidean Approach
     * <p>
     * 1) Naive Approach
     * <p>
     * The basic idea is to find the minimum of the two numbers and then, traverse from the min number to 1,
     * to find the highest factor which is also a factor of the other number.
     * <p>
     * Time Complexity: O(min(a,b))
     * <p>
     * Auxiliary Space: O(1)
     */

    public static int GCDofTwoNumbersNaive(int a, int b) {

        int gcd = Math.min(a, b);

        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }

    /**
     * @param a
     * @param b
     * @return 2) Euclidean Approach:
     * <p>
     * The idea of this algorithm is, the GCD of two numbers doesn’t change
     * if the smaller number is subtracted from the bigger number.
     * This is the Euclidean algorithm by subtraction. It is a process of repeat subtraction,
     * carrying the result forward each time until the result is equal to any one number being subtracted.
     * <p>
     * Time Complexity: O(min(a,b))
     * <p>
     * Auxiliary Space: O(1)
     */
    public static int EuclideanHCF(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * @param a
     * @param b
     * @return Time Complexity: O(log(min(a,b))
     * Auxiliary Space: O(1)
     */
    public static int optimizedEuclideanHCF(int a, int b) {

        if (b == 0)
            return a;
        else
            return optimizedEuclideanHCF(b, b % a);
    }

    /**
     * @param a
     * @param b
     * @return 1) Naive Approach
     * <p>
     * The basic approach is to find the maximum of both numbers, then increase from that number,
     * till we find a number that is completely divisible by both numbers.
     * <p>
     * Time Complexity: O(a*b - max(a,b))
     */
    public static int NaiveLCM(int a, int b) {

        int lcm = Math.max(a, b);
        while (true) {

            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }
        return lcm;
    }

    /**
     * @param a
     * @param b
     * @return 2) Efficient Approach
     * <p>
     * An efficient solution is based on the below formula for LCM of two numbers ‘a’ and ‘b’.
     * <p>
     * a x b = LCM(a, b) * GCD (a, b)
     * <p>
     * LCM(a, b) = (a x b) / GCD(a, b)
     * <p>
     * Here, we calculate GCD using, Optimised Euclidean Algorithm.
     * <p>
     * Then, further, calculate LCM.
     * <p>
     * Time Complexity: O(log(min(a,b))
     */
    public static int LCM_Efficient(int a, int b) {

        int LCM = (a * b) / HCF(a, b);
        return LCM;
    }

    private static int HCF(int a, int b) {

        if (b == 0)
            return a;
        return HCF(b, a % b);
    }

    /**
     * @param n
     * @return 1) Naive Approach:
     * <p>
     * Iterate from 2 to  (n-1) and check if any number in this range divides n.
     * If the number divides n, then it is not a prime number.
     * <p>
     * Time Complexity: O(n)
     * <p>
     * Auxiliary Space: O(1)
     */
    public static boolean isPrime_Naive(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * @param n
     * @return 2) Efficient Approach:
     * <p>
     *  Idea is : divisors of a number always appear in pairs
     *  ex : 30 - (1,30),(2,15),(3,10),(5,6)
     *  65 : (1,65),(5,13)
     *  25 : (1,25),(5,5)
     *
     *  if(x*y) is a pair then (x*x) = n
     *  and if x <= y then x*x <= n or x <= root(n)
     *
     * Iterate through all numbers from 2 to square root of n and for every number
     * check if it divides n [because if a number is expressed as n = xy and any
     * of the x or y is greater than the root of n, the other must be less than the root value].
     * If we find any number that divides, we return false.
     * <p>
     * Time Complexity: O(sqrt(n))
     * <p>
     * Auxiliary space: O(1)
     */
    public static boolean isPrime_Efficient1(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     *
     * @param n
     * @return
     *
     * 3) More Efficient Approach
     *
     * Steps:
     *
     * We will deal with a few numbers such as 1, 2, and 3, and the numbers which are divisible by 2 and 3 in separate cases.
     * For the remaining numbers, we iterate from 5 to sqrt(n) and check for each iteration whether (that value) or (that value + 2) divides n or not and increment the value by 6 [because any prime can be expressed as 6n+1 or 6n-1].
     * If we find any number that divides, we return false, else true.
     * Time complexity: O(sqrt(n))
     *
     * Auxiliary space: O(1)
     *
     *
     */
    static boolean isPrime_Efficient3(int n)
    {
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6)
        {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    /**
     *
     * @param n
     *
     * Problem Description: We are given a number n. The task is to print all the divisors of n.
     *
     * Divisor: A divisor is a number that completely divides a number.
     */
    public static int printAllDivisor_Naive(int n){

        for (int i =1 ; i <=n ; i++) {
            if (n % i == 0)
                System.out.println("divisor of number ::"+ n +" is :: "+i);
        }
        return 1;
    }

    /**
     *
     * @param n
     * @return
     *
     * 2) Efficient Approach
     *
     * If we look carefully, all the divisors are present in pairs.
     *
     * For gs if n = 100, then the various pairs of divisors are: (1,100), (2,50), (4,25), (5,20), (10,10)
     *
     * Using this fact we could speed up our program significantly. We,
     * however, have to be careful if there are two equal divisors as in the case of (10, 10). In such case, we’d print only one of them.
     *
     * We iterate through all numbers from 1 to square root of n in this case.
     *
     * Time Complexity: O(sqrt(n))
     *
     * Auxiliary Space: O(1)
     */
    public static int printAllDivisor_Efficient (int n){

        for (int i =1 ; i*i <=n ; i++) {
            if (n % i == 0) {
                System.out.println("divisor of number ::" + n + " is :: " + i);
                if (i != n / i)
                    System.out.println(n / i);
            }
        }
        return 1;
    }

    /**
     *
     * @param n
     * @return
     *
     *
     */
    public static void printAllDivisor_Efficient_Sorted (int n){

        int i;
        for ( i =1 ; i*i <n ; i++) {
            if (n % i == 0) {
                System.out.println("divisor of number ::" + n + " is :: " + i);
            }
        }

        for ( ; i >=1 ; i--) {
            if ( n % i == 0)
                System.out.println(n/i);
        }
    }

    /**
     *
     * @param n
     *
     * Problem Description: Given a number n,
     * print all primes smaller than or equal to n. It is also given that n is a small number.
     */
    public static void SieveOfEratosthenes_PrintAllPrimeNumber(int n){

        for (int i = 1; i <=n ; i++) {
            if (isPrime_Efficient3(i)){
                System.out.println("prime numbers are :: "+i);
            }
            System.out.println();
        }

    }

    /**
     *
     * @param n
     *
     * So the prime numbers are the unmarked ones: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     *
     * Time Complexity: O(n*log(log(n)))
     *
     *
     * Auxiliary Space: O(n)
     */

    public static void sieve(int n){
        if (n <=1)
            return;
        boolean isBooleanArray[] = new boolean[n+1];
        Arrays.fill(isBooleanArray,true);
        for (int i = 2; i*i <=n ; i++) {
            if (isBooleanArray[i]){
                for (int j = 2*i; j <=n ; j = i+j) {
                    isBooleanArray[j] = false;
                }
            }
        }

        for (int i = 2; i <=n ; i++) {
            if (isBooleanArray[i])
                System.out.println("prime numbers are :: "+i);
        }
    }

    /**
     *
     * @param n
     *
     * Optimised Seive and Shorter implementation of Optimised Seive have been discussed in the
     *
     * So the prime numbers are the unmarked ones: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     *
     * Time Complexity: O(n*log(log(n)))
     *
     *
     * Auxiliary Space: O(n)
     */
    public static void sieve_optimized(int n){
        if (n <=1)
            return;

        boolean[] isPrimeArray = new boolean[n+1];
        Arrays.fill(isPrimeArray , true);

        for (int i = 2; i <=n ; i++) {
            if (isPrimeArray[i]) {
                System.out.println("prime number is :::"+i);
                for (int j = i*i; j <=n ; j=j+i) {
                        isPrimeArray[j] = false;
                }
            }

        }
    }

    /**
     *
     * @param n
     * @param x
     * @return
     * 1) Naive Approach:
     *
     * A simple solution to calculate pow(x, n) would multiply x exactly n times.
     * We can do that by using a simple for loop
     *
     * Time Complexity: O(n)
     *
     *
     * Auxiliary Space: O(1)
     *
     */
    public static int power_Iterative_Naive(int x,int n){

        int power = 1;
        for (int i = 1; i <=n ; i++) {
            power = power *x ;
        }
        return power;
    }

    /**
     *
     * @param x
     * @param n
     * @return
     *
     * 2) Efficient Approach
     *
     * The problem can be recursively defined by:
     *
     * power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
     *
     * power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd
     *
     * Time Complexity: Theta(logn)
     *
     *
     * Auxiliary Space: Theta(logn) // Since uses recursion and height of tree goes upto logn height
     *
     *
     */
    public static int power_recursive_efficient(int x , int n){
        if ( n == 0){
            return 1 ;
        }
        int power = power_recursive_efficient(x,n/2);
        power = power * power;
        if (n % 2 == 0)
            return power ;
        else return x * power;
    }


    public static void main(String[] args) {

        System.out.println("===============Count Number Of Digits Start==============");
        System.out.println(countDigit(145));
        System.out.println("===============Count Number Of Digits End==============" + "\n");

        System.out.println("===============isPalindromeNumbers Start==============");
        System.out.println(isPalindromeNumbers(363));
        System.out.println("===============isPalindromeNumbers End==============" + "\n");


        System.out.println("===============IterativeFactorialOfNumber Start==============");
        System.out.println(IterativeFactorialOfNumber(5));
        System.out.println("===============IterativeFactorialOfNumber End==============" + "\n");

        System.out.println("===============recursiveFactorialOfNumber Start==============");
        System.out.println(recursiveFactorialOfNumber(8));
        System.out.println("===============recursiveFactorialOfNumber End==============" + "\n");

        System.out.println("===============countTrailingZerosIterative Start==============");
        System.out.println(countTrailingZerosIterative(8));
        System.out.println("===============countTrailingZerosIterative End==============" + "\n");


        System.out.println("===============countTrailingZeroAfterFactorialOfANumber Start==============");
        System.out.println(countTrailingZeroAfterFactorialOfANumber(8));
        System.out.println("===============countTrailingZeroAfterFactorialOfANumber End==============" + "\n");

        System.out.println("===============GCDofTwoNumbersNaive Start==============");
        System.out.println(GCDofTwoNumbersNaive(10, 15));
        System.out.println("===============GCDofTwoNumbersNaive End==============" + "\n");

        System.out.println("===============EuclideanGCP Start==============");
        System.out.println(EuclideanHCF(10, 15));
        System.out.println("===============EuclideanGCP End==============" + "\n");

        System.out.println("===============EuclideanGCP Start==============");
        System.out.println(EuclideanHCF(10, 15));
        System.out.println("===============EuclideanGCP End==============" + "\n");


        System.out.println("===============NaiveLCM Start==============");
        System.out.println(NaiveLCM(3, 7));
        System.out.println("===============NaiveLCM End==============" + "\n");


        System.out.println("===============LCM_Efficient Start==============");
        System.out.println(LCM_Efficient(3, 7));
        System.out.println("===============LCM_Efficient End==============" + "\n");

        System.out.println("===============isPrime_Naive Start==============");
        System.out.println(isPrime_Naive(8));
        System.out.println("===============isPrime_Naive End==============" + "\n");

        System.out.println("===============isPrime_Naive Start==============");
        System.out.println(isPrime_Efficient1(8));
        System.out.println("===============isPrime_Naive End==============" + "\n");

        System.out.println("===============isPrime_Naive Start==============");
        System.out.println(isPrime_Efficient3(8));
        System.out.println("===============isPrime_Naive End==============" + "\n");


        System.out.println("===============printAllDivisor_Naive Start==============");
        System.out.println(printAllDivisor_Naive(20));
        System.out.println("===============isPrime_Naive End==============" + "\n");



        System.out.println("===============printAllDivisor_Efficient Start==============");
        System.out.println(printAllDivisor_Efficient(25));
        System.out.println("===============printAllDivisor_Efficient End==============" + "\n");


        System.out.println("===============printAllDivisor_Efficient_Sorted Start==============");
        printAllDivisor_Efficient_Sorted(25);
        System.out.println("===============printAllDivisor_Efficient_Sorted End==============" + "\n");

        System.out.println("===============printAllDivisor_Efficient_Sorted Start==============");
        printAllDivisor_Efficient_Sorted(25);
        System.out.println("===============printAllDivisor_Efficient_Sorted End==============" + "\n");


        System.out.println("===============SieveOfEratosthenes_PrintAllPrimeNumber Start==============");
        SieveOfEratosthenes_PrintAllPrimeNumber(30);
        System.out.println("===============SieveOfEratosthenes_PrintAllPrimeNumber End==============" + "\n");


        System.out.println("===============sieve Start==============");
        sieve(30);
        System.out.println("===============sieve End==============" + "\n");

        System.out.println("===============sieve_optimized Start==============");
        sieve_optimized(30);
        System.out.println("===============sieve_optimized End==============" + "\n");


        System.out.println("===============power_Iterative_Naive Start==============");
        System.out.println(power_Iterative_Naive(2,3));
        System.out.println("===============power_Iterative_Naive End==============" + "\n");



        System.out.println("===============power_recursive_efficient Start==============");
        System.out.println(power_recursive_efficient(2,3));
        System.out.println("===============power_recursive_efficient End==============" + "\n");
    }
}