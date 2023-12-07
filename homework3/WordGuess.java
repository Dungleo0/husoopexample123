package homework3;

import java.util.Scanner;

public class WordGuess {

    final static String str = "testing";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordToGuess = str;
        int wordLength = wordToGuess.length();
        boolean[] guessedCharacters = new boolean[wordLength];
        int trials = 0;

        System.out.println("Enter one character or your guess word: " + "_".repeat(wordLength));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                char guessedChar = input.charAt(0);
                boolean guessedCorrectly = false;

                for (int i = 0; i < wordLength; i++) {
                    if (wordToGuess.charAt(i) == guessedChar && !guessedCharacters[i]) {
                        guessedCharacters[i] = true;
                        guessedCorrectly = true;
                    }
                }

                if (guessedCorrectly) {
                    System.out.println((trials * 2 + 1) + " Trial " + (trials + 1) + ": " + displayWord(wordToGuess, guessedCharacters));
                } else {
                    trials++;
                    System.out.println((trials * 2 + 1) + " Trial " + (trials + 1) + ": " + displayWord(wordToGuess, guessedCharacters));
                }

                if (!containsFalse(guessedCharacters)) {
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + (trials + 1) + " trials");
                    break;
                }
            } else if (input.equalsIgnoreCase(wordToGuess)) {
                System.out.println("Congratulations!");
                System.out.println("You got it in " + (trials + 1) + " trials");
                break;
            } else {
                System.out.println("Incorrect guess. Try again.");
            }
        }

        scanner.close();
    }

    private static String displayWord(String wordToGuess, boolean[] guessedCharacters) {
        StringBuilder display = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (guessedCharacters[i]) {
                display.append(wordToGuess.charAt(i));
            } else {
                display.append("_");
            }
        }
        return display.toString();
    }

    private static boolean containsFalse(boolean[] array) {
        for (boolean value : array) {
            if (!value) {
                return true;
            }
        }
        return false;
    }
}
