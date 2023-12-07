package homework3;

import java.util.Scanner;

public class TestPalindromicWordAndTestPalindromicPhrase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string palindromic: ");
        String str = scanner.nextLine();
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String input) {
        input=input.toUpperCase();
        int first = 0;
        int last = input.length() - 1;
        while(first <= last){
            if(input.charAt(first) != input.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
