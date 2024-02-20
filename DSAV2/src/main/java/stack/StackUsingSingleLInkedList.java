package stack;

public class StackUsingSingleLInkedList {
    private Node head ;
    private int size ;
    static class Node{
        int data;
        Node next ;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    StackUsingSingleLInkedList(){
        this.head = null;
        this.size = 0;
    }
    public void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    public int pop(){
        if (head == null){
            throw new RuntimeException("Stack underflow");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
    public int peak(){
        if (head==null){
            throw new RuntimeException("Stack is underflow");
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackUsingSingleLInkedList usingSingleLInkedList = new StackUsingSingleLInkedList();
        usingSingleLInkedList.push(10);
        usingSingleLInkedList.push(20);
        usingSingleLInkedList.push(30);
        System.out.println(usingSingleLInkedList.peak());
        System.out.println(usingSingleLInkedList.pop());
        System.out.println(usingSingleLInkedList.peak());
        usingSingleLInkedList.push(5);
        System.out.println(usingSingleLInkedList.peak());
    }

}