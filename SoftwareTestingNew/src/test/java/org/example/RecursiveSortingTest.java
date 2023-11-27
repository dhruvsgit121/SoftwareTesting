package org.example;

import Sorting.RecursiveSorting;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class RecursiveSortingTest {

    RecursiveSorting sorting = new RecursiveSorting();

    //Quick Sort Test Cases Starts Here...
    @Test
    public void testQuickSort() {
        int[] input = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithDuplicateElements() {
        int[] input = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSortWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        sorting.quickSort(input);
        assertArrayEquals(expected, input);
    }
    //Quick Sort Test Cases Ends Here...


    //Merge Sort Test Cases Starts Here...
    @Test
    public void testMergeSort() {
        int[] input = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        sorting.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        sorting.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        sorting.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithDuplicateElements() {
        int[] input = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        sorting.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSortWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        sorting.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    //Merge Sort Test Cases Ends Here...



    //Recursive Sort Test Cases Starts Here...
    @Test
    public void testSortAscending() {
        int[] arr = {3, 7, 4, 8, 6, 2, 1, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};

        sorting.sort(arr, arr.length, 1);

        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescending() {
        int[] arr = {3, 7, 4, 8, 6, 2, 1, 5};
        int[] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        sorting.sort(arr, arr.length, 0);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorting.sort(arr, arr.length, 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};
        sorting.sort(arr, arr.length, 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortAlreadySortedAscending() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        sorting.sort(arr, arr.length, 1);
        assertArrayEquals(expected, arr);
    }

    //Recursive Sort Test Cases Ends Here...
}
