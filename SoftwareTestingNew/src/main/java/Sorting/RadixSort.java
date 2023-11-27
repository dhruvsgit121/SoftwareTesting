package Sorting;

public class RadixSort {
    private int getMax(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Using counting sort to sort the elements based on significant places
    private void countingSort(int[] array, int size, int place) {
        final int max = 10;
        int[] output = new int[size];
        int[] count = new int[max];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Calculate count of elements
        for (int i = 0; i < size; i++) {
            count[(array[i] / place) % 10]++;
        }

        // Calculate cumulative count
        for (int i = 1; i < max; i++) {
            count[i] += count[i - 1];
        }

        // Place the elements in sorted order
        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        // Copy the output array to the original array
        System.arraycopy(output, 0, array, 0, size);
    }

    // Main function to implement radix sort
    public void radixSort(int[] array) {
        // Get the maximum element
        if(array.length == 0)return;
        int max = getMax(array, array.length);

        // Apply counting sort to sort elements based on place value
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(array, array.length, place);
        }
    }
}
