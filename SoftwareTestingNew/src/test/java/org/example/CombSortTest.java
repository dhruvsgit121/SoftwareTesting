package org.example;

import Sorting.CombSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CombSortTest {
    CombSort combSort = new CombSort();

    @Test
    public void testCombSortWithPositiveNumbers() {
        int[] arr = {8, 4, 1, 56, 3, 44, 23, 6, 28, 0};
        combSort.combSort(arr);
        int[] expected = {0, 1, 3, 4, 6, 8, 23, 28, 44, 56};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testCombSortWithNegativeNumbers() {
        int[] arr = {-8, -4, -1, -56, -3, -44, -23, -6, -28, 0};
        combSort.combSort(arr);
        int[] expected = {-56, -44, -28, -23, -8, -6, -4, -3, -1, 0};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testCombSortWithMixedNumbers() {
        int[] arr = {-8, 4, 0, -56, 3, -44, 23, -6, 28, -1};
        combSort.combSort(arr);
        int[] expected = {-56, -44, -8, -6, -1, 0, 3, 4, 23, 28};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testCombSortWithEmptyArray() {
        int[] arr = {};
        combSort.combSort(arr);
        int[] expected = {};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testCombSortWithSingleElement() {
        int[] arr = {5};
        combSort.combSort(arr);
        int[] expected = {5};
        assertArrayEquals(expected, arr);
    }
}
