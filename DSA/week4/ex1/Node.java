package DSA.week4.ex1;

public class Node {
    Node next;
    char data;

    public Node(char data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "" + data;
    }
}
