package lab3;

import java.util.Scanner;

public class Bin2Dec {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Binary string: ");
        int number = scanner.nextInt();
        if (bin2Dec(number) == 0) {
            System.out.println("error : invalid binary string: " + number);
        } else {
            System.out.println("The equivalent decimal number for binary " + number + " is " + bin2Dec(number));
        }
    }

    public static int bin2Dec(int number) {
        int dec_value = 0;
        int base = 1;
        while (number > 0) {
            int last_digit = number % 10;
            number /= 10;
            dec_value = dec_value + last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }
}
