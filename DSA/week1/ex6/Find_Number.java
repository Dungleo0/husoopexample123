package DSA.week1.ex6;

import java.util.Arrays;
import java.util.Random;

public class Find_Number {

    public static void main(String[] args) {

        Random random = new Random();
        int size = (int) Math.pow(10, random.nextInt(4) + 1);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((int) Math.pow(10, 9) + 1);
        }
        int k = random.nextInt(1, size - 1);
        System.out.println("***NOTE hãy chay thu cho den khi gap mang be");
        System.out.println(Arrays.toString(array));

        long startTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("So BE thu " + k + " trong day la: " + check_Number_Small(array, k));
        System.out.println();

        long endTime = System.currentTimeMillis();
        double elapsedTime = (double) (endTime - startTime) / 1000;

        System.out.println("Thời gian chạy check_Number_Small: " + elapsedTime + " seconds");

        startTime = System.currentTimeMillis();

        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("So LON thu " + k + " trong day la: " + check_Number_Big(array, k));
        System.out.println();

        endTime = System.currentTimeMillis();
        elapsedTime = (double) (endTime - startTime) / 1000;
        System.out.println("Thời gian chạy check_Number_Big: " + elapsedTime + " seconds");

        System.out.println("Mang check >>>");
        System.out.println(Arrays.toString(array));
    }

    public static int check_Number_Small(int[] array, int k) {
        Arrays.sort(array);
        return array[k - 1];
    }

    public static int check_Number_Big(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }

}
