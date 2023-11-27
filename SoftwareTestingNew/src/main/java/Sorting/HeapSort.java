package Sorting;

public class HeapSort {

    public void heapSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int childIndex = i;
            int parentIndex = (childIndex - 1) / 2;

            while (childIndex > 0) {
                parentIndex = (childIndex - 1) / 2;

                if (arr[childIndex] > arr[parentIndex]) {
                    int temp = arr[childIndex];
                    arr[childIndex] = arr[parentIndex];
                    arr[parentIndex] = temp;

                    childIndex = parentIndex;
                } else {
                    break;
                }
            }
        }

        int size = n;

        for (int i = 0; i < n - 1; i++) {
            int temp = arr[0];
            arr[0] = arr[size - 1];
            arr[size - 1] = temp;

            size--;

            int parentIndex = 0;
            int leftChildIndex = (2 * parentIndex) + 1;
            int rightChildIndex = (2 * parentIndex) + 2;

            while (leftChildIndex < size) {
                int minIndex = parentIndex;
                if (arr[minIndex] < arr[leftChildIndex]) {
                    minIndex = leftChildIndex;
                }
                if (rightChildIndex < size && arr[minIndex] < arr[rightChildIndex]) {
                    minIndex = rightChildIndex;
                }
                if (parentIndex == minIndex) {
                    break;
                }
                int temp2 = arr[parentIndex];
                arr[parentIndex] = arr[minIndex];
                arr[minIndex] = temp2;

                parentIndex = minIndex;
                leftChildIndex = (2 * parentIndex) + 1;
                rightChildIndex = (2 * parentIndex) + 2;
            }
        }
    }
}
