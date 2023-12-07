package lab1.ExercisesOnInputDecisionAndLoop;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = scanner.nextInt();
        int numberreverse = 0;
        while (number > 0) {
            int temp = number % 10;
            numberreverse = 10 * numberreverse + temp;
            number /= 10;
        }
        System.out.println("Number after reverse is: " + numberreverse);
    }
}
