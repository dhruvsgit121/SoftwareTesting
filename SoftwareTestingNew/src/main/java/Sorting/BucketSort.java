package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void bucketSort(float arr[], int n) {
        // 1) Create n empty buckets
        List<Float>[] b = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            b[i] = new ArrayList<>();
        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bi = (int) (n * arr[i]);
            b[bi].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(b[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b[i].size(); j++) {
                arr[index++] = b[i].get(j);
            }
        }
    }

}
