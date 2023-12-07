package lab1.ExercisesOnDecisionAndLoop;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(sin(x, 100000));
    }

    public static double sin(double x, int numTerms) {
        x = x * Math.PI / 180;
        double sin = x;
        double temp = x;
        int i = 3;
        while (Math.abs(sin - Math.sin(x)) > numTerms) {
            temp = -temp * x * x / i / (i - 1);
            sin += temp;
            i += 2;
        }
        return sin;
    }
}
