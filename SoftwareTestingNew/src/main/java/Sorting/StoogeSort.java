package Sorting;

import org.example.SortUtilities;

public class StoogeSort {

    SortUtilities sortUtilities = new SortUtilities();

    public void stoogeSort(int arr[], int l, int h) {
        if (l >= h)
            return;

        if (arr[l] > arr[h])
            sortUtilities.swap(arr, l, h);

        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;

            stoogeSort(arr, l, h - t);

            stoogeSort(arr, l + t, h);

            stoogeSort(arr, l, h - t);
        }
    }
}
