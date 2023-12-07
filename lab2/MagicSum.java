package lab2;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SENTINEL = -1;
        int number;
        System.out.print("Enter a positive integer ( or -1 to end): ");
        number = scanner.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if(isEight(number)){
                sum+=number;
            }
            System.out.print("Enter the positive integer (or -1 to end): ");
            number=scanner.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }
    public static boolean isEight(int number){
        while (number>0){
            int eight = number % 10;
            number/=10;
            if(eight!=8){
                return false;
            }
        }
        return true;
    }
}
