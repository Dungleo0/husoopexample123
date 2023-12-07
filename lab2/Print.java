package lab2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length a array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        print(array);
    }

    public static void print(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

}
