package DSA.week4.ex2;

import java.util.Iterator;

public class LinkedListStack<E> implements StackInterface<E> {
    class Node {
        E element;
        Node next;
    }

    private Node stack = null;

    @Override
    public void push(E element) {
        Node cur = new Node();
        cur.element = element;
        cur.next = stack;
        stack = cur;
    }

    @Override
    public E pop() {
        Node cur = stack;
        stack=stack.next;
        return cur.element;
    }

    @Override
    public boolean isEmpty() {

        return stack==null;
    }

    @Override
    public E top() {
        return stack.element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }
    private class StackIterator implements Iterator<E> {
        private Node current = stack;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements in the stack");
            }
            E element = current.element;
            current = current.next;
            return element;
        }
    }
}
