package org.example.epam;

public class FibbonacciSeries {

    public static void main(String[] args) {

     /*   int n = 10;
        for (int i = 0; i < 100; i++) {
            int retValue = printFibbonacciSeries(i,0);
        }
*/
        int limit = 100;
        System.out.println("Fibonacci Series up to " + limit + ":");
        printFibonacciSeries(0, 1, limit);


    }

    private static int printFibbonacciSeries(int n,int count) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;

            return printFibbonacciSeries(n-1,count++)+ printFibbonacciSeries(n-2,count++);
    }

    public static void printFibonacciSeries(int first, int second, int limit) {
        if (first <= limit) {
            System.out.print(first + " ");
            printFibonacciSeries(second, first + second, limit);
        }
    }
}
