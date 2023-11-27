package org.example;

import Searching.SentinelSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentinelSearchTest {

    SentinelSearch sentinelSearch = new SentinelSearch();

    @Test
    public void testSentinelSearchElementFound() {
        int arr[] = {10, 20, 180, 30, 60, 50, 110, 100, 70};
        int key = 180;
        int n = arr.length;

        int expected = 2;
        int actual = sentinelSearch.sentinelSearch(arr, n, key);

        assertEquals(expected, actual);
    }

    @Test
    public void testSentinelSearchElementNotFound() {
        int arr[] = {10, 20, 180, 30, 60, 50, 110, 100, 70};
        int key = 40;
        int n = arr.length;

        int expected = -1;
        int actual = sentinelSearch.sentinelSearch(arr, n, key);

        assertEquals(expected, actual);
    }

    @Test
    public void testSentinelSearchEmptyArray() {
        int arr[] = {};
        int key = 40;
        int n = arr.length;

        int expected = -1;
        int actual = sentinelSearch.sentinelSearch(arr, n, key);

        assertEquals(expected, actual);
    }

    @Test
    public void testSentinelSearchFirstElement() {
        int arr[] = {5, 10, 15, 20, 25};
        int key = 5;
        int n = arr.length;

        int expected = 0;
        int actual = sentinelSearch.sentinelSearch(arr, n, key);

        assertEquals(expected, actual);
    }
}
