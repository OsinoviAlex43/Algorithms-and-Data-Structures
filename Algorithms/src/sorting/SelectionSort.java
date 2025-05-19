package sorting;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    // Сортировка массива по возрастанию способом сортировки выбором
    public static int[] selectionSort(int[] unsort_arr) {

        for (int i = 0; i < unsort_arr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < unsort_arr.length; j++) {
                if (unsort_arr[j] < unsort_arr[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = unsort_arr[i];
                unsort_arr[i] = unsort_arr[min_index];
                unsort_arr[min_index] = temp;
            }
        }
        return unsort_arr;
    }


}



