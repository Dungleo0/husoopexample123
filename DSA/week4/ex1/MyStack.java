package DSA.week4.ex1;

import java.util.EmptyStackException;

public class MyStack<T> {
    Node head;
    int size;

    public MyStack() {
    }

    public Node push(char c) {
        Node node = new Node(c);
        if (isEmpty()) {
            return head = node;
        } else {
            node.next = head;
            return head = node;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public char pop() {
        char c = head.data;
        head = head.next;
        return c;
    }

    public char peek() {
        return head.data;
    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur + " ");
            cur = cur.next;
        }
    }
}
