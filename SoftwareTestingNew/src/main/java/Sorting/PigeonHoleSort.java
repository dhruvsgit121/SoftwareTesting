package Sorting;

import java.util.Vector;

public class PigeonHoleSort {

    // Sorts the array using pigeonhole algorithm
    public static void pigeonholeSort(int arr[]) {
        // Find minimum and maximum values in arr[]
        if(arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        int range = max - min + 1; // Find range

        // Create an array of vectors. Size of array
        // range. Each vector represents a hole that
        // is going to contain matching elements.
        Vector<Integer>[] holes = new Vector[range];

        // Initialize vectors in the array
        for (int i = 0; i < range; i++)
            holes[i] = new Vector<>();

        // Traverse through input array and put every
        // element in its respective hole
        for (int i = 0; i < arr.length; i++)
            holes[arr[i] - min].add(arr[i]);

        // Traverse through all holes one by one. For
        // every hole, take its elements and put in
        // the array.
        int index = 0; // index in the sorted array
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < holes[i].size(); j++)
                arr[index++] = holes[i].get(j);
        }
    }
}
