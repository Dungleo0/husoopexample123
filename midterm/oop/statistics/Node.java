package midterm.oop.statistics;

public class Node {
    public double data;
    public Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
