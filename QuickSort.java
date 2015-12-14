import java.util.Arrays;
import java.lang.Comparable;

/**
 * Created by Garrett on 12/14/2015.
 */

public class QuickSort {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Empty list.");
            System.exit(1);
        }
        if (args[0] instanceof java.lang.Comparable)
            printList(quickSort(args));
        else {
            System.out.println("Cannot Sort List");
            System.exit(1);
        }
    }

    public static Comparable[] quickSort (Comparable[] list) {
        int l = list.length;
        if (l < 3) {
            if (l == 2) {
                if (list[0].compareTo(list[1]) > 0)
                    return list;
                return swap(list, 0, 1);
            }
            return list;
        }
        int pivot = l-1;
        for (int i = 0; i < pivot; i++) {
            if (list[i].compareTo(list[pivot]) > 0) {
                list = swap(list, pivot, i);
                list = swap(list, --pivot, i--);
            }
        }
        return divideQuickSort(list, pivot);
    }

    public static Comparable[] divideQuickSort(Comparable[] list, int p) {
        Comparable[] left = quickSort(Arrays.copyOfRange(list, 0, p));
        Comparable[] right = quickSort(Arrays.copyOfRange(list, p, list.length));
        for (int i = 0; i < list.length; i++) {
            if (i < p)
                list[i] = left[i];
            if (i > p)
                list[i] = right[i-p];
        }
        return list;
    }

    public static Comparable[] swap(Comparable[] array, int a, int b) {
        Comparable temp = array[b];
        array[b] = array[a];
        array[a] = temp;
        return array;
    }

    public static void printList(Comparable[] list) {
        for (Comparable item : list)
            System.out.print(item + " ");
        System.out.println();
    }
}
