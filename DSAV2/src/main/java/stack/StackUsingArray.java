package stack;

public class StackUsingArray<Integer> {
    int[] arr ;
    int top ;
    int cap;
    public StackUsingArray(int cap){
        this.top = -1;
        this.cap = cap;
        this.arr = new int[cap];
    }
    public void push(int x){
        if (top==cap-1){
            throw new RuntimeException("Stack overflow");
        }
        top++;
        arr[top] = x;
    }
    public int pop(){
        if (top == -1){
            throw new RuntimeException("Stack underflow");
        }
        int res = arr[top--];
        return res;
    }
    public int peak(){
        if (top==-1){
            throw new RuntimeException("Stack underflow");
        }
        return arr[top];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(10);
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        System.out.println(stackUsingArray.peak());
        System.out.println(stackUsingArray.pop());
    }
}