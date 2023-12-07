package lab2;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to array: ");
        int number = sc.nextInt();
        int [] array = new int[number];
        System.out.print("Enter number to array string: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(arrayToString(array));
    }

    public static String arrayToString(int [] array){
        StringBuilder sb = new StringBuilder("");
        String join ="";
        for (int  x : array) {
            sb.append(join).append(x);
            join=", ";
        }
        return sb.toString();
    }
}
