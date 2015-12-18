package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Node<E> {
    E data;
    Node<E> next, prev;

    public Node(E d, Node n, Node p) {
        data = d;
        next = n;
        prev = p;
    }
}
