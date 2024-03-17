package DSA.week3.ex2;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        this.defaultSize = capacity;
        array = (T[]) new Object[defaultSize];
    }

    @Override
    public void add(T data) {
        if (n == array.length) {
            enlarge();
        }
        array[n++] = data;
    }

    @Override
    public T get(int i) {
        checkBoundaries(i,n);
        return array[i];

    }

    @Override
    public void set(int i, T data) {
        checkBoundaries(i, n);
        array[i] = data;
    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--n] = null;
                return;
            }
        }
    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n==0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private void enlarge() {
        int length = array.length * 2;
        T[] newArray = (T[]) new Object[length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
