package DSA.week3.ex3;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (top == null && bot == null) {
            top = newNode;
            bot = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        n++;
    }

    public void addBot(T data) {
        Node newNode = new Node();
        newNode.data = data;
        if (top == null && bot == null) {
            bot = newNode;
            top = newNode;
        } else {
            bot.next = newNode;
            bot = newNode;
        }
        n++;
    }

    public T get(int i) {
        if (i < 0 || i >= n) {
            return null;
        }
        Node currentNode = top;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void set(int i, T data) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException("Out of index");
        }
        Node currentNode = top;
        for (int j = 0; j < i; j++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }

    public boolean isContain(T data) {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        Node currentNode = top;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public T removeTop() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        T data = top.data;
        top = top.next;
        if (top == null) {
            bot = null;
        }
        n--;
        return data;
    }

    public T removeBot() {
        if (isEmpty()) {
            throw new IllegalStateException("Empty");
        }
        T removedData = bot.data;
        if (top == bot) {
            top = null;
            bot = null;
            n--;
            return removedData;
        } else {
            Node current = top;
            while (current.next != bot) {
                current = current.next;
            }
            current.next = null;
            bot = current;
            n--;
            return removedData;
        }

    }

    public void printList() {
        Node currentNode = top;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        list.printList();
        list.addBot(20);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(1, 25);
        System.out.println("Element at index 1 after set: " + list.get(1));
        list.printList();

        System.out.println("Is 10 in the list? " + list.isContain(10));
        System.out.println("Is 100 in the list? " + list.isContain(100));
        list.printList();

        System.out.println("Size of the list: " + list.size());
        list.printList();

        System.out.println("Removed top element: " + list.removeTop());
        System.out.println("Size of the list after removeTop: " + list.size());
        list.printList();

        System.out.println("Removed bot element: " + list.removeBot());
        list.printList();

        System.out.println("Size of the list after removeBot: " + list.size());
        list.printList();

    }
}
