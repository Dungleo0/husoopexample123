package lab3;

import java.util.Scanner;

public class Dex2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        String str = Dec2Hex(number);
        System.out.print("The equivalent hexadecimal  number is ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static String Dec2Hex(int number) {
        String ex = "0123456789ABCDEF";
        String result = "";
        while (number > 0) {
            int temp = number % 16;
            result = result + ex.charAt(temp);
            number /= 16;
        }
        return result;
    }
}