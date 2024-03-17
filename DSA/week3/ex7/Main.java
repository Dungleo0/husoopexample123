package DSA.week3.ex7;

public class Main {

    public static void main(String[] args) {

        CountElementLinkedList list = new CountElementLinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.printList();
        System.out.println(list.countElements());

        System.out.println(list.size);

        list.append(100);

        list.printList();
        System.out.println(list.size);
        System.out.println(list.countElements());
    }
}
