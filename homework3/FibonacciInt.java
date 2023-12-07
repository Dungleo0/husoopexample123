package homework3;

import java.util.Scanner;

public class FibonacciInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        int element = 1;
        System.out.println(fn);
        System.out.println(f1);
        System.out.println(f2);
        for (; ; ) {
            element++;
            fn = f1 + f2;
            if (Integer.MAX_VALUE - f1 > fn) {
                System.out.println(fn);
            }else {
                System.out.println("Out of the range of int!! ");
                break;
            }
            f2=f1;
            f1=fn;
        }
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
