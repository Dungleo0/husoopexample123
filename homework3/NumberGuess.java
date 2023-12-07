package homework3;

import java.util.Scanner;

public class NumberGuess {

    final static int SECRET_NUMBER = (int) (Math.random() * 100);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        int count = 0;
        do {
            System.out.println("You are guess number ");
            choose = scanner.nextInt();
            count++;
            if (choose < SECRET_NUMBER) {
                System.out.println("Guess high ");
            } else if (choose > SECRET_NUMBER) {
                System.out.println("Guess lower ");
            } else {
                System.out.println("SUCCESS !!");
                System.out.println("You have guess for " + count);
                break;
            }
        } while (true);
    }

}
