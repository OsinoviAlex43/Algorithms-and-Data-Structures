package sorting.demo;

import sorting.SelectionSort;

import java.util.Arrays;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        int[] unsort_arr = {67, 42, 77, 0, 22, 77, 4, 254, 75, 146, 777};

        //Сортировка выбором
         int [] sls = SelectionSort.selectionSort(unsort_arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(sls));
    }
}
