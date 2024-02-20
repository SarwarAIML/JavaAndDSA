package stack;

import java.util.*;

//this is the one of the popular interview question
//implementation is same only you have to process the element from reverse end
public class NextGreatestElementOfArray {

    public static List<Integer> printNextGreaterElement(int[] arr){
        int n = arr.length;
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
      //  System.out.print("-1"+" ");
        list.add(-1);
        stack.push(arr[n-1]);
        for (int i = n-2; i >=0 ; i--) {
            while ((!stack.isEmpty()) && (stack.peek() <= arr[i])){
                stack.pop();
            }
            int rmg = stack.isEmpty() ? -1: stack.peek();
            list.add(rmg);
           stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,15,10,8,6,12,9,18};
        List<Integer> integerList = printNextGreaterElement(arr);
        System.out.println(integerList);
    }
}