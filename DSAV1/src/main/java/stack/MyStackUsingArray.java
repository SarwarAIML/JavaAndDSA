package stack;

import java.util.Arrays;

public class MyStackUsingArray {
    int array[];
    int cap ;
    int top ;

    public MyStackUsingArray(int len){
        top = -1;
        cap = len;
        array = new int[cap];
    }
    public void push(int data){
        if (top == cap-1){
            System.out.println("stack is full .you can not push the items further");
            return;
        }
        top++;
        array[top] = data;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty .you can performed the pop operation");
            return Integer.MAX_VALUE;
        }
        int res = array[top];
        array[top]= 0;
        top --;
        return res;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    int peek(){
        if (top==-1){
            System.out.println("stack is empty ,you can't perform the peak operation ");
        }
        return array[top];
    }
    int size(){
        return top+1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        MyStackUsingArray stack = new MyStackUsingArray(10);
        stack.push(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}
