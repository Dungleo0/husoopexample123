package lab9.strategypattern.SortStretegy;

public class SelectionSort implements Sort{
    @Override
    public void sort(int[] a) {
        System.out.println("Sorting by SelectionSort");
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
