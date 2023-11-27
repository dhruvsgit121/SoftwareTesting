package org.example;

import Searching.MetaBinarySearch;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MetaBinarySearchTest {

    MetaBinarySearch metaBinarySearch = new MetaBinarySearch();

    @Test
    public void testBinarySearch() {
        List<Integer> A = Arrays.asList(-2, 10, 100, 250, 32315);
        assertEquals(1, metaBinarySearch.bsearch(A, 10));
        assertEquals(2, metaBinarySearch.bsearch(A, 100));
        assertEquals(4, metaBinarySearch.bsearch(A, 32315));
        assertEquals(-1, metaBinarySearch.bsearch(A, 42));
    }

    @Test
    public void testBinarySearchEmptyList() {
        List<Integer> A = Arrays.asList();
        assertEquals(-1, metaBinarySearch.bsearch(A, 10));
    }

    @Test
    public void testBinarySearchSingleElement() {
        List<Integer> A = Arrays.asList(42);
        assertEquals(0, metaBinarySearch.bsearch(A, 42));
        assertEquals(-1, metaBinarySearch.bsearch(A, 10));
    }

    @Test
    public void testBinarySearchLargeArray() {
        List<Integer> A = Arrays.asList(-2, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95);
        assertEquals(2, metaBinarySearch.bsearch(A, 10));
        assertEquals(18, metaBinarySearch.bsearch(A, 90));
        assertEquals(-1, metaBinarySearch.bsearch(A, 42));
    }
}
