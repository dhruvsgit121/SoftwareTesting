package org.example;

import Sorting.CycleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CycleSortTest {
    CycleSort cycleSort = new CycleSort();

    @Test
    public void testCycleSort() {
        // Test Case 1
        int[] arr1 = {1, 8, 3, 9, 10, 10, 2, 4};
        int[] expectedArr1 = {1, 2, 3, 4, 8, 9, 10, 10};
        cycleSort.cycleSort(arr1);
        assertArrayEquals(expectedArr1, arr1);
    }

    @Test
    public void testCycleSortFrist() {
        int[] arr2 = {5, 2, 9, 1, 5, 6};
        int[] expectedArr2 = {1, 2, 5, 5, 6, 9};
        cycleSort.cycleSort(arr2);
        assertArrayEquals(expectedArr2, arr2);
    }

    @Test
    public void testCycleSortSecond() {
        int[] arr3 = {12, 11, 10, 5, 6};
        int[] expectedArr3 = {5, 6, 10, 11, 12};
        cycleSort.cycleSort(arr3);
        assertArrayEquals(expectedArr3, arr3);
    }
}
