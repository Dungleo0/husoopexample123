package lab2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size array1: ");
        int size1 = scanner.nextInt();

        int[] array = new int[size1];

        System.out.print("Enter elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array after reverse is: ");
        reverse(array);
    }
    public static void reverse(int[] array){
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
