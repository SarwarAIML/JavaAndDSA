package stack;

public class TwoStackUsingArray {
    private int top1;
    private int top2;
    private int cap;
    private int[] arr;
    public TwoStackUsingArray(int n){
        this.cap = n;
        this.top1 = -1;
        this.top2 = n;
        arr = new int[n];

    }
    public boolean push1(int x){
       if (top1 < top2-1){
           top1++;
           arr[top1] = x;
           return true;
       }
       return false;
    }
    public  boolean push2(int x){
        if (top1 < top2-1){
            top2--;
            arr[top2] = x;
            return true;
        }
        return false;
    }
    public  Integer pop1(){
        if (top1>=0){
            int x = arr[top1];
            top1--;
            return x;
        }
        return null;
    }

    public  Integer pop2(){
        if (top2 < cap){
            int x = arr[top2];
            top2++;
            return x;
        }
        return null;
    }

    public static void main(String[] args) {
        TwoStackUsingArray ts=new TwoStackUsingArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());
    }

}