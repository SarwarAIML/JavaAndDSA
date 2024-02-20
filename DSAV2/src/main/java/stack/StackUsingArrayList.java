package stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public void push(int x){
        arrayList.add(x);
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        return  arrayList.remove(arrayList.size() - 1);
    }
    public int peak(){
        if (isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        return arrayList.get(arrayList.size()-1);
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    public int size(){
        return arrayList.size();
    }

    public static void main(String[] args) {
        StackUsingArrayList stackUsingArrayList = new StackUsingArrayList();
        stackUsingArrayList.push(10);
        stackUsingArrayList.push(20);
        stackUsingArrayList.push(30);
        System.out.println(stackUsingArrayList.pop());
        System.out.println(stackUsingArrayList.pop());
        stackUsingArrayList.push(5);
        System.out.println(stackUsingArrayList.pop());
    }

}