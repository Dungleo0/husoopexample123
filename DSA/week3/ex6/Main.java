package DSA.week3.ex6;

import mylist.MyArrayList;
//Thực hành các thao tác cơ bản, khởi tạo danh sách liên kết đơn, các thao tác chèn, xóa.
public class Main {
    public static void main(String[] args) {

        MyLinkedList list=new MyLinkedList();
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtHead(3);
        list.addAtHead(4);
        list.addAtHead(5);

        System.out.println("data Node in index is: "+list.get(0));

        list.printList();

        System.out.println("Size list Node is: "+list.size);

        list.addAtTail(100);

        list.printList();
        System.out.println("List after add in index:");
        list.addAtIndex(3,1000);

        list.printList();
        System.out.println("List after delete in index:");
        list.deleteAtIndex(3);
        list.printList();

    }
}
