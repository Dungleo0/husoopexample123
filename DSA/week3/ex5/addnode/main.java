package DSA.week3.ex5.addnode;

public class main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.addAtHead(0);
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtHead(4);
        list.addAtHead(5);

        System.out.println(list.get(0));

        list.printNode();
    }
}
