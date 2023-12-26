package linkedList.singleCircularLInkedLIst;

public class CirculaSIngleLInkedLIst {

    public void printlist (Node head ){
        if (head == null)return;
        Node r = head ;
        do {
            System.out.print(r.data+" ");
            r = r.next;
        }while (r!=head);
    }

    /**
     *
     * @param head
     * @param data
     * @return
     * this is the o(n) time required
     */
    public Node NaiveInsertFirst(Node head,int data){
        Node tmp = new Node(data);
        if (head == null){
            tmp.next = tmp;
        }else {
            Node curent = head;
            while (curent.next !=head){
                curent = curent.next;
            }
            curent.next = tmp.next;
            tmp.next = head;
        }
        return tmp;
    }
    /**
     *
     * @param head
     * @param data
     * @return
     * effective solutions
     * adding temp after head and swapping head and temp data returning head
     *
     */
    public Node addFirst(Node head,int data){
        Node temp = new Node(data);
        if (head == null){
            temp.next = temp;
            return temp;
        }else {
            temp.next = head.next;
            head.next = temp;
            int ltemp = head.data;
            head.data = temp.data;
            temp.data = ltemp;
        }
        return head;
    }

    /**
     *
     * @param head
     * @param data
     * @return
     * this is nive solution
     * it would take O(n) time
     */
    public Node NiveAddLast(Node head,int data){
        Node temp = new Node(data);
        if (head == null){
           temp.next = temp;
           return temp;
        }else {
            Node current = head;
            while (current.next != head)
                current = current.next;
            current.next = temp;
            temp.next = head;
            return head;
        }
    }

    /**
     *
     * @param head
     * @param data
     * @return
     * inserting temp after head and making temp as head node
     */
    public Node addLast(Node head,int data){
        Node temp = new Node(data);
        if (head == null){
            temp.next = temp;
            return temp;
        }else {
            temp.next = head.next;
            head.next = temp;
            int ldata = head.data;
            head.data = temp.data;
            temp.data = ldata;
            return temp;
        }
    }

    /**
     *
     * @param head
     * @return
     * this is the nive solution
     * it would take O(N) time
     */
    public Node niveDeleHead(Node head){
        if (head == null) return null;
        if (head.next == null) return null;
        Node current = head;
        while (current.next !=head)
            current = current.next;
        current.next = head.next;
        head = current.next;
        return head;
    }

    /**
     *
     * @param head
     * @return
     *swapping head and head to next node and deleting head to next node
     * and returning head node back
     * this method also can be called as deleteHead
     */
    public Node deleteFirst(Node head){
        if (head == null) return null;
        if (head.next == null) return null;

        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public Node deleteKthNode(Node head,int k){
        if (head == null) return null;
        if (k==1) deleteFirst(head);
        Node current = head ;
        for (int i = 1; i <k-2 ; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

}
