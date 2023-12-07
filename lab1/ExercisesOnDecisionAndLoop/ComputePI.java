package lab1.ExercisesOnDecisionAndLoop;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0;
        for (int denominator = 1; denominator <= 100000; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            }
        }
        System.out.println((double) 4 * sum);
    }
}
