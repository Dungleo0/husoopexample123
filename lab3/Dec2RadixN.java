package lab3;

import java.util.Scanner;

public class Dec2RadixN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        String temp = Dec2RadN(number);
        System.out.print("The equivalent hexadecimal number ");
        for (int i = temp.length() - 1; i >= 0; i--) {
            System.out.print(temp.charAt(i));
        }
    }

    public static String Dec2RadN(int number) {
        String ex = "0123456789ABCDEF";
        String result = "";
        while (number > 0) {
            int temp = number % 16;
            result = result + ex.charAt(temp);
            number = number / 16;

        }
        return result;
    }
}
