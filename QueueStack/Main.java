package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Main {
    public static void main(String[] args) {
        QueueStack<Integer> int_QS = new QueueStack();
        int_QS.push(5); int_QS.push(6); int_QS.push(7); int_QS.push(125);
        System.out.println(int_QS.peekHead());
        System.out.println(int_QS.peekTail());

        int_QS.empty();
        System.out.println(int_QS.getSize());
    }
}
