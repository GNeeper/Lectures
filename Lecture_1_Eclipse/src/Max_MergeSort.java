import java.lang.Comparable;
import java.util.Arrays;
public class Max_MergeSort {
	//Input in format "java Max_MergeSort Element1, Element2, ..., ElementN
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No List Given");
			System.exit(1);
		}
		//This will always return true because Strings implement Comparable
		if (args[0] instanceof java.lang.Comparable)
			printList(mergeSort(args));
		else {
			System.out.println("Cannot Sort List");
			System.exit(1);
		}
	}
	//Sort in Ascending Order
	public static Comparable[] mergeSort(Comparable[] list) {
		if (list.length < 2)
			return list;
		if (list.length == 2)
			return merge(new Comparable[] {list[0]},new Comparable[] {list[1]});
		Comparable[] left = Arrays.copyOfRange(list,0,list.length/2);
		Comparable[] right = Arrays.copyOfRange(list,list.length/2,list.length);
		return merge(mergeSort(left),mergeSort(right));
	}
	//Swap in Ascending Order
	public static Comparable[] merge(Comparable[] list1, Comparable[] list2) {
		int l1 = list1.length;
		int l2 = list2.length;
		int c1 = 0;
		int c2 = 0;
		Comparable[] output = new Comparable[l1 + l2];
		while ((c1 < l1) && (c2 < l2)) {
			if (list1[c1].compareTo(list2[c2]) > 0) 
				output[c1 + c2] = list2[c2++];
			else
				output[c1 + c2] = list1[c1++];
		}
		while (c1 < l1) 
			output[c1 + c2] = list1[c1++];
		while (c2 < l2)
			output[c1 + c2] = list2[c2++];
		return output;
	}
	//Print out all Elements of a List
	public static void printList(Comparable[] list) {
		for (Comparable item : list)
			System.out.print(item + " ");
		System.out.println();
	}
}
	
