package linkedList.singleLinkedList.palindrom;


import java.util.ArrayDeque;
import java.util.Deque;

 class Node{
    char data ;
   Node next ;
    public Node(char data){
        this.data = data;
        this.next = null;
    }

}

public class Palindrome {


    /**
     *
     * @param head
     * @return
     * to check the list palindrome or not
     * it is naive method which take extra O(n)space
     */
    public boolean isPalindromeListNaive(Node head){
        Deque<Character> stack = new ArrayDeque<>();
        for (Node current = head; current != null; current= current.next)
            stack.push(current.data);
        for (Node current = head; current != null; current= current.next)
            if (stack.pop() != current.data)
                return false;
        return true;
    }

    public static boolean isPalindrome(Node head){
       if (head == null) return true;
       Node slow = head;
       Node fast = head;
       while (fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       Node rev = reverseList(slow.next);
       Node current = head;
       while (rev != null){
           if (rev.data != current.data)
               return false;
           rev = rev.next;
           current = current.next;
       }
    return true;
    }

     static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String args[])
    {
        Node head=new Node('g');
        head.next=new Node('f');
        head.next.next=new Node('g');
        if(isPalindrome(head))
            System.out.print("Yes");
        else
            System.out.print("No");

    }


}
