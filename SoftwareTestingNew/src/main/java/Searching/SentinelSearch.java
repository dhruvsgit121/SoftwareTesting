package Searching;

public class SentinelSearch {
    public int sentinelSearch(int arr[], int n, int key) {

        if (arr.length == 0) return -1;
        int last = arr[n - 1];
        arr[n - 1] = key;
        int i = 0;

        while (arr[i] != key)
            i++;

        arr[n - 1] = last;

        if ((i < n - 1) || (arr[n - 1] == key))
            return i;
        else
            return -1;
    }
}
