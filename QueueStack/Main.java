package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Main {
    public static void main(String[] args) {
        QueueStack<Integer> qs = new QueueStack();
        qs.push(5); qs.push(6); qs.push(7);
        qs.empty();
        System.out.println(qs.peekHead());
        System.out.println(qs.peekTail());
    }
}
