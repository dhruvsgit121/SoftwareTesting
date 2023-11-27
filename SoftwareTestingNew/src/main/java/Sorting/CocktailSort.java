package Sorting;

public class CocktailSort {

    public void cocktailSort(int a[], int n) {
        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) {

            swapped = false;

            for (int i = start; i < end; ++i) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;

            swapped = false;

            --end;

            for (int i = end - 1; i >= start; --i) {
                if (a[i] > a[i + 1]) {

                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            ++start;
        }
    }
}
