package stack;

class Node {
    int data ;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyStackUSingleLinkedList {
        Node head;
        int size ;

    public MyStackUSingleLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size ++;
    }
    public int pop(){
        if (head == null)
            return Integer.MAX_VALUE;
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public int size(){
        return size;
    }
    public int peek(){
        if (head == null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    public static void main(String[] args) {

        MyStackUSingleLinkedList s=new MyStackUSingleLinkedList();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
