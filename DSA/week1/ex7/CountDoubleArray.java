package DSA.week1.ex7;

import java.util.Arrays;
import java.util.Random;

public class CountDoubleArray {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(5,10);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(0,10);
        }
        int key = random.nextInt(5,10);
        System.out.println(Arrays.toString(array));
        System.out.println("So cap co gia tri = "+ key+" la: "+check(array, key));
    }

    public static int check(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == key){
                    count++;
                }
            }
        }
        return count;
    }
}
