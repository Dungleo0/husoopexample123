package lab2;

import java.util.Scanner;

public class CopyOfArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        System.out.print("Enter elements array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=scanner.nextInt();
        }
        int [] arrayNew = copyOf(array);
        System.out.println("Number of elements you want to copy: ");
        int newlength = scanner.nextInt();


        int [] arrayNew2 =copyOf(array, newlength);
        System.out.print("Array after have copy: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i]+" ");
        }

        System.out.println();
        System.out.print("Array after have copy2: ");
        for (int i = 0; i < arrayNew2.length; i++) {
            System.out.print(arrayNew2[i]+" ");
        }
    }
    public static int[] copyOf(int[] array){
        int [] arrayShow = new int[array.length];
        for (int i = 0; i < arrayShow.length; i++) {
            arrayShow[i]=array[i];
        }
        return arrayShow;
    }
    public static int[] copyOf(int[] array,int newLength){
        int [] arrayShow = new int[newLength];
        for (int i = 0; i < arrayShow.length; i++) {
            arrayShow[i]=array[i];
        }
        return arrayShow;
    }
}
