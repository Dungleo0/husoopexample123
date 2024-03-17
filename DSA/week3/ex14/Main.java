package DSA.week3.ex14;

public class Main {
    public static void main(String[] args) {

        DLinkedList list = new DLinkedList();
        System.out.println("List is empty: " + list.isEmpty());
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);

        list.addToTail(10);
        System.out.println(list.isEmpty());
        list.printDNode();

        System.out.println(list.search(5));

//        list.removeToHead();
//        list.printDNode();

//        list.removeToTail();
//        list.printDNode();

//        list.remove(2);
        list.removeNode(2);
        list.printDNode();
        list.insert(100,1);
        list.printDNode();
    }
}
