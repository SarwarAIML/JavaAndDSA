package linkedList.singleCircularLInkedLIst;

public class CircularLInkedLIstTest {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next= new Node(15);
        head.next.next.next.next = head;
        CirculaSIngleLInkedLIst  circulaSIngleLInkedLIst = new CirculaSIngleLInkedLIst();
        circulaSIngleLInkedLIst.printlist(head);

    }
}
