package stack;

import java.util.Stack;

public class GetMinimum1 {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> austack = new Stack<>();
    public void push(int x){
        if (mainStack.isEmpty()){
            mainStack.push(x);
            austack.push(x);
        }else {
            mainStack.push(x);
            if (austack.peek() >= mainStack.peek())
                austack.push(x);
        }
    }
    public int pop(){
        if (mainStack.peek() == austack.peek())
            austack.pop();
        return mainStack.pop();
    }
    public int top(){
        return mainStack.peek();
    }
    public int getMin(){
        return austack.peek();
    }




    public static void main(String[] args) {
        GetMinimum1 s=new GetMinimum1();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        //   s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin() );
    }
}