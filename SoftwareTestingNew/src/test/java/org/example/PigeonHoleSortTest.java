package org.example;

import Sorting.PigeonHoleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PigeonHoleSortTest {
    PigeonHoleSort pigeonHoleSort = new PigeonHoleSort();

    @Test
    public void testPigeonholeSort() {
        int[] arr = {8, 3, 2, 7, 4, 6, 8};
        int[] expected = {2, 3, 4, 6, 7, 8, 8};
        pigeonHoleSort.pigeonholeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testPigeonholeSortWithNegativeNumbers() {
        int[] arr = {-5, -3, -2, -7, -4, -6, -8};
        int[] expected = {-8, -7, -6, -5, -4, -3, -2};
        pigeonHoleSort.pigeonholeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testPigeonholeSortWithDuplicates() {
        int[] arr = {5, 3, 2, 7, 4, 6, 5};
        int[] expected = {2, 3, 4, 5, 5, 6, 7};
        pigeonHoleSort.pigeonholeSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testPigeonholeSortWithEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        pigeonHoleSort.pigeonholeSort(arr);
        assertArrayEquals(expected, arr);
    }
}
