package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

//MADE JUST BECAUSE


public class Stack<E> {
    public Node<E> head;

    public void add(E data) {
        Node new_head = new Node(data, head);
        head = new_head;
    }

    public E pop() {
        E temp = head.data;
        head = head.next;
        return temp;
    }

}
