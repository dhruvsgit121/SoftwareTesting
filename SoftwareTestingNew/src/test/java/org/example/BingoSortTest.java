package org.example;

import Sorting.BingoSort;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BingoSortTest {
    BingoSort bingoSort = new BingoSort();

    @Test
    public void testBingoSort() {
        // Test case 1
        List<Integer> input1 = Arrays.asList(5, 4, 8, 5, 4, 8, 5, 4, 4, 4);
        List<Integer> expected1 = Arrays.asList(4, 4, 4, 4, 4, 5, 5, 5, 8, 8);
        bingoSort.bingoSort(input1, input1.size());
        assertEquals(expected1, input1);
    }

    @Test
    public void testBingoSortForRandomArray() {
        List<Integer> input2 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        bingoSort.bingoSort(input2, input2.size());
        assertEquals(expected2, input2);
    }

    @Test
    public void testBingoSortForBinaryArrays() {
        List<Integer> input3 = Arrays.asList(0, 1, 0, 1, 0, 1);
        List<Integer> expected3 = Arrays.asList(0, 0, 0, 1, 1, 1);
        bingoSort.bingoSort(input3, input3.size());
        assertEquals(expected3, input3);
    }
}
