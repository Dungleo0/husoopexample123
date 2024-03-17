package DSA.week4.pratice1;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi muon dao nguoc:");
        s = scanner.nextLine();
        Stack<Character> reverse = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            reverse.push(s.charAt(i));
        }
        System.out.println("Chuoi sau khi thuc hien dao nguoc: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(reverse.pop());
        }
    }
}