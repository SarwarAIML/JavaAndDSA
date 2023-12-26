package org.example.tejasNetwork;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
        Queue<Integer> queue1 ;
        Queue<Integer> queue2 ;


    public MyStack (){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue1.offer(x);
        while (queue2.isEmpty()){
            queue1.offer(queue2.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if (emolty()){
            throw  new RuntimeException("queue is empty");
        }
       return queue2.peek();
    }

}
