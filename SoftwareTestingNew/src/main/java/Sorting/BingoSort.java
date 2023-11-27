package Sorting;

import java.util.Collections;
import java.util.List;

public class BingoSort {

    public static void maxMin(List<Integer> vec, int n, int[] bingo, int[] nextBingo) {
        for (int i = 1; i < n; i++) {
            bingo[0] = Math.min(bingo[0], vec.get(i));
            nextBingo[0] = Math.max(nextBingo[0], vec.get(i));
        }
    }

    public static void bingoSort(List<Integer> vec, int n) {
        int[] bingo = {vec.get(0)};
        int[] nextBingo = {vec.get(0)};
        maxMin(vec, n, bingo, nextBingo);
        int largestEle = nextBingo[0];
        int nextElePos = 0;

        while (bingo[0] < nextBingo[0]) {
            int startPos = nextElePos;
            for (int i = startPos; i < n; i++) {
                if (vec.get(i).equals(bingo[0])) {
                    Collections.swap(vec, i, nextElePos);
                    nextElePos = nextElePos + 1;
                } else if (vec.get(i) < nextBingo[0])
                    nextBingo[0] = vec.get(i);
            }
            bingo[0] = nextBingo[0];
            nextBingo[0] = largestEle;
        }
    }
}
