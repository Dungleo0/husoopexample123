package DSA.week3.ex5.removenode;

public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        this.head = null;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void remove(int index) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else if (index == size - 1) {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
        size--;
    }

    public void printNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
