package org.example;

import Searching.Searching;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SearchingTest {
    Searching searching = new Searching();

    //Binary Search Test Starts Here...

    @Test
    public void testBinarySearchElementFound() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToSearch = 6;
        int expectedIndex = 5;
        int result = searching.binarySearch(input, valueToSearch);
        assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valueToSearch = 11;
        int expectedIndex = -1;
        int result = searching.binarySearch(input, valueToSearch);
        assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] input = {};
        int valueToSearch = 5;
        int expectedIndex = -1;
        int result = searching.binarySearch(input, valueToSearch);
        assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchArrayWithOneElementFound() {
        int[] input = {42};
        int valueToSearch = 42;
        int expectedIndex = 0;
        int result = searching.binarySearch(input, valueToSearch);
        assertEquals(expectedIndex, result);
    }

    @Test
    public void testBinarySearchArrayWithOneElementNotFound() {
        int[] input = {42};
        int valueToSearch = 7;
        int expectedIndex = -1;
        int result = searching.binarySearch(input, valueToSearch);
        assertEquals(expectedIndex, result);
    }
    //Binary Search Test Cases Ends Here...
}
