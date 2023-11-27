package Sorting;

public class CycleSort {
    public void cycleSort(int arr[]) {
        int writes = 0;
        int n = arr.length;

        if (n == 0) return;

        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];

            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == cycleStart)
                continue;

            while (item == arr[pos])
                pos++;

            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }

            while (pos != cycleStart) {
                pos = cycleStart;

                for (int i = cycleStart + 1; i < n; i++)
                    if (arr[i] < item)
                        pos++;

                while (item == arr[pos])
                    pos++;

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    writes++;
                }
            }
        }
    }
}
