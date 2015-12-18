package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Queue<E> {
    public Node<E> head, tail;
    protected int size = 0;

    public void push(E data) {
        Node tail_new = new Node(data, null);
        if (head == null)
            head = tail_new;
        tail_new.next = tail;
        tail = tail_new;
        size++;
    }

    public E poll() {
        E temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}