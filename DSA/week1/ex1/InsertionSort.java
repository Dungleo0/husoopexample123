package DSA.week1.ex1;

import java.util.Arrays;

public class InsertionSort {

    public static void insertion_Sort(int[] array) {
        int sosanh = 0;
        int doicho = 0;
        int[] arraynew = array.clone();
        long startTime = System.currentTimeMillis();
        int n = arraynew.length;
        for (int i = 1; i < n; i++) {
            int key = arraynew[i];
            int j = i - 1;
            while (j >= 0 && arraynew[j] > key) {
                arraynew[j + 1] = arraynew[j];
                j = j - 1;
                sosanh++;
                doicho++;
                System.out.println("i=" + i + ", j=" + j + " : " + Arrays.toString(arraynew));
            }
            arraynew[j + 1] = key;
            doicho++;

        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian chạy : " + (double) elapsedTime / 1000 + " seconds");
        print_Array(arraynew);
        System.out.println("\nso sanh: " + sosanh + " doi cho: " + doicho);
    }

    public static void print_Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void insertion_Sort2(int[] array) {
        int sosanh = 0;
        int doicho = 0;
        int[] arraynew = array.clone();
        long startTime = System.currentTimeMillis();
        int n = arraynew.length;
        for (int i = 1; i < n; i++) {
            int key = arraynew[i];
            int j = i - 1;
            while (j >= 0 && arraynew[j] > key) {
                arraynew[j + 1] = arraynew[j];
                j = j - 1;
                sosanh++;
                doicho++;
            }
            arraynew[j + 1] = key;
            doicho++;

        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian chạy : " + (double) elapsedTime / 1000 + " seconds");
        System.out.println("\nso sanh: " + sosanh + " doi cho: " + doicho);
    }
}
