package lab2;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.print("Enter elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.print("Enter number contain array: ");
        int search = scanner.nextInt();
        System.out.println(contains(array,search));
    }
    public static boolean contains(int [] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }
}
