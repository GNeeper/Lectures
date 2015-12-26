import java.util.Arrays;

public class Max_QuickSort {

	//Arguments should be given in the form "java Max_QuickSort Element1, Element2, ..., ElementN"
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Invalid Input");
			System.exit(1);
		}
		//Because Command-Line Arguments are Strings, this will always evaluate to true
		if (args[0] instanceof java.lang.Comparable)
			printList(quickSort(args));
		else {
			System.out.println("List Cannot be Sorted");
			System.exit(1);
		}
	}
	//Sort in Ascending Order
	//Technically can be a void (The output is redundant)
	public static Comparable[] quickSort(Comparable[] list) {
		if (list.length < 2)
			return list;
		int pivot = list.length / 2;
		int end = list.length - 1;
		int c = 0;
		swap(list,pivot,end);
		for (int i = 0; i < end; i++) 
			if (list[i].compareTo(list[end]) < 0) 
				swap(list,i,c++);
		swap(list,c,end);
		list = combine(end + 1,quickSort(Arrays.copyOfRange(list, 0, c)),new Comparable[] {list[c]},quickSort(Arrays.copyOfRange(list, c+1, end +1)));
		return list;
	}
	public static void swap(Comparable[] list, int first, int second) {
		Comparable temp = list[first];
		list[first] = list[second];
		list[second] = temp;
	}
	public static Comparable[] combine(int length, Comparable[]... args) {
		Comparable[] output = new Comparable[length];
		int i = 0;
		for(Comparable[] list : args)
			for(Comparable item : list) 
				output[i++] = item;
		return output;
	}
	public static void printList(Comparable[] list) {
		for (Comparable item : list)
			System.out.print(item + " ");
		System.out.println();
	}

}
