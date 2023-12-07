package lab3;

import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix ");
        String str = sc.nextLine();
        System.out.print("Enter the input Radix ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output Radix ");
        int outRadix = sc.nextInt();
        System.out.print(str + " in radix " + inRadix + " is " + toRadix(str, inRadix, outRadix) + " in radix " + outRadix);
    }

    public static int conver(String str, int inRadix) {
        String hex = "0123456789ABCDEF";
        str = str.toUpperCase();
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char charId = str.charAt(i);
            int index = hex.indexOf(charId);
            number = number * inRadix + index;
        }
        return number;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int convert = conver(in, inRadix);
        String result = change(convert, outRadix);
        return result;
    }

    public static String change(int n, int outRadix) {
        if (n / outRadix == 0) return Integer.toString(n % outRadix);

        return change(n / outRadix, outRadix) + Integer.toString(n % outRadix);
    }
}