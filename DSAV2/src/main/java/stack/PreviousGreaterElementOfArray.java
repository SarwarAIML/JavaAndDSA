package stack;

import java.util.ArrayDeque;

public class PreviousGreaterElementOfArray {

    /**
     *  Previous Greater Element . We are given an array of
     *  distinct integers, and our task is to find the closest
     *  (positive wise) greater element on left of every element.
     *  If there is no greater element on left, then we print -1.
     *  We will explore both the Naive and the
     *  Efficient Approach (using Stack) to solve the problem.
     * @param array
     * //stack solution
     * //use the stock span technique to solve this problem
     * //here we are pushing the element instead of index and remaining is the same
     *
     */

    public static void printPreviousGreaterElementOfArray(int[] array){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        System.out.print(-1+" ");
        stack.push(array[0]);
        for (int i = 1; i <array.length ; i++) {
            while ((!stack.isEmpty()) && (stack.peek() <= array[i])){
                stack.pop();
            }
           int pge = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(pge+" ");
            stack.push(array[i]);
        }


    }

    public static void main(String[] args) {
        int[] arr=new int[]{20,30,10,5,15};
        printPreviousGreaterElementOfArray(arr);
    }
}