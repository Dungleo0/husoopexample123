package DSA.week3.ex8;

public class ElementFromLastList {
    Node head;
    int size;

    public ElementFromLastList() {
        this.head = null;
        size = 0;
    }

    public void append(Node node) {
        Node cur = head;
        if (head == null) {
            head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        size++;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur + " ");
            cur = cur.next;
        }
    }

    public Node elementNode(int index) {
        if (index <= 0 || index > size) {
            System.out.println("index out of range".toUpperCase());
            throw new IllegalArgumentException("index out of range");
        } else {
            Node cur = head;

            for (int i = 0; i < size - index; i++) {
                cur = cur.next;
            }
            return cur;
        }
    }
}
