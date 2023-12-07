package lab3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter key search in array: ");
        int key = scanner.nextInt();
        System.out.println(linearSearch(array,key));
        System.out.println(linearSearchIndex(array,key));
    }
    public static boolean linearSearch (int [] array ,int key ){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int [] array,int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
}
