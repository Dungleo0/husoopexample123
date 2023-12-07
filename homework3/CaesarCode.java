package homework3;

import java.util.Scanner;

public class CaesarCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        getCaesar(str);
    }

    public static void getCaesar(String input) {
        input = input.toUpperCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if ((int) input.charAt(i) >= 65 && (int) input.charAt(i) + 3 <= 87) {
                char temp = (char) (input.charAt(i) + 3);
                result += temp;
            } else if (input.charAt(i) == 'X') {
                char c = 'A';
                result += c;
            } else if (input.charAt(i) == 'Y') {
                char c = 'B';
                result += c;
            } else if (input.charAt(i) == 'Z') {
                char c = 'C';
                result += c;
            }
        }
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }
    }
}
