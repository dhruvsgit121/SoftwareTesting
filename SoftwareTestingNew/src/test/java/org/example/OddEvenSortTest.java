package org.example;

import Sorting.OddEvenSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class OddEvenSortTest {

    OddEvenSort oddEvenSort = new OddEvenSort();

    @Test
    public void testOddEvenSortWithPositiveNumbers() {
        int[] arr = {34, 2, 10, 45, 7};
        int[] expected = {2, 7, 10, 34, 45};
        oddEvenSort.oddEvenSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testOddEvenSortWithNegativeNumbers() {
        int[] arr = {-5, -2, -10, -1, -7};
        int[] expected = {-10, -7, -5, -2, -1};
        oddEvenSort.oddEvenSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testOddEvenSortWithMixedNumbers() {
        int[] arr = {5, -2, 0, -1, 7};
        int[] expected = {-2, -1, 0, 5, 7};
        oddEvenSort.oddEvenSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testOddEvenSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        oddEvenSort.oddEvenSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testOddEvenSortWithSingleElementArray() {
        int[] arr = {42};
        int[] expected = {42};
        oddEvenSort.oddEvenSort(arr);
        assertArrayEquals(expected, arr);
    }
}
