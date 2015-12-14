import java.util.Arrays;

/**
 * Created by Garrett on 12/13/2015.
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] list = {125, 31, 161, 33, 44, 55, 4, 214, 0, 33, 33};                     //Random ass list, assorted numbers
        int[] sorted = mergeSort(list);
        for(int i = 0; i < sorted.length; i ++)                                         //Print sorted list
            System.out.println(sorted[i]);
    }

    public static int[] mergeSort(int[] list) {
        if (list.length == 2) {                                                         //Base case, once broken down to 2 element per array it sorts them
            if (list[0] > list [1]) {
                int[] temp = new int[] {list[1], list[0]};
                return temp;
            }
                return list;
        }
        if (list.length == 1)                                                           //Other base case, in case it's only 1 element large
            return list;

        if (list.length > 2) {                                                          //All other instances
            int[] arr_Left = Arrays.copyOfRange(list, 0, list.length/2);                //Left-side of tree
            int[] arr_Right = Arrays.copyOfRange(list, list.length/2, list.length);     //Right-side of tree
            arr_Left = mergeSort(arr_Left);                                             //Sorts all left sides, until reaches base case, then climbs back up.
            arr_Right = mergeSort(arr_Right);                                           //Sorts all right sides as well
            int[] sortedList = new int[arr_Left.length + arr_Right.length];             //Initializes list size of left-side + right-side

            int a = 0, b = 0;                                                           //Counters for arrays
            for (int i = 0; i < sortedList.length; i++) {
                if (a == arr_Left.length) {                                             //Checks to see if Left/right already used up
                    sortedList[i] = arr_Right[b++];
                    continue;
                }
                if (b == arr_Right.length) {
                    sortedList[i] = arr_Left[a++];
                    continue;
                }
                if (arr_Left[a] > arr_Right[b])                                         //Sorting
                    sortedList[i] = arr_Right[b++];
                else
                    sortedList[i] = arr_Left[a++];
            }
            list = sortedList;
        }
        return list;
    }
}
