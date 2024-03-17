package DSA.week1.ex2;

import java.util.Arrays;

public class QuickSort extends Sort{

    public static void quickSort(int[] array, int i, int j) {
        if (i < j) {
            int pivot = partition(array, i, j);
            quickSort(array, i, pivot - 1);
            quickSort(array, pivot + 1, j);
        }
    }

    private static int partition(int[] array, int i, int j) {
        int p = array[i];
        int m = i;
        for (int k = i + 1; k <= j; k++) {
            if (array[k] < p) {
                m++;
                swap(array, k, m);
                System.out.println("Pivot=" + p + " : " + Arrays.toString(array));
            }
        }
        swap(array, i, m);
        System.out.println("Pivot=" + p + " : " + Arrays.toString(array));
        return m;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
