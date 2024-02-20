package stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackImpInJava {
    public static void main(String[] args) {
    //    Stack<Integer> stack = new Stack<>(); this imp is synchronized
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();//this for concurrent use
        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.pop());
        arrayDeque.push(5);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.isEmpty());
        System.out.println(arrayDeque.size());
    }
}