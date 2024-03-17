package DSA.week3.ex10;

public class NodeList {
    Node head;

    public void printList(Node head) {
        if (head != null) {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur + " ");
                cur = cur.next;
            }
        }
    }

    public Node reverseNodeList(Node head) {
        Node cur = head;
        while (cur != null && cur.next != null) {
            Node next = cur.next;
            cur.next = next.next;
            next.next = head;
            head = next;
        }
        return head;
    }
}
