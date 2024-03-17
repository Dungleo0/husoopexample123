package DSA.week1.ex2;

import java.util.Arrays;

public class SelectionSort extends Sort{

    public static void selection_Sort(int[] arraynew) {

        for (int i = 0; i < arraynew.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[j] < arraynew[min_index]) {
                    min_index = j;

                }
                System.out.println("i=" + i + ", j=" + min_index + " : " + Arrays.toString(arraynew));
            }
            if (min_index != i) {
                int temp = arraynew[i];
                arraynew[i] = arraynew[min_index];
                arraynew[min_index] = temp;

            }
        }

        print_Array(arraynew);
    }

    public static void print_Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
