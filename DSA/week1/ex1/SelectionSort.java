package DSA.week1.ex1;

import java.util.Arrays;

public class SelectionSort {

    public static void selection_Sort(int[] array) {
        int sosanh = 0;
        int doicho = 0;
        int[] arraynew = array.clone();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arraynew.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[j] < arraynew[min_index]) {
                    min_index = j;
                    sosanh++;
                }
                System.out.println("i=" + i + ", j=" + min_index + " : " + Arrays.toString(arraynew));
            }
            if (min_index != i) {
                int temp = arraynew[i];
                arraynew[i] = arraynew[min_index];
                arraynew[min_index] = temp;
                doicho++;
            }
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

    public static void selection_Sort2(int[] array) {
        int sosanh = 0;
        int doicho = 0;
        int[] arraynew = array.clone();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arraynew.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[j] < arraynew[min_index]) {
                    min_index = j;
                    sosanh++;
                }
            }
            if (min_index != i) {
                int temp = arraynew[i];
                arraynew[i] = arraynew[min_index];
                arraynew[min_index] = temp;
                doicho++;
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian chạy : " + (double) elapsedTime / 1000 + " seconds");
        System.out.println("\nso sanh: " + sosanh + " doi cho: " + doicho);
    }
}
