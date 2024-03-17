package DSA.week4.ex2;

import java.util.Iterator;

public class ArrayStack implements StackInterface {

    private Object[] stack;
    private int top = 0;
    private final static int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        stack = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(Object element) {
        if (top == stack.length) {
            enlarge();
        }
        stack[top++] = element;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Stack underflow");
        }
        Object data = stack[--top];
        stack[top] = null; // Clear the reference
        return data;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    public void enlarge() {
        int newSize = stack.length * 2;
        Object[] newArray = new Object[newSize];
        System.arraycopy(stack, 0, newArray, 0, stack.length);
        stack = newArray; // Update the stack reference
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top - 1];
    }

    @Override
    public Iterator iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Object> {
        private int currentIndex = top - 1;

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements in the stack");
            }
            return stack[currentIndex--];
        }
    }
}
