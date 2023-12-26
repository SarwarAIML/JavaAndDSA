package stack;

import java.util.ArrayList;

public class MyStackUsingArrayList {

    ArrayList<Integer> list = new ArrayList<Integer>();

    public void push(int data){
        list.add(data);
    }
    public int pop(){
        int res = list.get(list.size() - 1);
        list.remove(list.size()-1);
        return res;
    }
    public int peek(){
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "MyStackUsingArrayList{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {

        MyStackUsingArrayList s=new MyStackUsingArrayList();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s);
    }

}
