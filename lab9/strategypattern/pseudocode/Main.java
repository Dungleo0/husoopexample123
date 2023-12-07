package lab9.strategypattern.pseudocode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        int a = 5;
        int b = 2;

        Scanner sc = new Scanner(System.in);
        System.out.println("---------Calculator------------");
        System.out.println("You have " + a + " and " + b + "");
        System.out.printf("Enter press 1 to add two numbers a and b\n");
        System.out.printf("Enter press 2 to subtract two numbers a and b\n");
        System.out.printf("Enter press 3 to multiply two numbers a and b\n");

        String str = sc.nextLine();

        if (str.equals("1")) {
            context.setStrategy(new ConcreteStrategyAdd());
            System.out.println(context.executeStrategy(a, b));
        }else if (str.equals("2")){
            context.setStrategy(new ConcreteStrategySubtract());
            System.out.println(context.executeStrategy(a, b));
        } else if (str.equals("3")) {
            context.setStrategy(new ConcreteStrategyMultiply());
            System.out.println(context.executeStrategy(a, b));
        }else {
            System.out.println("You dont press enter 1 or 2 or 3");
        }

    }
}
