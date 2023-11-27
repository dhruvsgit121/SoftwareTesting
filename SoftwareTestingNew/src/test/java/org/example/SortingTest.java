package org.example;

//import Sorting.Sorting;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import org.junit.Test;
import Sorting.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertTrue;


public class SortingTest {
    BasicSorting basicSorting = new BasicSorting();
//    Sorting sorting = new Sorting();
    RadixSort radixSort = new RadixSort();
    BucketSort bucketSort = new BucketSort();
    CountSort countSort = new CountSort();
    HeapSort heapSort = new HeapSort();
    ShellSort shellSort = new ShellSort();

    @Test
    public void testInsertionSortRandomArray() {
        int[] input = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortArrayWithDuplicates() {
        int[] input = {4, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 4, 7};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortArrayWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testInsertionSortArrayWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        basicSorting.insertionSort(input);
        assertArrayEquals(expected, input);
    }


    //Insertion Sorting Test Cases...
    @Test
    public void testBubbleSortRandomArray() {
        int[] input = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSortArrayWithDuplicates() {
        int[] input = {4, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 4, 7};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSortArrayWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBubbleSortArrayWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        basicSorting.bubbleSort(input);
        assertArrayEquals(expected, input);
    }
    //Insertion Sorting Test Cases Ends Here...



    //Selection Sorting Test Cases...

    @Test
    public void testSelectionSortRandomArray() {
        int[] input = {5, 2, 7, 1, 3};
        int[] expected = {1, 2, 3, 5, 7};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortArrayWithDuplicates() {
        int[] input = {4, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 4, 7};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortArrayWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortEmptyArray() {
        int[] input = {};
        int[] expected = {};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSelectionSortArrayWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        basicSorting.selectionSort(input);
        assertArrayEquals(expected, input);
    }

    //Selection Sorting Test Cases...




    //Insertion Sorting Test Cases...

    @Test
    public void testHeapSort() {
        int[] input = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        heapSort.heapSort(input, input.length);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        heapSort.heapSort(input, input.length);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithOneElement() {
        int[] input = {42};
        int[] expected = {42};
        heapSort.heapSort(input, input.length);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithDuplicateElements() {
        int[] input = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        heapSort.heapSort(input, input.length);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testHeapSortWithNegativeNumbers() {
        int[] input = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        heapSort.heapSort(input, input.length);
        assertArrayEquals(expected, input);
    }

    //Insertion Sorting Test Cases...



    //Count Sort Test Cases Start Here...

    @Test
    public void testCountSort() {
        int[] array = {4, 2, 10, 8, 1, 6};
        int[] expected = {1, 2, 4, 6, 8, 10};
        countSort.countSort(array, array.length);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testCountSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        countSort.countSort(array, array.length);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testCountSortWithOneElement() {
        int[] array = {42};
        int[] expected = {42};
        countSort.countSort(array, array.length);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testCountSortWithDuplicateElements() {
        int[] array = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        countSort.countSort(array, array.length);
        assertArrayEquals(expected, array);
    }

    //Count Sort Test Cases Ends Here...




    //Radix Sort Test Cases Starts Here...

    @Test
    public void testRadixSort() {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        radixSort.radixSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testRadixSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        radixSort.radixSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testRadixSortWithOneElement() {
        int[] array = {42};
        int[] expected = {42};
        radixSort.radixSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testRadixSortWithDuplicateElements() {
        int[] array = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        radixSort.radixSort(array);
        assertArrayEquals(expected, array);
    }
    //Radix Sort Test Cases Ends Here...




    @Test
    public void testBucketSort() {
        // Test case 1
        float[] arr1 = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
        bucketSort.bucketSort(arr1, arr1.length);
        float[] expectedArr1 = {0.1234f, 0.3434f, 0.565f, 0.656f, 0.665f, 0.897f};
        assertArrayEquals(expectedArr1, arr1, 0.0f);
    }


    @Test
    public void testBucketSort12() {
        // Test case 1
        float[] arr2 = {0.1f, 0.9f, 0.4f, 0.7f, 0.3f};
        bucketSort.bucketSort(arr2, arr2.length);
        float[] expectedArr2 = {0.1f, 0.3f, 0.4f, 0.7f, 0.9f};
        assertArrayEquals(expectedArr2, arr2, 0.0f);

    }

    @Test
    public void testBucketSort13() {
        // Test case 1
        float[] arr3 = {0.5f, 0.5f, 0.5f, 0.5f, 0.5f};
        bucketSort.bucketSort(arr3, arr3.length);
        float[] expectedArr3 = {0.5f, 0.5f, 0.5f, 0.5f, 0.5f};
        assertArrayEquals(expectedArr3, arr3, 0.0f);
    }


    @Test
    public void testBucketSort14() {
        // Test case 1
        float[] arr4 = {};
        bucketSort.bucketSort(arr4, arr4.length);
        float[] expectedArr4 = {};
        assertArrayEquals(expectedArr4, arr4, 0.0f);
    }

    //Bucket Sort Ends Here...


    //Shell Sort Starts Here...

    @Test
    public void testShellSort() {
        int[] array = {9, 8, 3, 7, 5, 6, 4, 1};
        int[] expected = {1, 3, 4, 5, 6, 7, 8, 9};
        shellSort.shellSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testShellSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        shellSort.shellSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testShellSortWithOneElement() {
        int[] array = {42};
        int[] expected = {42};
        shellSort.shellSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testShellSortWithDuplicateElements() {
        int[] array = {5, 2, 7, 2, 1};
        int[] expected = {1, 2, 2, 5, 7};
        shellSort.shellSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testShellSortWithNegativeNumbers() {
        int[] array = {-3, 8, -1, 5, 0};
        int[] expected = {-3, -1, 0, 5, 8};
        shellSort.shellSort(array);
        assertArrayEquals(expected, array);
    }

    //Shell Sort Ends Here...
}
