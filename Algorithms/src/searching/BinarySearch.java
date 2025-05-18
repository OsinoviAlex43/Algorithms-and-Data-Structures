package searching;

public class BinarySearch {
    public static String sort(int[] sort_arr, int item) {
        int low = 0;
        int high = sort_arr.length - 1;
        int mid = 0;
        int guess = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            guess = sort_arr[mid];
            if (item == guess) {
                return String.valueOf(mid);
            }
            if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return "this array doesn't have your number in it";
    }
}
