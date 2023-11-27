package Searching;

public class JumpSearch {
    public int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        if(n == 0)return -1;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == x)
            return prev;

        return -1;
    }
}
