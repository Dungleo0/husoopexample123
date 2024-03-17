package DSA.week3.ex14;

public class DLinkedList {

    Node head;
    Node tail;
    int size;

    public DLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addToHead(int data) {

        Node node = new Node(data);

        if (!isEmpty()) {
            node.next = this.head;
            this.head.prev = node;
            head = node;
        } else {
            head = tail = node;
        }
        size++;
    }

    public void addToTail(int data) {
        Node node = new Node(data);

        if (!isEmpty()) {
            this.tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            this.head = this.tail = node;
        }
        size++;
    }

    public void printDNode() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean search(int data) {
        Node temp = this.head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void removeToHead() {
        if (!isEmpty()) {
            if (this.head == this.tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
        size--;
    }

    public void removeToTail() {
        if (!isEmpty()) {
            if (this.head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
        size--;
    }

    public void remove(int data) {
        if (!isEmpty()) {
            if (head == tail && head.data == data) {
                head = tail = null;
            } else if (head.data == data) {
                removeToHead();
            } else {
                Node temp = head;

                while (temp != null && temp.data != data) {
                    temp = temp.next;
                }

                if (temp != null) {
                    if (temp == tail) removeToTail();
                    else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                }
            }
        }
        size--;
    }

    public void removeNode(int index) {
        Node cur = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        if (cur == head) {
            removeToHead();
        } else if (cur == tail) {
            removeToTail();
        } else {
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
        }
        size--;
    }

    public void insert(int data, int index) {

        Node cur = head;
        Node node = new Node(data);
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        if (index == 0) {
            addToHead(data);
        } else if (index == size - 1) {
            addToTail(data);
        } else {
            cur.prev.next = node;
            node.prev=cur.prev;
            node.next=cur;
            cur.prev=node;
        }
    }

}
