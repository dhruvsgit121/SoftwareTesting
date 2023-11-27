package org.example;

import Searching.JumpSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpSearchTest {

    JumpSearch jumpSearch = new JumpSearch();

    @Test
    public void testJumpSearchFound() {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        int expectedIndex = 10;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchNotFound() {
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 100;
        int expectedIndex = -1;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchEmptyArray() {
        int[] arr = {};
        int x = 42;
        int expectedIndex = -1;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchSingleElementFound() {
        int[] arr = {42};
        int x = 42;
        int expectedIndex = 0;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchSingleElementNotFound() {
        int[] arr = {42};
        int x = 99;
        int expectedIndex = -1;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchLargeArrayFound() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        int x = 666;
        int expectedIndex = 333;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testJumpSearchLargeArrayNotFound() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        int x = 777;
        int expectedIndex = -1;
        int actualIndex = jumpSearch.jumpSearch(arr, x);
        assertEquals(expectedIndex, actualIndex);
    }

}
