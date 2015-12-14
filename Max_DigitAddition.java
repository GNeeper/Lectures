public class Max_DigitAddition {
	public static void main(String[] args) {
		//Input is in the form of "java DigitAddition [n/t] INTEGER"
		//n stands for normal, t stands for tail
		if (args.length > 1) 
			if (args[0].charAt(0) == 'n')
				System.out.println(dAddN(args[1]));
			else if (args[0].charAt(0) == 't')
				System.out.println(dAddT(args[1],0));
			else
				System.out.println("Invalid Input");
		}
	public static int dAddN(String integer) {
		if (integer.length() == 0)
			return 0;
		return Integer.parseInt(integer.substring(0,1)) + dAddN(integer.substring(1));
	}
	public static int dAddT(String integer, int sum) {
		if (integer.length() == 0)
			return sum;
		return dAddT(integer.substring(1), sum + Integer.parseInt(integer.substring(0,1)));
	}
}
