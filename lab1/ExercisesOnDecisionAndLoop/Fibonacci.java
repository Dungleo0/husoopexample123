package lab1.ExercisesOnDecisionAndLoop;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        int fn=0;
        int fnMinus1 =1;
        int fnMinus2 =1;
        int nMax = 20;
        double average=0;
        System.out.println("The first "+nMax+ " Fibonacci numbers are: ");
        while (n <= nMax){
            System.out.print(fnMinus1+" ");
            fn=fnMinus1+fnMinus2;
            fnMinus1=fnMinus2;
            fnMinus2=fn;
            n++;
            average++;
        }
        System.out.println("\nThe average is "+ fn/average);
    }
}
