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

    private void countingSort(int[] array, int size, int place) {
        final int max = 10;
        int[] output = new int[size];
        int[] count = new int[max];

        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[(array[i] / place) % 10]++;
        }

        for (int i = 1; i < max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = size - 1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, size);
    }

    public void radixSort(int[] array) {
        if (array.length == 0) return;
        int max = getMax(array, array.length);

        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(array, array.length, place);
        }
    }
}
