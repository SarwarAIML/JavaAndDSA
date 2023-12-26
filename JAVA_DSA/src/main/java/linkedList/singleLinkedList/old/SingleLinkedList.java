package linkedList.singleLinkedList.old;
import java.security.PublicKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SingleLinkedList<E> {

    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E object) {
            data = object;
            next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;

    public SingleLinkedList() {
        head = tail = null;
        currentSize = 0;
    }

    // add first in the list with tail pointer
    public void addFirstWithTailPointer(E obj) {
        Node<E> node = new Node<>(obj);
        if (head == null) {
            head = tail = node;
            currentSize++;
            return;
        }
        node.next = head;
        head = node;
        currentSize++;
    }

    // add last with tail pointer which is of O(1) Complexity
    public void addLastWithTailPointer(E data) {
        Node<E> newnode = new Node<>(data);
        if (head == null) {
            head = tail = newnode;
            currentSize++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        currentSize++;
    }

    // remove first along with updating the tail and head pointer
    public E removeFirst() {
        if (head == null)
            return null;
        E temp = head.data;
        if (head == tail)
            head = tail = null;
        else
            head = head.next;
        currentSize--;
        return temp;
    }

    public E removeLast() {
        if (head == null)
            return null;
        if (head == tail)
            removeFirst();
        Node<E> previous = null;
        Node<E> current = head;
        while (current != tail) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        tail = previous;
        currentSize--;
        return current.data;
    }

    // removing elemnt from anywhere in the list
    @SuppressWarnings("unchecked")
    public E remove(E obj) {
        Node<E> current = head;
        Node<E> previous = null;
        while (current != null) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {
                // first element
                if (current == head)
                    removeFirst();
                // last elemt
                if (current == tail)
                    removeLast();
                currentSize--;
                // middle element
                // deleting current node
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    public boolean contains(E obj) {
        Node<E> current = head;
        while (current != null) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return currentSize;
    }

    public void printList() {
        Node current = head;
        System.out.print("head->");
        while (current != null) {
            System.out.print(current.data);
            System.out.print("->");
            current = current.next;
        }
        System.out.println("null");
    }

    /*
     * //add first in the list without tail pointer not suppose to use public void
     * addFirst2(E obj){ Node<E> node = new Node<>(obj); node.next = head ; head =
     * node ; currentSize ++ ; } //add last without tail pointer which is of O(n)
     * Complexity not suppose to use public void addLast1(E data){
     *
     * Node<E> newnode = new Node<>(data); if (head == null) { head = newnode ;
     * currentSize ++ ; return; } Node temp = head ; while (temp.next !=null){ temp
     * = temp.next ; } temp.next = newnode ; currentSize++;
     *
     * }
     */

    /*
     * @Override public int size() { return 0; }
     *
     * @Override public boolean isEmpty() { return false; }
     *
     * @Override public boolean contains(Object o) { return false; }
     *
     * @Override public Iterator<E> iterator() { return null; }
     *
     * @Override public Object[] toArray() { return new Object[0]; }
     *
     * @Override public <T> T[] toArray(T[] a) { return null; }
     *
     * @Override public boolean add(E e) { return false; }
     *
     * @Override public boolean remove(Object o) { return false; }
     *
     * @Override public boolean containsAll(Collection<?> c) { return false; }
     *
     * @Override public boolean addAll(Collection<? extends E> c) { return false; }
     *
     * @Override public boolean addAll(int index, Collection<? extends E> c) {
     * return false; }
     *
     * @Override public boolean removeAll(Collection<?> c) { return false; }
     *
     * @Override public boolean retainAll(Collection<?> c) { return false; }
     *
     * @Override public void clear() {
     *
     * }
     *
     * @Override public E get(int index) { return null; }
     *
     * @Override public E set(int index, E element) { return null; }
     *
     * @Override public void add(int index, E element) {
     *
     * }
     *
     * @Override public E remove(int index) { return null; }
     *
     * @Override public int indexOf(Object o) { return 0; }
     *
     * @Override public int lastIndexOf(Object o) { return 0; }
     *
     * @Override public ListIterator<E> listIterator() { return null; }
     *
     * @Override public ListIterator<E> listIterator(int index) { return null; }
     *
     * @Override public List<E> subList(int fromIndex, int toIndex) { return null; }
     */
}