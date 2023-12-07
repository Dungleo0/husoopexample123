package lab2;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        draw1(size);
        System.out.println();
        draw2(size);
        System.out.println();
        draw3(size);
        System.out.println();
        draw4(size);
    }

    public static void draw1(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void draw2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void draw3(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void draw4(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >=0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
