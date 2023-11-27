package org.example;

import Sorting.CocktailSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CocktailSortTest {

    CocktailSort cockTailSort = new CocktailSort();

    @Test
    public void testCocktailSort() {
        int[] arr1 = {5, 1, 4, 2, 8, 0, 2};
        int[] expected1 = {0, 1, 2, 2, 4, 5, 8};
        cockTailSort.cocktailSort(arr1, arr1.length);
        assertArrayEquals(expected1, arr1);
    }

    @Test
    public void testCocktailSortSecond() {
        int[] arr2 = {12, 45, 23, 6, 17, 8};
        int[] expected2 = {6, 8, 12, 17, 23, 45};
        cockTailSort.cocktailSort(arr2, arr2.length);
        assertArrayEquals(expected2, arr2);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        cockTailSort.cocktailSort(arr, arr.length);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        cockTailSort.cocktailSort(arr, arr.length);
        assertArrayEquals(new int[]{5}, arr);
    }
}
