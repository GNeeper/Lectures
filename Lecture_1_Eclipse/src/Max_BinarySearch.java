import java.util.Arrays;

public class Max_BinarySearch {

	//Valid input as "java Max_BinarySearch Item Element1, Element2, ..., ElementN"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Invalid Input");
			System.exit(1);
		}
		//Always evaluates true for Command-Line Arguments of type String
		if (args[0] instanceof java.lang.Comparable)
			System.out.println(binarySearch(args[0],Arrays.copyOfRange(args, 1, args.length),0,args.length - 1));
		else {
			System.out.println("Cannot Search List");
			System.exit(1);
		}
	}
	//Search for index of item in sorted list, return -1 if not found
	public static int binarySearch(Comparable item, Comparable[] list,int start, int end) {
		if (start >= end)
			return -1;
		int mid = (start + end) / 2;
		if (list[mid].compareTo(item) == 0)
			return mid;
		else if (list[mid].compareTo(item) > 0)
			return binarySearch(item,list,0,mid);
		else
			return binarySearch(item,list,mid+1,end);
	}

}
