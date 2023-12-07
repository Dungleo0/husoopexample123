package lab9.strategypattern.SortStretegy;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] a) {
        System.out.println("Sort by InsertionSort");
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;

        }
    }
}