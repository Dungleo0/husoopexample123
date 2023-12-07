package lab2;

import java.util.Scanner;

public class SearchNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter search number: ");
        int search = scanner.nextInt();
        if (search(array, search) != -1) {
            System.out.print("Number in index is: " + search(array, search));
        } else {
            System.out.println(search(array, search));
        }
    }

    public static int search(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}

