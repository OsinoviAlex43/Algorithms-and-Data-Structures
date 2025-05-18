package searching.demo;

import searching.BinarySearch;

public class SearchingDemo {
    public static void main(String[] args) {
        int[] sort_arr = {0, 1, 2, 3, 4, 5, 8, 24, 57, 90, 125, 167, 356};
        // Binary search
        String bs = BinarySearch.sort(sort_arr, 125);
        System.out.println("Your number is in position: " + bs);

        //

    }
}
