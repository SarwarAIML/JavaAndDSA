package stack;

import java.util.Stack;

public class GetMinimumEfficient {
    Stack<Integer> stack = new Stack<>();
    int min ;
    public void push(int x){
        if (stack.isEmpty()){
            min = x;
            stack.push(x);
        }else if (x <= min){
            stack.push(2*x-min);
            min = x;
        }else {
            stack.push(x);
        }
    }
    public int pop(){
        int top = stack.pop();
        if (top <= min){
            int res = min;
            min = 2*min -top ;
            return res;
        }else {
            return top;
        }
    }
    int peek() {
        int top= stack.peek();
        return ((top<=min)? min : top);
    }
    int getMin() {
        return min;
    }

    public static void main(String[] args) {
        GetMinimumEfficient s=new GetMinimumEfficient();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin() );
    }
}