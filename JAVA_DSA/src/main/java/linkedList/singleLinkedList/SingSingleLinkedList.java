package linkedList.singleLinkedList;


import linkedList.singleLinkedList.old.SingleLinkedList;

import java.util.*;

public class SingSingleLinkedList {




      public void printlist(Node head) {
        Node curent = head;
        while (curent!=null){
            System.out.print(curent.data+" ");
            curent=curent.next;
        }
          System.out.println();
    }
    public void rPrint(Node head){
          if (head==null){
              return;
          }
        System.out.println(head.data+ " ");
          rPrint(head.next);
    }

    public Node addFirst(Node head,int data){
          Node temp = new Node(data);
             temp.next = head;
          return head;
    }
    public Node addLast(Node head,int data){
          Node temp = new Node(data);
          if (head == null)
              return temp;
          Node current = head;
          while (current.next !=null){
              current = current.next;
          }
        current.next = temp;
          return head;
    }

    /**
     *
     * @param head
     * @return
     * this delete first method
     */
    public Node deleteHead(Node head){
          if (head == null) return null;
          else
              return head.next;
    }
    public Node deleteLast(Node head){
        if (head == null)return null;
        if (head.next == null) return null;
        Node current = head ;
        while (current.next.next !=null){
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public Node addAt(Node head,int data,int pos){
        Node tmp = new Node(data);
        if (pos ==1){
            tmp.next = head;
            return tmp;
        }
        Node current = head ;
        for (int i = 1; i <=pos-2 && current !=null ; i++) {
            current = current.next;
        }
        if (current == null)
            return head;
        tmp.next = current.next;
        current.next = tmp;
        return head;
    }
    int search(Node head,int data){
        int pos =1 ;
        Node current = head;
        while (current != null){
            if (current.data == data){
                return pos;
            }else {
                pos++;
                current = current.next;
            }
        }
        return -1;
    }
    static int rsearch(Node head, int x){
        if(head==null)return -1;
        if(head.data==x)return 1;
        else{
            int res=rsearch(head.next,x);
            if(res==-1)return -1;
            else return res+1;
        }
    }
    public Node sortedInsert(Node head,int data){
        Node temp = new Node(data);
        if (head == null){
           return temp;
        }
        if (data < head.data){
            temp.next = head;
            return temp;
        }
        Node curent = head ;
        if (curent.next !=null && data < curent.data)
            curent = curent.next;
        temp.next = curent.next;
        curent.next = temp;
        return head;
    }

    public void printMiddle(Node head){
        if (head == null) return ;
        Node slow = head ;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print("niddle node ->"+slow.data);
    }

    /**
     *
     * @param head
     * @param n
     * using count/len variable
     */
    public void printNthFromEnd(Node head,int n){
        int len = 0;
        for (Node current = head; current!=null;current = current.next )
            len++;
        if (len < n)
            return;
        Node current = head;
        for (int i = 1; i < n-len+1 ; i++)
            current = current.next;
        System.out.println(n+"th node from the end is : "+current.data);
    }

    /**
     *
     * @param head
     * @param n
     * using 2 pointers
     */
    public void printNthNodeFromEndUsing2Pointers(Node head,int n){
        if (head == null) return;
        Node first = head;
        for (int i = 0; i <n ; i++) {
            if (first == null) return;
            first = first.next;
        }
        Node second = head;
        while (first!=null){
            second = second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }

    /**
     *
     * @param head
     * @return
     * using 3 pointers itrative solutions
     */
    public Node reverseNodeIterative(Node head){
        Node current = head ;
        Node prev = null;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    //this is for the practice
    public Node revreseTest(Node head){
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

    /**
     *
     * @param head
     * @return
     * quite tricky to understand
     */
    static Node recRevL(Node head){

        if(head==null||head.next==null)return head;
        Node rest_head=recRevL(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }

    /**
     *
     * @param current
     * @param prev
     * @return
     * it is using 3 pointers like iterative solutions
     * and list are sorted
     */
    public Node reverseRecrsively(Node current,Node prev){
        if (current == null) return prev;
        Node next = current.next;
        current.next = prev;
        return reverseRecrsively(next,current);
    }

    public void removeduplicate(Node head){

        Node current = head ;
       while (current != null && current.next != null){
           if (current.data == current.next.data)
               current.next =current.next.next;
           else
               current = current.next;
       }
    }

    /**
     *
     * @param head
     * @param k
     * @return
     * recursive solution to reverse by kth node
     */
    public Node recursiveReverseKth(Node head,int k){

        Node current = head ;
        Node prev = null ;
        Node next = null;
        int count = 0 ;
        while (current != null && count < k){
            next = current.next;
            current.next = next;
            prev = current;
            current = next;
            count ++;
        }
        if (next != null){
            Node rest_head = recursiveReverseKth(next,k);
            head.next = rest_head.next;
        }
        return prev;
    }
    //itrative solutions to reverse kth node in pairs
    public Node reverseKthNodeItrative(Node head,int k){
        Node curr=head;
        Node prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first=curr;
            Node prev=null;
            int count=0;
            while(curr!=null&&count<k){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass) {
                head=prev;
                isFirstPass=false;
            }
            else{
                prevFirst.next=prev;
              }
            prevFirst=first;
        }
        return head;
    }
    //this using has set required extra o(n) auxiliary space
    public boolean isLoopinList(Node head)
    {
        HashSet<Node> s=new HashSet<Node>();
        for (Node current = head ; current != null;current = current.next){
            if (s.contains(current))
                return true;
            s.add(current);
        }
        return false;
    }

    /**
     *
     * @param head
     * @return
     * Detect loop using floyd cycle detection
     */
    public boolean isLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    /**
     *
     * @param head
     * Detect and remove loop in linked list
     * using floyd cycle detection
     *
     */
    public void detectRemoveLoop(Node head){
        Node slow = head ;
        Node fast = head ;
        while (slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                break;
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow.next != fast.next ){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public void deleteNode(Node ptr){
        Node temp = ptr.next;
        ptr.data = temp.data;
        ptr.next = temp.next;
    }
    public Node oddEvenNodesegregate(Node head){

        Node eS=null;
        Node eE=null;
        Node oS=null;
        Node oE=null;
        for(Node curr=head;curr!=null;curr=curr.next){
            int x=curr.data;
            if(x%2==0){
                if(eS==null){
                    eS=curr;
                    eE=eS;
                }else{
                    eE.next=curr;
                    eE=eE.next;
                }
            }else{
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }else{
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }
        if(oS==null||eS==null)
            return head;
        eE.next=oS;
        oE.next=null;
        return eS;
    }

    /**
     *
     * @param head1
     * @param head2
     * @return
     * this is using has funtion in this naive method
     * required en extra auxilary sapce O(n)
     */
    public int getIntersection(Node head1,Node head2){

        HashSet set = new HashSet<Node>();
        Node current = head1;
        while (current != null){
            set.add(current);
            current = current.next;
        }
        current = head2;
        while (current != null){
            if(set.contains(current)){
                return current.data;
            }
            current = current.next;
        }
        return -1;
    }
    int getIntesectionNode(int d, Node node1, Node node2)
    {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }


    static void pairwiseSwap(Node head){
        Node curr=head;
        while(curr!=null && curr.next!=null){
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr=curr.next.next;
        }
    }
    static Node _pairwiseSwap(Node head){
        if(head==null||head.next==null)
            return head;
        Node curr=head.next.next;
        Node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null&&curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }

    public static Node clone(Node head)
    {
        HashMap<Node,Node> hm=new HashMap<Node,Node>();
        for(Node curr=head;curr!=null;curr=curr.next)
            hm.put(curr,new Node(curr.data));

        for(Node curr=head;curr!=null;curr=curr.next){
            Node cloneCurr=hm.get(curr);
            cloneCurr.next=hm.get(curr.next);
        }
        Node head2=hm.get(head);
        return head2;
    }

    static Node sortedMerge(Node a,Node b){
        if(a==null)return b;
        if(b==null)return a;
        Node head=null;
        Node tail=null;
        if(a.data <= b.data){
            head=tail=a;
            a=a.next;
        }
        else{
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.data <= b.data){
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return head;
    }

}
