package LinkedList_yt;

public class MyLinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFist(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.value).append("\t");
            temp = temp.next;
        }
        return sb.toString();
    }
}
