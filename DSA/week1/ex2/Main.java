package DSA.week1.ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sort sorter = new Sort();
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();


        Scanner in = new Scanner(System.in);
        System.out.print("Number SV: ");
        int n = in.nextInt();
        List<SinhVien> listSV = new ArrayList<SinhVien>();
        for (int i = 0; i < n; i++) {
            listSV.add(new SinhVien(i, new Random().nextInt(0, 10)));
        }
        bubbleSort.sort(listSV);
        System.out.println("BubbleSort");
        for (Object x : listSV) {
            System.out.println(x);
        }

        System.out.println("\n");
        selectionSort.sort(listSV);
        System.out.println("selectionSort");

        for (Object x : listSV) {
            System.out.println(x);
        }

        System.out.println("\n");
        insertionSort.sort(listSV);
        System.out.println("insertionSort");

        for (Object x : listSV) {
            System.out.println(x);
        }

        System.out.println("\n");
        quickSort.sort(listSV);
        System.out.println("quickSort");

        for (Object x : listSV) {
            System.out.println(x);
        }

        System.out.println("\n");
        mergeSort.sort(listSV);
        System.out.println("mergeSort");

        for (Object x : listSV) {
            System.out.println(x);
        }
    }
}
