package QueueStack;

public class PolishCalc {
	static Stack<Integer> stack = new Stack();
	
	public static void main(String[] args) {
		String test = "512+4x+3-";
		System.out.println(calcPol(test));
	}
	public static int calcPol(String n) {
		if (n.length() == 0)
			return stack.pop();
		String rest = n.substring(1, n.length());
		int conv = n.charAt(0);
		if (conv > 47 && conv < 58) {
			stack.push(conv-48);
			return calcPol(rest);
		} else
			return oper(n);
	}
	
	public static int oper(String n) {
		String rest = n.substring(1, n.length());
		int two = stack.pop();
		switch(n.charAt(0)) {
		case '+': 
			stack.push(stack.pop() + two);
			return calcPol(rest);
		case '-':
			stack.push(stack.pop() - two);
			return calcPol(rest);
		case '*':
			stack.push(stack.pop() * two);
			return calcPol(rest);
		case 'x':
			stack.push(stack.pop() * two);
			return calcPol(rest);
		case '/':
			stack.push(stack.pop() / two);
			return calcPol(rest);
		case '%':
			stack.push(stack.pop() % two);
			return calcPol(rest);
		default:
			System.out.println("Invalid input: " +n.charAt(0));
			System.exit(1);
			return 0;
	}
	}
}
