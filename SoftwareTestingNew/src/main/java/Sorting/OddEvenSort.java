package Sorting;

public class OddEvenSort {

    public static void oddEvenSort(int arr[]) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            int temp = 0;

            for (int i = 1; i <= arr.length - 2; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }

            for (int i = 0; i <= arr.length - 2; i = i + 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}
