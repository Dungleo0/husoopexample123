package lab2;

import java.util.Scanner;

public class ExercisesOnArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        NUM_ITEMS = 5;
        items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.println("Enter the value of items: " + NUM_ITEMS);
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = scanner.nextInt();
            }
        }
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.print(items[0]);
            } else {
                System.out.printf(", %d", items[i]);
            }
        }
        System.out.println("]");
    }
}
