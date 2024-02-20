package stack;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * problem statement
 * We have a series of N daily price quotes for a
 * stock, and we need to calculate the span of the stock's
 * price for all N days. The span Si of the stock's price on a
 * given day i is defined as the maximum number of consecutive days
 * just before the given day, for which the price of the stock on the
 * current day is less than its price on the given day.
 *
 * solution
 * if stack is not empty
 * solution span = (index of current element - index of closet element of left side)
 * and if stack is empty then index of current element +1
 *
 * idea is that
 * //1 -> process from left most element,print that element and push the index of left most element
 * //2-> start loop with 1 to n-1 process each element by taking while loop
 *      //2.1-> check stack of peak/top <= current element then keep popping the stack elements
 *      //2.2 -> if stack is empty then print i+1 as index otherwise print (i-stack peak/top)
 * //3 -> push the current element index
 */

public class StockSpanProblem {

    public static void printStockSpan(int[] arr){
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(0);
        System.out.print(1 +" ");
        for (int i = 1; i < arr.length ; i++) {
            while ((!stack.isEmpty()) && arr[stack.peek()] <= arr[i])
            {
                stack.pop();
            }
            int span = stack.isEmpty()? (i+1):(i-stack.peek());
            System.out.print(span+" ");
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{18,12,13,14,11,16};
        printStockSpan(arr);
    }
}