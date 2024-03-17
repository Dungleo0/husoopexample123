package DSA.week1.ex2;

import java.util.Arrays;

public class BubbleSort extends Sort {
    public static void bubble_Sort(int[] arraynew) {
        for (int i = 0; i < arraynew.length; i++) {
            for (int j = i + 1; j < arraynew.length; j++) {
                if (arraynew[i] > arraynew[j]) {
                    int temp = arraynew[j];
                    arraynew[j] = arraynew[i];
                    arraynew[i] = temp;
                }
                System.out.println("i=" + i + ", j=" + j + " : " + Arrays.toString(arraynew));
            }
        }

        print_Array(arraynew);
    }

    public static void print_Array(int[] array) {
        for(Object x: array){
            System.out.println(x.toString());
        }
    }
}
