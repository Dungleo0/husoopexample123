package lab2;

import java.util.Scanner;

public class ExercisesOnStringAndCharOperations {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        reverseString();
        countVowelsDigits();
        checkHexStr();
    }

    public static void reverseString() {
        System.out.print("Enter a String: ");
        String text = scan.nextLine();
        System.out.print("The reverse of the String is: ");
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    public static void countVowelsDigits() {
        System.out.print("Enter a String: ");
        int countNumbers = 0;
        int countVowels = 0;
        String word = scan.nextLine().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                countNumbers++;
            } else if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                countVowels++;
            }
        }
        System.out.printf("Number of vowels: %d (%.2f%%)\n", countVowels, 100.0 * countVowels / word.length());
        System.out.printf("Number of digits: %d (%.2f%%)\n", countNumbers, 100.0 * countNumbers / word.length());
    }

    public static void checkHexStr() {
        System.out.print("Enter a String: ");
        String word = scan.nextLine().toLowerCase();
        boolean check = false;
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isDigit(word.charAt(i)) || (word.charAt(i) >= 'a' && word.charAt(i) <= 'f'))) {
                check = true;
            }
        }
        if (!check) {
            System.out.println(word + " is a string");
        } else {
            System.out.println(word + " is a NOT hex string");
        }
    }
}
