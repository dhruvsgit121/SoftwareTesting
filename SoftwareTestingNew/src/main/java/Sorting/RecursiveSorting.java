package Sorting;

public class RecursiveSorting {

    public void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public int count(int[] input, int start, int end) {
        int count = 0;

        for (int j = start + 1; j <= end; j++) {
            if (input[j] < input[start]) {
                count++;
            }
        }
        return count;
    }

    public int partition(int[] input, int start, int end) {
        int size = end - start + 1;
        int c = count(input, start, end);

        int pivot = start + c;
        swap(input, start, pivot);

        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[i] < input[pivot]) {
                i++;
            }

            while (i < j && input[j] >= input[pivot]) {
                j--;
            }

            swap(input, i, j);
            i++;
            j--;
        }

        return pivot;
    }

    public void quickSort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }

        int index = partition(input, start, end);
        quickSort(input, start, index - 1);
        quickSort(input, index + 1, end);
    }

    public void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    public void merge(int[] input, int start, int mid, int end) {
        int i, j, k;
        int size = end - start + 1;
        int[] sorted = new int[size];
        i = start;
        j = mid + 1;
        k = 0;

        while (i <= mid && j <= end) {
            if (input[i] <= input[j]) {
                sorted[k] = input[i];
                i++;
            } else {
                sorted[k] = input[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            sorted[k] = input[i];
            i++;
            k++;
        }

        while (j <= end) {
            sorted[k] = input[j];
            j++;
            k++;
        }

        i = start;
        j = 0;
        while (i <= end) {
            input[i] = sorted[j];
            j++;
            i++;
        }
    }

    public void mergeSort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid + 1, end);
        merge(input, start, mid, end);
    }

    public void mergeSort(int[] input) {
        mergeSort(input, 0, input.length - 1);
    }


    static void compAndSwap(int a[], int i, int j, int dir) {
        if ((dir == 1 && a[i] > a[j]) || (dir == 0 && a[i] < a[j])) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    static void bitonicMerge(int a[], int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++)
                compAndSwap(a, i, i + k, dir);
            bitonicMerge(a, low, k, dir);
            bitonicMerge(a, low + k, k, dir);
        }
    }

    static void bitonicSort(int a[], int low, int cnt, int dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            bitonicSort(a, low, k, 1);
            bitonicSort(a, low + k, k, 0);
            bitonicMerge(a, low, cnt, dir);
        }
    }

    public void sort(int a[], int N, int up) {
        bitonicSort(a, 0, N, up);
    }
}
