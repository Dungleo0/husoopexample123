package lab3;

import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.printf("The equivalent decimal number %s is: %s", s, Integer.parseInt(s, radix));
    }
}

