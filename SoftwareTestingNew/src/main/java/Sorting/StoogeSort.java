package Sorting;

public class StoogeSort {
    public void stoogeSort(int arr[], int l, int h) {
        if (l >= h)
            return;

        if (arr[l] > arr[h])
            swap(arr, l, h);

        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;

            stoogeSort(arr, l, h - t);

            stoogeSort(arr, l + t, h);

            stoogeSort(arr, l, h - t);
        }
    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
