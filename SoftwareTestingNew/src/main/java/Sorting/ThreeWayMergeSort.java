package Sorting;

public class ThreeWayMergeSort {

    public void mergeSort3Way(int[] gArr1) {
        int n1 = gArr1.length;

        if (n1 == 0)
            return;

        int[] fArr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            fArr1[i] = gArr1[i];

        mergeSort3WayRec(fArr1, 0, n1, gArr1);

        for (int i = 0; i < n1; i++)
            gArr1[i] = fArr1[i];
    }

    public void mergeSort3WayRec(int[] gArr1, int low1, int high1, int[] destArr1) {
        if (high1 - low1 < 2)
            return;

        int mid1 = low1 + ((high1 - low1) / 3);
        int mid2 = low1 + 2 * ((high1 - low1) / 3) + 1;

        mergeSort3WayRec(destArr1, low1, mid1, gArr1);
        mergeSort3WayRec(destArr1, mid1, mid2, gArr1);
        mergeSort3WayRec(destArr1, mid2, high1, gArr1);

        merge(destArr1, low1, mid1, mid2, high1, gArr1);
    }

    public void merge(int[] gArr1, int low1, int mid1, int mid2, int high1, int[] destArr1) {
        int i = low1, a = mid1, b = mid2, c = low1;

        while ((i < mid1) && (a < mid2) && (b < high1)) {
            if (gArr1[i] < gArr1[a]) {
                if (gArr1[i] < gArr1[b]) {
                    destArr1[c++] = gArr1[i++];
                } else {
                    destArr1[c++] = gArr1[b++];
                }
            } else {
                if (gArr1[a] < gArr1[b]) {
                    destArr1[c++] = gArr1[a++];
                } else {
                    destArr1[c++] = gArr1[b++];
                }
            }
        }

        while ((i < mid1) && (a < mid2)) {
            if (gArr1[i] < gArr1[a]) {
                destArr1[c++] = gArr1[i++];
            } else {
                destArr1[c++] = gArr1[a++];
            }
        }

        while ((a < mid2) && (b < high1)) {
            if (gArr1[a] < gArr1[b]) {
                destArr1[c++] = gArr1[a++];
            } else {
                destArr1[c++] = gArr1[b++];
            }
        }

        while ((i < mid1) && (b < high1)) {
            if (gArr1[i] < gArr1[b]) {
                destArr1[c++] = gArr1[i++];
            } else {
                destArr1[c++] = gArr1[b++];
            }
        }

        while (i < mid1) {
            destArr1[c++] = gArr1[i++];
        }

        while (a < mid2) {
            destArr1[c++] = gArr1[a++];
        }

        while (b < high1) {
            destArr1[c++] = gArr1[b++];
        }
    }
}
