package org.example;

import Sorting.StoogeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StoogeSortTest {

    @Test
    public void stoogeSortTest() {

        StoogeSort stoogeSort = new StoogeSort();

        // Test Case 2: Already sorted
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] expected2 = {1, 2, 3, 4, 5};
        stoogeSort.stoogeSort(arr2, 0, arr2.length - 1);
        assertArrayEquals(expected2, arr2);

        // Test Case 3: Reverse sorted
        int[] arr3 = {5, 4, 3, 2, 1};
        int[] expected3 = {1, 2, 3, 4, 5};
        stoogeSort.stoogeSort(arr3, 0, arr3.length - 1);
        assertArrayEquals(expected3, arr3);

        // Test Case 4: All equal elements
        int[] arr4 = {7, 7, 7, 7, 7};
        int[] expected4 = {7, 7, 7, 7, 7};
        stoogeSort.stoogeSort(arr4, 0, arr4.length - 1);
        assertArrayEquals(expected4, arr4);

        // Test Case 5: Empty array
        int[] arr5 = {};
        int[] expected5 = {};
        stoogeSort.stoogeSort(arr5, 0, arr5.length - 1);
        assertArrayEquals(expected5, arr5);

        // Test Case 6: Large array
        int[] arr6 = {100, 20, 50, 80, 10, 30, 60, 90, 40, 70};
        int[] expected6 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        stoogeSort.stoogeSort(arr6, 0, arr6.length - 1);
        assertArrayEquals(expected6, arr6);
    }
}
