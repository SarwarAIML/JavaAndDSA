package stack;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * Largest Rectangular Area in a Histogram. This shape
 * will comprise a series of adjacent bars, each with
 * a specified height stored in an array. To simplify the problem,
 * we will assume that all bars possess the same width, measuring 1 unit.
 * We will look at both the Naive solution
 * and the Efficient solution (using stack) to solve this problem.
 *
 * solution
 * in stock span problem we were computing the span when we were pushing item into the stack
 * here what we are going to do that we are going to compute the largest area of the histogram
 * with current item being the smallest bar when we pop this item from the stack
 * we have to find the previous smaller and the next smaller
 * finding out the previous smaller you just need to look below the current item in the stack
 * and to find the next smaller we just need to look at the current item
 * //we process the items when we popped them
 * //here popping the element is just opposite to the logic of previous greater and next greater
 * problems
 *
 * //need to understand once again
 */
public class LargestRectangularAreaInHistogram {
    public static int getMaxArea(int[] arr){
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        int tp;
        int curr;
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            while ( (!stack.isEmpty()) && arr[stack.peek()] >= arr[i] ) {
                 tp = stack.pop();
                 curr = arr[tp] * (stack.isEmpty() ?  i: i-stack.peek()-1);
                 res = Math.max(res,curr);
            }
            stack.add(i);
        }
        while (!stack.isEmpty()  ){
            tp = stack.pop();
            curr = arr[tp] * (stack.isEmpty() ? n : n - stack.peek()-1);
            res = Math.max(res,curr);
        }
       return res;
    }
    public static void main(String[] args) {
        int[] arr1=new int[]{6,2,5,4,1,5,6};
        System.out.println("Maximum Area: "+getMaxArea(arr1));
    }
}