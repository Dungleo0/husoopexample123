package DSA.week3.ex7;

public class CountElementLinkedList {

    Node head;

    int size;

    public CountElementLinkedList() {
        this.head = null;
        int size = 0;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
            size++;
        }
    }
// return size
    public int countElements() {
        int count = 0;
        if (head == null) {
            return count;
        } else {
            Node cur = head;
            while (cur != null) {
                cur = cur.next;
                count++;
            }
            return count;
        }
    }


    public void printList(){
        Node cur = head;
        while (cur != null) {
            System.out.print(cur+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
