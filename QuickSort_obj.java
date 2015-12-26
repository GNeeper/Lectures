import java.util.Arrays;
import java.lang.Comparable;

/**
 * Created by Garrett on 12/14/2015.
 */

public class QuickSort_obj {
    public QuickSort_obj() {
    }

    public Comparable[] quickSort (Comparable[] list) {
        int l = list.length;
        if (l < 2)
            return list;
        int pivot = l-1;
        for (int i = 0; i < pivot; i++) {
            if (list[i].compareTo(list[pivot]) > 0) {
                swap(list, pivot, i);
                swap(list, --pivot, i--);
            }
        }
        return divideQuickSort(list, pivot);
    }

    public Comparable[] divideQuickSort(Comparable[] list, int p) {
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

    public void swap(Comparable[] array, int a, int b) {
        Comparable temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }

    public void printList(Comparable[] list) {
        for (Comparable item : list)
            System.out.print(item + " ");
        System.out.println();
    }
}
