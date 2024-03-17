package DSA.week3.ex9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(3);
        Node node6 = new Node(2);
        Node node7 = new Node(4);

//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;
//        node6.next=node7;

        ListNode list = new ListNode();
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.append(node4);
        list.append(node5);
        list.append(node6);
        list.append(node7);

//        for (int i = 0; i < 10; i++) {
//            list.append(new Node(new Random().nextInt(0, 10)));
//        }
        System.out.println(ListNode.count(node1,4));;
        System.out.println("==================");
        System.out.println("List data Node is: ");
        list.printList();
    }
}
