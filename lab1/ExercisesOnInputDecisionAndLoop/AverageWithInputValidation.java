package lab1.ExercisesOnInputDecisionAndLoop;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double sumAverage = 0;
        boolean check;
        for (int i = 1; i <= 3; i++) {
            check=false;
            do {
                System.out.print("enter the mark between 0-100 for student " + i + ": ");
                number = scanner.nextInt();
                if (number > 0 && number < 100) {
                    check=true;
                } else {
                    System.out.println("Try again...");
                }
            } while (!check);
            sumAverage += number;
        }
        System.out.printf("The average is %.2f", sumAverage / 3);

    }
}
