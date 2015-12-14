import java.util.Arrays;

/**
 * Created by Garrett on 12/13/2015.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] list = {125, 31, 161, 33, 44, 55, 4, 214, 0, 33, 33};
        int[] sorted = mergeSort(list);
        for(int i = 0; i < sorted.length; i ++)
            System.out.println(sorted[i]);
    }

    public static int[] mergeSort(int[] list) {
        if (list.length == 2) {
            if (list[0] > list [1]) {
                int[] temp = new int[] {list[1], list[0]};
                return temp;
            }
                return list;
        }
        if (list.length == 1)
            return list;

        if (list.length > 2) {
            int[] arr_Left = Arrays.copyOfRange(list, 0, list.length/2);
            int[] arr_Right = Arrays.copyOfRange(list, list.length/2, list.length);
            arr_Left = mergeSort(arr_Left);
            arr_Right = mergeSort(arr_Right);
            int[] sortedList = new int[arr_Left.length + arr_Right.length];

            int a = 0, b = 0;
            for (int i = 0; i < sortedList.length; i++) {
                if (a == arr_Left.length) {
                    sortedList[i] = arr_Right[b++];
                    continue;
                }
                if (b == arr_Right.length) {
                    sortedList[i] = arr_Left[a++];
                    continue;
                }
                if (arr_Left[a] > arr_Right[b])
                    sortedList[i] = arr_Right[b++];
                else
                    sortedList[i] = arr_Left[a++];
            }
            list = sortedList;
        }
        return list;
    }
}
