package lab3;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hex = {"0000", "0001", "0010", "0011", "0100"
                , "0101", "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        String hex16 = "0123456789ABCDEF";
        System.out.print("Enter the Hexadecimal string is: ");
        String str = sc.nextLine();
        if (check(str)) {
            System.out.print("The equivalent binary for hexadecimal " + str + " is : ");
            str = str.toUpperCase();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int id = hex16.indexOf(c);
                System.out.print(hex[id] + " ");
            }
        }
    }

    public static boolean check(String str) {
        str = str.toUpperCase();
        for (char i : str.toCharArray()) {
            if (!(Character.isDigit(i) || i >= 'A' && i <= 'F')) {
                return false;
            }
        }
        return true;
    }
}