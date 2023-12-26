package dsa1.recurssion;

import java.awt.*;

public class RecursionProblems {

    /**
     *
     * @param n
     *
     *
     */
    public static void decimalToBinary(int n){

        if (n == 0)
            return;
        decimalToBinary(n/2);
        System.out.println(n%2); //it will print last digit of decimal number
    }


    /**
     *
     * @param n
     * Time Complexity: O(n)
     * Auxiliary Space: O(n)
     */
    public static void printNto1(int n) {

        if (n == 0)
            return;
        System.out.print(" "+n);
        printNto1(n-1);

    }


    /**
     *
     * @param n
     * Time Complexity: O(n)
     * Auxiliary Space: O(n)
     */
    public static void printOneTo_N(int n) {

        if (n == 0)
            return;
        printOneTo_N(n-1);
        System.out.print(" "+n);
    }

    public static int factorial(int n){
        if (n ==0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }

    public static int fibonacci(int n) {
            if (n == 0)
                return 0 ;
            if (n == 1)
                return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumOfDigitsIterative(int num) {

        int sum = 0 ;
        while (num > 0){
            int r = num %  10 ;
            sum = sum + r;
            num = num / 10;
        }
        return sum;
    }

    public static int sumDigitsRecursive(int num){
            if (num <= 9)
                return num;
        return sumDigitsRecursive(num/10) + num % 10;
    }

    public static int sunOfNaturalNumbers(int n) {
        if (n==0)
            return 0;

        return n + sunOfNaturalNumbers(n-1);
    }

    /**
     *
     * @param str
     * @return
     */
    public static boolean isPalindromeIterative(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while (start >= end){
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end --;
        }
        return true;
    }

    /**
     *
     * @param str
     * @param start
     * @param end
     * @return
     */
    public static boolean isPalindromeRec(String str,int start,int end)
    {

        if (start >= end)
            return true;
       return  str.charAt(start) == str.charAt(end) && isPalindromeRec(str,start++,end--);
    }

    /**
     *
     * @param n
     * @param a
     * @param b
     * @param c
     * @return
     *
     * this one is rope cutting problem
     */
    public static int maxCuts(int n,int a,int b,int c){

        if (n == 0)
            return 0;

        if (n < 0) {
            return -1;
        }

        int maxCuts = Math.max(maxCuts(n-a, a, b, c),
                Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));

        if (maxCuts == -1)
            return -1;
        return maxCuts+1;

    }

    /**
     *
     * @param str
     * @param curr
     * @param index
     */
    public static void generateSubsetsString(String str , String curr,int index) {

        if (index == str.length()){
            System.out.println(curr);
            return;
        }
        generateSubsetsString(str,curr,index+1);
        generateSubsetsString(str,curr+str.charAt(index),index+1);
    }

    /**
     *
     * @param n
     * @param A
     * @param B
     * @param C
     */
    public static void TOH(int n,char A, char B,char C) {
        if (n ==1)
        {
            System.out.println("Move 1 from "+A +" to "+ C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("Move "+ n +" from "+A +" to "+ C);
        TOH(n-1,B, A ,C);
    }

    /**
     *
     * @param n
     * @param k
     * @return
     */
    public static int JosephusProblem(int n ,int k){
        if (n == 1)
            return 0;

        return (JosephusProblem(n-1,k) + k) % n ;
    }

    /**
     *
     * @param arr
     * @param n
     * @param sum
     * @return
     */
    static int countSubsets(int arr[], int n, int sum)
    {
        if(n==0)
            return sum==0? 1 : 0;

        return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
    }

    /**
     *
     * @param str
     * @param index
     */
    public static void permute(String str,int index){
        if (str.length()-1 == index){
            System.out.println(str);
            return;
        }else {
            for (int j = index; j <= str.length()-1 ; j++) {
                str = swap(str,index,j);
                permute(str,index+1);
                str = swap(str,index,j);
            }

        }
    }

    /**
     *
     * @param str
     * @param index
     * @param j
     * @return
     */
    private static String swap(String str, int index, int j) {
        char ch ;
        char[] chars = str.toCharArray();
        ch = chars[index];
        chars[index] = chars[j];
        chars[j] = ch;
        return String.valueOf(chars);
    }










    public static void main(String[] args) {


        System.out.println("===============JosephusProblem Start==============");
        System.out.println(JosephusProblem(7,3));
        System.out.println("===============JosephusProblem End==============" + "\n");

        System.out.println("===============TOH Start==============");
        TOH(3,'A','B','C');
        System.out.println("===============TOH End==============" + "\n");

        System.out.println("===============decimalToBinary Start==============");
         decimalToBinary(10);
        System.out.println("===============decimalToBinary End==============" + "\n");


        System.out.println("===============printNto1 Start==============");
        System.out.println();
        printNto1(10);
        System.out.println();
        System.out.println("===============printNto1 End==============" + "\n");

        System.out.println("===============printOneTo_N Start==============");
        System.out.println();
        printOneTo_N(10);
        System.out.println();
        System.out.println("===============printOneTo_N End==============" + "\n");



        System.out.println("===============factorial Start==============");
        System.out.println(  factorial(5));
        System.out.println("===============factorial End==============" + "\n");

        System.out.println("===============fibonacci Start==============");
        System.out.println(  fibonacci(10));
        System.out.println("===============fibonacci End==============" + "\n");

        System.out.println("===============sumOfDigitsIterative Start==============");
        System.out.println(  fibonacci(10));
        System.out.println("===============sumOfDigitsIterative End==============" + "\n");

        System.out.println("===============sumOfDigitsIterative Start==============");
        System.out.println(  sumOfDigitsIterative(12345));
        System.out.println("===============sumOfDigitsIterative End==============" + "\n");

        System.out.println("===============sumDigitsRecursive Start==============");
        System.out.println(  sumDigitsRecursive(12345));
        System.out.println("===============sumDigitsRecursive End==============" + "\n");

        System.out.println("===============sunOfNaturalNumbers Start==============");
        System.out.println(  sunOfNaturalNumbers(5));
        System.out.println("===============sunOfNaturalNumbers End==============" + "\n");

        System.out.println("===============isPalindromeIterative Start==============");
        System.out.println(  isPalindromeIterative("abcba"));
        System.out.println("===============isPalindromeIterative End==============" + "\n");


        System.out.println("===============isPalindromeIterative Start==============");
        System.out.println(  isPalindromeIterative("abcba"));
        System.out.println("===============isPalindromeIterative End==============" + "\n");



        System.out.println("===============maxCuts Start==============");
        System.out.println(  maxCuts(23,11,12,2));
        System.out.println("===============maxCuts End==============" + "\n");


        System.out.println("===============generateSubsetsString Start==============");
        generateSubsetsString("ABC","",0);
        System.out.println("===============generateSubsetsString End==============" + "\n");


    }

}
