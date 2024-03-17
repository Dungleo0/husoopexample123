package DSA.week3.ex8;

import java.util.Random;
import java.util.Scanner;


// Phần tử thứ N từ cuối danh sách liên kết
public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);


        ElementFromLastList list = new ElementFromLastList();
//        list.append(node1);
//        list.append(node2);
//        list.append(node3);
//        list.append(node4);

        System.out.println("Phần tử thứ N từ cuối danh sách liên kết");
        int findNode = new Scanner(System.in).nextInt();
        for (int i = 0; i < 10; i++) {
            list.append(new Node(new Random().nextInt(0,10)));
        }
        System.out.println("element is: "+list.elementNode(findNode));
        System.out.println("==================");
        System.out.println("List data Node is: ");
        list.printList();
    }
}
