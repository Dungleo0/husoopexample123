package lab2;

import java.util.Scanner;

public class Equals {
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
        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
