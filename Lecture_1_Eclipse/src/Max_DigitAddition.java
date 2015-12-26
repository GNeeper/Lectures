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
	//Normal Recursive Function, Returns -1 if Invalid Integer
	public static int dAddN(String integer) {
		if (integer.length() == 0)
			return 0;
		if (!isInt(integer))
			return -1;
		return Integer.parseInt(integer.substring(0,1)) + dAddN(integer.substring(1));
	}
	//Tail Recursive Function, Returns -1 if Invalid Integer
	public static int dAddT(String integer, int sum) {
		if (integer.length() == 0)
			return sum;
		if (!isInt(integer))
			return -1;
		return dAddT(integer.substring(1), sum + Integer.parseInt(integer.substring(0,1)));
	}
	//Verify that the input we are given is an Integer
	public static boolean isInt(String integer) {
		if (integer.length() == 0)
			return true;
		char c = integer.charAt(0);
		if ((c > 47) && (c - 48 < 10)) 
			return isInt(integer.substring(1));
		return false;
	}
}
