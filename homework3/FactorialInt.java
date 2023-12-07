package homework3;

public class FactorialInt {

    public static void main(String[] args) {
        int element = 1;
        int base = 1;
        for (; ; ) {
            if (Integer.MAX_VALUE / element < (base + 1)) {
                System.out.printf("The factorial of %d is out of range \n", element + 1);
                break;
            }
            base++;
            element *= base;
            System.out.println(element);
        }
    }

    public static int factorial(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        return number;
    }

    public static long factorialNew(int n) {
        long number = 1;
        for (int i = 1; i <= n; i++) {
            number *= i;
        }
        return number;
    }
}
