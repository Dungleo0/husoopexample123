package mylist_lab;

import mylist.BasicStatistic;
import mylist.MyArrayList;
import mylist.MyLinkedList;
import mylist.MyList;

import java.util.ArrayList;
import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        System.out.println("======================================");
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */

        testList(new MyArrayList());

    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        testList(new MyLinkedList());
    }

    public static void testList(MyList myList) {
        myList.append(4D);
        myList.insert(2D, 1);
        myList.insert(3D, 1);
        myList.append(1D);
        myList.append(4.5);
        myList.insert(3.5, 0);

        if (myList instanceof MyLinkedList) {
            System.out.println("My LinkedList: \n" + myList);
        } else {
            System.out.println("My ArrayList: \n" + myList);
        }

        mylist.BasicStatistic basicStatistic = new BasicStatistic(myList);
        System.out.println("Max: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Mean: " + basicStatistic.mean());
        System.out.println("Variance: " + basicStatistic.variance());
    }
}