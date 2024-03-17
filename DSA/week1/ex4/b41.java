package DSA.week1.ex4;

import java.util.Arrays;
import java.util.Random;

public class b41 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5, 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 5);
        }
        System.out.println("Array before sorted\n" + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sort using insertion sort");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
