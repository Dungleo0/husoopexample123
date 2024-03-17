package DSA.week1.ex1;

import java.util.Arrays;

public class BubbleSort {
    public static void bubble_Sort(int[] array) {
        int sosanh = 0;
        int doicho = 0;
        int[] arraynew = array.clone();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arraynew.length; i++) {
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[i] > arraynew[j]) {
                    int temp = arraynew[j];
                    arraynew[j] = arraynew[i];
                    arraynew[i] = temp;
                    sosanh++;
                    doicho++;
                }
                System.out.println("i=" + i + ", j=" + j + " : " + Arrays.toString(arraynew));
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

    public static void bubble_Sort2(int[] array) {
        Integer sosanh = 0;
        Integer doicho = 0;

        int[] arraynew = array.clone();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < arraynew.length; i++) {
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[i] > arraynew[j]) {
                    int temp = arraynew[j];
                    arraynew[j] = arraynew[i];
                    arraynew[i] = temp;

                    sosanh++;
                    doicho++;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian chạy : " + (double) elapsedTime / 1000 + " seconds");
        System.out.println("\nso sanh: " + sosanh + " doi cho: " + doicho);
    }
}
