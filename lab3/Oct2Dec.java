package lab3;

import java.util.Scanner;

public class Oct2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        int octal = sc.nextInt();
        System.out.println("The equivalent decimal number " + octal + " is: " + oct2Dec(octal));
    }

    public static int oct2Dec(int oct) {
        int decimal = 0;
        int exp = 0;
        while (oct > 0) {
            int temp = oct % 10;
            decimal += (int) (temp * Math.pow(8, exp));
            oct = oct / 10;
            exp++;
        }
        return decimal;
    }
}

