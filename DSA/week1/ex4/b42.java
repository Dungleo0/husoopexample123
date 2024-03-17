package DSA.week1.ex4;

import java.util.Arrays;
import java.util.Random;

public class b42 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5, 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0,5);
        }
        System.out.println("Array before sorted\n"+ Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Array after sort using bubble sort");
        printArray(array);
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
