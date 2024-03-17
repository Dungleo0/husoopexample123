package DSA.week1.ex4;

import java.util.Arrays;
import java.util.Random;

public class b44 {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5, 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 5);
        }
        System.out.println("Array before sorted\n" + Arrays.toString(array));
        merge(array, 0, array.length - 1);
        System.out.println("Array after sorted" );
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void merge(int[] arrray, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge(arrray, l, mid);
            merge(arrray, mid + 1, r);
            mergeSort(arrray, l, mid, r);
        }
    }

    public static void mergeSort(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = array[m + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

}
