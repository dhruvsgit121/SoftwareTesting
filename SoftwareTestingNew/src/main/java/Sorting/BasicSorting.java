package Sorting;

public class BasicSorting {
    public static void insertionSort(int[] input) {
        int size = input.length;
        for (int i = 1; i < size; i++) {
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }

            input[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] input) {
        int size = input.length;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            int min = input[i];
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }

            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
    }
}
