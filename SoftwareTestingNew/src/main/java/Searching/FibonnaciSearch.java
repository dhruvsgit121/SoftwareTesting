package Searching;

public class FibonnaciSearch {

    private int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    public int fibMonaccianSearch(int arr[], int x, int n) {

        if(arr.length == 0) return -1;

        int fibMMm2 = 0; // (m-2)'th Fibonacci No.
        int fibMMm1 = 1; // (m-1)'th Fibonacci No.
        int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci

        while (fibM < n) {
            int temp = fibMMm2;
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = min(offset + fibMMm2, n - 1);

            if (arr[i] < x) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i] > x) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else
                return i;
        }

        if (fibMMm1 != 0 && arr[offset + 1] == x)
            return offset + 1;

        return -1;
    }
}
