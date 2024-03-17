package DSA.week1.ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int[] array;
    static int n;

    public static void main(String[] args) {

        while (true) {

            menu();

            String choose = scanner.nextLine();

            if (choose.equals("1")) {

                optionOne();

            } else if (choose.equals("2")) {

                optionTwo();

            } else if (choose.equals("0")) {
                System.out.println("Thanks you");
                break;

            } else {
                System.out.println("Nhap lieu khong dung");
            }
        }

    }

    public static void print_Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void menu() {
        System.out.println("\n0. Thoat chuong trinh" +
                "\n1.Với dãy số nguyên có kích thước nhỏ được nhập từ bàn phím. In trang thai, ss, dem" + // kich thuoc be
                "\n2.Sinh N số ngẫu nhiên có giá trị trong [1, 10^6]");            // lap lai lay kich thuoc be
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 1000000);
        }
    }

    public static void optionOne() {
        System.out.println("Nhap kich thuoc mang");
        n = Integer.parseInt(scanner.nextLine());
        array = new int[n];

        inputArray(array);

        System.out.println("\nUsing Bubble Sort: \n");
        BubbleSort.bubble_Sort(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing insertion_Sort: \n");
        InsertionSort.insertion_Sort(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing selection_Sort: \n");
        SelectionSort.selection_Sort(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing quickSort: \n");
        QuickSort.quickSort(array, 0, array.length - 1);
        print_Array(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing  merge_Sort: \n");
        MergeSort.merge_Sort(array, 0, array.length - 1);
        print_Array(array);
        System.out.println("\n============================================\n");
    }

    public static void optionTwo() {
        n = new Random().nextInt(1, (int)10e+4); // chay rat lau
        array = new int[n];

        inputArray(array);
        System.out.println("So to co the chay lau va ra gia tri am");
        System.out.println("Sap xep "+n +" phan tu");
        System.out.println("LOADING...");
        System.out.println("\nUsing Bubble Sort: \n");
        BubbleSort.bubble_Sort2(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing insertion_Sort: \n");
        InsertionSort.insertion_Sort2(array);
        System.out.println("\n============================================\n");

        System.out.println("\nUsing selection_Sort: \n");
        SelectionSort.selection_Sort2(array);
        System.out.println("\n============================================\n");

        long startTime = System.currentTimeMillis();
        System.out.println("\nUsing quickSort: \n");
        quickSort2(array, 0, array.length - 1);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian chạy : " + (double) elapsedTime / 1000 + " seconds");
        System.out.println("\n============================================\n");


        long startTime1 = System.currentTimeMillis();
        System.out.println("\nUsing  merge_Sort: \n");
        merge_Sort2(array, 0, array.length - 1);
        long endTime1 = System.currentTimeMillis();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("Thời gian chạy : " + (double) elapsedTime1 / 1000 + " seconds");
        System.out.println("\n============================================\n");
    }

    public static void quickSort2(int[] array, int i, int j) {
        if (i < j) {
            int pivot = partition2(array, i, j);
            quickSort2(array, i, pivot - 1);
            quickSort2(array, pivot + 1, j);
        }
    }

    private static int partition2(int[] array, int i, int j) {
        int p = array[i];
        int m = i;
        for (int k = i + 1; k <= j; k++) {
            if (array[k] < p) {
                m++;
                swap(array, k, m);
            }
        }
        swap(array, i, m);
        return m;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void merge_Sort2(int[] array, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge_Sort2(array, l, mid);
            merge_Sort2(array, mid + 1, r);
            merge2(array, l, mid, r);
        }
    }

    public static void merge2(int[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }


}

