package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Stack<E> implements Queue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void push(E data) {
        Node<E> newNode = new Node(data, null, null);
        if (size == 0) {
            head = newNode;
            tail = head;
            head.next = tail;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }
    public E poll() {
        if (size == 1) {
            head.next = null;
            tail.prev = null;
        }
        if (size == 0)
            return null;
        E temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public E pop() {
        if (size == 1) {
            head.next = null;
            tail.prev = null;
        }
        if (size == 0)
            return null;
        E temp = tail.data;
        tail = tail.prev;
        size--;
        return temp;
    }
    public E peekHead() {
        if (head != null)
            return head.data;
        return null;
    }
    public E peekTail() {
        if (tail != null && tail.prev != null)
            return tail.data;
        return null;
    }
    public void empty() {
        while (size > 0)
            poll();
    }
    public int getSize() {
        return size;
    }
}


//