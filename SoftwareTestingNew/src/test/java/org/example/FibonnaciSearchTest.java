package org.example;

import Searching.FibonnaciSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonnaciSearchTest {

    FibonnaciSearch fibonaciSearch = new FibonnaciSearch();

    @Test
    public void testFibonacciSearchFound() {
        int arr[] = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235};
        int n = arr.length;
        int x = 85;

        int result = fibonaciSearch.fibMonaccianSearch(arr, x, n);

        assertEquals(8, result);
    }

    @Test
    public void testFibonacciSearchNotFound() {
        int arr[] = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235};
        int n = arr.length;
        int x = 75;

        int result = fibonaciSearch.fibMonaccianSearch(arr, x, n);

        assertEquals(-1, result);
    }

    @Test
    public void testFibonacciSearchEmptyArray() {
        int arr[] = {};
        int n = arr.length;
        int x = 42;

        int result = fibonaciSearch.fibMonaccianSearch(arr, x, n);

        assertEquals(-1, result);
    }

    @Test
    public void testFibonacciSearchSingleElementFound() {
        int arr[] = {42};
        int n = arr.length;
        int x = 42;

        int result = fibonaciSearch.fibMonaccianSearch(arr, x, n);

        assertEquals(0, result);
    }

    @Test
    public void testFibonacciSearchSingleElementNotFound() {
        int arr[] = {42};
        int n = arr.length;
        int x = 99;
        int result = fibonaciSearch.fibMonaccianSearch(arr, x, n);
        assertEquals(-1, result);
    }
}
