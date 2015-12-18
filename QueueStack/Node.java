package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Node<E> {
    public E data;
    public Node<E> next;

    public Node(E d, Node n) {
        data = d;
        next = n;
    }
}
