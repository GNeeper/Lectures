package QueueStack;

/**
 * Created by Garrett on 12/16/2015.
 */

public class Main {
    public static void main(String[] args) {
        Stack<Integer> test = new Stack();
        test.push(5); test.push(6); test.push(7); test.push(8);
        test.poll();
        System.out.println(test.peekHead());
        test.pop();
        System.out.println(test.peekTail());
    }
}
