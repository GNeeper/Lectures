package DataStructures;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] vals = {1,2,3,4,5,6,7};
		myStack stack = new myStack();
		for (Integer v : vals)
			stack.push(v);
		System.out.println(stack.pop());
		System.out.println(stack.poll());
		System.out.println(stack.getSize());
		System.out.println(stack.peek());
		stack.empty();
		System.out.println(stack.pop());
	}

}
