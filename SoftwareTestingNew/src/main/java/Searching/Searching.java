package Searching;
public class Searching {
    public int binarySearch(int[] input, int val) {
        int n = input.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (input[mid] == val) {
                return mid;
            } else if (input[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
