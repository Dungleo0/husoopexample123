package lab2;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent=scanner.nextInt();
        System.out.println(base+ " raises to the power of " + exponent +" is: "+exponent(base,exponent));
    }
    public static int exponent(int base,int exp){
        int temp = 1;
        for (int i = 1; i <= exp ; i++) {
            temp*=base;
        }
        return temp;
    }
}
