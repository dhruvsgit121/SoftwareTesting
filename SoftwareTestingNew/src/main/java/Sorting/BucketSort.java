package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void bucketSort(float arr[], int n) {
        List<Float>[] b = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            b[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int bi = (int) (n * arr[i]);
            b[bi].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(b[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b[i].size(); j++) {
                arr[index++] = b[i].get(j);
            }
        }
    }
}
