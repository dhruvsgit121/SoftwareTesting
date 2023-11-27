package Sorting;

public class CountSort {

    private static final int MAX = 1000; // Assuming a maximum value for array elements

    public void countSort(int[] array, int size) {
        int[] output = new int[MAX];
        int[] count = new int[MAX];
        if (size == 0) return;
        int max = array[0];

        // Find the largest item in the array
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Initialize the count for each element in the array to 0
        for (int i = 0; i <= max; ++i) {
            count[i] = 0;
        }

        // For each element, store the count
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cumulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Search the index of each element of the actual array in the count array,
        // and place the elements in the output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Transfer the sorted items into the actual array
        System.arraycopy(output, 0, array, 0, size);
    }

}
