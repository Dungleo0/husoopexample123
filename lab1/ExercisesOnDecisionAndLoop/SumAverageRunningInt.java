package lab1.ExercisesOnDecisionAndLoop;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        useFor();
        System.out.println("-----------------------");
        System.out.println("Use while loop to calculate ");
        useWhileDo();
        System.out.println("-----------------------");
        sumAverage();
        System.out.println("-----------------------");
        sumTheSquares();
        System.out.println("-----------------------");
        sumOfOddAndEven();
    }

    public static void useFor() {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
        }
        average = (double) sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
    }

    public static void useWhileDo() {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            ++number;
        }
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + (double) sum / 100);
    }

    public static void sumAverage() {
        int count = 0;
        int sum = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
            count++;
        }
        System.out.println("The sum of 111 to 8899 is " + sum);
        System.out.println("The average is " + (double) sum / count);
    }

    public static void sumTheSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Sum of the squares 1 to 100 is " + sum);
    }

    public static void sumOfOddAndEven() {
        int sumOdd = 0;
        int sumEven = 0;
        int betWeenSum;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of between two numbers odd and even is  " + (betWeenSum = Math.abs(sumOdd - sumEven)));
    }
}
