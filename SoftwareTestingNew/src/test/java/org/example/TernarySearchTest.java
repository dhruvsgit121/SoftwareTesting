package org.example;

import Searching.TernarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TernarySearchTest {

    TernarySearch ternarySearch = new TernarySearch();

    @Test
    public void testTernarySearchKeyPresent() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        int result = ternarySearch.ternarySearch(0, arr.length - 1, key, arr);
        assertEquals(4, result);
    }

    @Test
    public void testTernarySearchKeyNotPresent() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 50;
        int result = ternarySearch.ternarySearch(0, arr.length - 1, key, arr);
        assertEquals(-1, result);
    }

    @Test
    public void testTernarySearchKeyAtBeginning() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 1;
        int result = ternarySearch.ternarySearch(0, arr.length - 1, key, arr);
        assertEquals(0, result);
    }

    @Test
    public void testTernarySearchKeyAtEnd() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 10;
        int result = ternarySearch.ternarySearch(0, arr.length - 1, key, arr);
        assertEquals(9, result);
    }

    @Test
    public void testTernarySearchEmptyArray() {
        int[] arr = {};
        int key = 5;
        int result = ternarySearch.ternarySearch(0, arr.length - 1, key, arr);
        assertEquals(-1, result);
    }

}
