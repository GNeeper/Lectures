import java.util.Arrays;
import java.lang.Comparable;

/**
 * Created by Garrett on 12/12/2015.
 */
public class BinarySearch {
    public static void main(String[] args) {
        String[] testCase = {"9", "0", "125", "1285", "12411", "1231115"};
        args =  testCase;
        QuickSort_obj qs = new QuickSort_obj();
        if (args.length == 0) {
            System.out.println("Empty list.");
            System.exit(1);
        }
        if (args[0] instanceof java.lang.Comparable)
            System.out.println(binSearch(qs.quickSort(Arrays.copyOfRange(args, 1, args.length)), args[0]));
        else {
            System.out.println("Cannot Sort List");
            System.exit(1);
        }
    }

    public static Comparable binSearch(Comparable[] arr, Comparable n) {
        if (arr[arr.length-1].compareTo(n) < 0 || arr[0].compareTo(n) > 0)
            return "Invalid number.";
        return binarySearch(arr, 0, arr.length, n);
    }
    public static Comparable binarySearch(Comparable[] arr, int beg, int end, Comparable n) {
        int mid = (end - beg)/2 + beg;
        if (end-beg == 0)
            return "Not in list.";
        if (arr[mid].compareTo(n) == 0)
            return mid;
        System.out.println("mid: "+mid+" end: " +end);
        if (arr[mid].compareTo(n) < 0 && mid != (end - beg)/2 + beg)
            return binarySearch(arr, mid, end, n);
        return binarySearch(arr, beg, mid, n);
    }
}
