package DSA.week3.ex5.removenode;

import DSA.week3.ex5.addnode.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtHead(0);
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtHead(4);
        list.addAtHead(5);


        list.printNode();

        list.remove(4);
        System.out.println("----------");
        list.printNode();
    }
}
