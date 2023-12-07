package homework3;

public class LengthOfARunningNumberSequence {

    public static void main(String[] args) {
        System.out.println(lengthNumber(15));
    }

    public static String lengthNumber(int n) {
        if (n == 1) {
            return "1";
        } else {
            return lengthNumber(n - 1) + n;
        }
    }
}
