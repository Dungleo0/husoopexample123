package homework3;

import java.util.Scanner;

public class DecipherCaesarCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        getDecipherCode(str);
    }

    public static void getDecipherCode(String input) {
        input = input.toUpperCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) - 3 >= 68 && (int) input.charAt(i) - 3 <= 90) {
                char c = (char) (input.charAt(i) - 3);
                result += c;
            } else if ((int)input.charAt(i) == 'A') {
                char c = 'X';
                result+=c;
            } else if ((int)input.charAt(i) == 'B') {
                char c = 'Y';
                result+=c;
            } else if ((int)input.charAt(i)=='C') {
                char c = 'Z';
                result+=c;
            }
        }
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }
    }
}
