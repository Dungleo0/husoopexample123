package lab1.ExercisesOnInputDecisionAndLoop;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter a number between 0-10 or 90 -100 ");
            number = scanner.nextInt();
            System.out.println("try again...");
        } while (number < 0 || number > 10 && number < 90 || number > 100);
        System.out.println("you have enter " + number);
    }
}
