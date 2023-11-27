package Searching;

import java.util.List;

public class MetaBinarySearch {
    public int bsearch(List<Integer> A, int keyToSearch) {

        int n = A.size();

        if (n == 0) return -1;

        int lg = (int) (Math.log(n - 1) / Math.log(2)) + 1;

        int pos = 0;
        for (int i = lg; i >= 0; i--) {
            if (A.get(pos).equals(keyToSearch))
                return pos;

            int newPos = pos | (1 << i);

            if ((newPos < n) && (A.get(newPos) <= keyToSearch))
                pos = newPos;
        }

        return ((A.get(pos).equals(keyToSearch)) ? pos : -1);
    }
}
