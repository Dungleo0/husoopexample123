package lab8.excerciselist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, Integer.valueOf(value));
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(Integer.valueOf(value));
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    public static List<Integer> generateSquare() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) * list.get(i) + " ");
        }
        return list;
    }

    public static boolean contains(List<Integer> list, int value) {
        return list.contains(Integer.valueOf(value));
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        for (Integer x : source) {
            target.add(x);
        }
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        insertFirst(list, 1);
        System.out.println(list);
        insertLast(list, 2);
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        replace(list, 3);
        System.out.println(list);
        removeThird(list);
        System.out.println(list);
        removeEvil(list);
        System.out.println(list);
        generateSquare();
        System.out.println();
        System.out.println(contains(list, 10));
        List<Integer> newList = new ArrayList<>();
        copy(list, newList);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
        reverseManual(list);
        System.out.println();
        System.out.println(list);
        insertBeginningEnd(new LinkedList<>(), 4);
        System.out.println(list);
    }
}
