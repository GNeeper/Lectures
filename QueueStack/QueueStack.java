package QueueStack;

/**
 * Created by Garrett on 12/17/2015.
 */

public class QueueStack<E> extends Queue<E> {
    public E pop() {                                 //Stack pop; head removed;
        E temp = tail.data;
        tail = tail.next;
        size--;
        return temp;
    }

    public E peekHead() {
        return head.data;
    }

    public E peekTail() {
        return tail.data;
    }

    public void empty() {
        while (size > 0)
            pop();
    }

    public int getSize() {
        return size;
    }

}
