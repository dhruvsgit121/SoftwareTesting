package Sorting;

import java.util.Vector;

public class PigeonHoleSort {

    public static void pigeonholeSort(int arr[]) {

        if (arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        int range = max - min + 1;

        Vector<Integer>[] holes = new Vector[range];

        for (int i = 0; i < range; i++)
            holes[i] = new Vector<>();

        for (int i = 0; i < arr.length; i++)
            holes[arr[i] - min].add(arr[i]);

        int index = 0;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < holes[i].size(); j++)
                arr[index++] = holes[i].get(j);
        }
    }
}
