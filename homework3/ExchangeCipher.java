package homework3;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        changeChar(str);
    }

    public static void changeChar(String input) {
        input = input.toUpperCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                char temp = input.charAt(i);
                char c = 'Z';
                result += c;
            } else if (input.charAt(i) == 'Z') {
                char temp = input.charAt(i);
                char c = 'A';
                result += c;
            } else if (input.charAt(i) == 'B') {
                char temp = input.charAt(i);
                char c = 'Y';
                result += c;
            } else if (input.charAt(i) == 'Y') {
                char temp = input.charAt(i);
                char c = 'B';
                result += c;
            } else if (input.charAt(i) == 'C') {
                char temp = input.charAt(i);
                char c = 'X';
                result += c;
            } else if (input.charAt(i) == 'X') {
                char temp = input.charAt(i);
                char c = 'C';
                result += c;
            } else {
                result += input.charAt(i);
            }
        }
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
        }
    }
}
