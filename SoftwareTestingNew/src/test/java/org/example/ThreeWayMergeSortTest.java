package org.example;

import Sorting.ThreeWayMergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ThreeWayMergeSortTest {

    ThreeWayMergeSort threeWayMerge = new ThreeWayMergeSort();

    @Test
    public void testMergeSort3Way() {
        int[] data1 = { 4, 8, -4, -9, 10, 55, 46, 70, -56, 78, 90, 67, 85, 20, 29 };
        threeWayMerge.mergeSort3Way(data1);

        int[] expected = { -56, -9, -4, 4, 8, 10, 20, 29, 46, 55, 67, 70, 78, 85, 90 };
        assertArrayEquals(expected, data1);
    }

    @Test
    public void testMergeSort3WayWithEmptyArray() {
        int[] data1 = {};
        threeWayMerge.mergeSort3Way(data1);

        int[] expected = {};
        assertArrayEquals(expected, data1);
    }

    @Test
    public void testMergeSort3WayWithSingleElement() {
        int[] data1 = { 5 };
        threeWayMerge.mergeSort3Way(data1);

        int[] expected = { 5 };
        assertArrayEquals(expected, data1);
    }

    @Test
    public void testMergeSort3WayWithDuplicateElements() {
        int[] data1 = { 5, 3, 5, 1, 3, 2, 2, 1 };
        threeWayMerge.mergeSort3Way(data1);

        int[] expected = { 1, 1, 2, 2, 3, 3, 5, 5 };
        assertArrayEquals(expected, data1);
    }
}
