package DSA.week1.ex2;

import java.util.Arrays;

public class InsertionSort extends Sort{

    public static void insertion_Sort(int[] arraynew) {

        int n = arraynew.length;
        for (int i = 1; i < n; i++) {
            int key = arraynew[i];
            int j = i - 1;
            while (j >= 0 && arraynew[j] > key) {
                arraynew[j + 1] = arraynew[j];
                j = j - 1;

                System.out.println("i=" + i + ", j=" + j + " : " + Arrays.toString(arraynew));
            }
            arraynew[j + 1] = key;

        }

        print_Array(arraynew);
    }

    public static void print_Array(int[] array) {
        for(Object x: array){
            System.out.println(x.toString());
        }
    }


}
