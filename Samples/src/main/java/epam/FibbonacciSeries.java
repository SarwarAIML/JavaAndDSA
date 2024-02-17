package epam;

public class FibbonacciSeries {

    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Fibonacci Series up to " + limit + ":");
        printFibonacciSeries(0, 1, limit);
    }
    public static void printFibonacciSeries(int first, int second, int limit) {
        if (first <= limit) {
            System.out.print(first + " ");
            printFibonacciSeries(second, first + second, limit);
        }
    }
}