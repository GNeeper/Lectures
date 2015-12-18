package QueueStack;

/**
 * Created by Garrett on 12/17/2015.
 */
public interface Queue<E> {
    void push(E data);
    E poll();
    E peekHead();
    E peekTail();
}
