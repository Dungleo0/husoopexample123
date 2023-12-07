package lab2;

import java.util.Scanner;

public class SwapElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size array1: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.print("Enter elements array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }


        System.out.print("Enter size array2: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.print("Enter elements array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println(swap(array1,array2));
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
               int temp = array1[i];
               array1[i]=array2[i];
               array2[i]=temp;
            }
            return true;
        }
        return false;
    }
}
