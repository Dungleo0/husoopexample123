package homework3;

import java.util.Scanner;

public class FactorialRecusive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial of number is: ");
        System.out.println(factorial(scanner.nextInt()));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
