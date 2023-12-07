package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int key = scan.nextInt();
        Arrays.sort(array);
        System.out.println(binarySearch(array, key, 0, array.length));
        System.out.println(binarySearch(array,key));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {

        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length);
    }
}
