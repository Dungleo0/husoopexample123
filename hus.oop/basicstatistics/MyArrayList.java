package hus.oop.basicstatistics;

import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 8;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        /* TODO */
        data = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (size == data.length) {
            enlarge();
        }
        data[size++] = payload;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (index < 0 || index > size) {
            System.out.println("Can't insert payload at index " + index + "!");
            return;
        }
        if (size == data.length) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = payload;
        size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyArrayListIterator();
    }

    /**
     * Cấp phát gấp đôi chỗ cho danh sách khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
    }

    private class MyArrayListIterator implements MyIterator {
        /*
         * MyArrayListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của MyArrayList.
         */
        private int currentPosition;

        /**
         * Khởi tạo dữ liệu cho Iterator vị trí đầu tiên của danh sách.
         *
         * @param
         */
        public MyArrayListIterator() {
            /* TODO */
            currentPosition = 0;
        }

        /**
         * Kiểm tra trong MyArrayList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return currentPosition < data.length && data[currentPosition] != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyArrayList và trả ra phần tử hiện tại của MyArrayList.
         *
         * @return phần tử hiện tại.
         */
        @Override
        public Object next() {
            /* TODO */
            if (hasNext()) {
                return data[currentPosition++];
            }
            return null;
        }

        /**
         * Iterator xóa phần tử hiện tại của MyArrayList.
         */
        @Override
        public void remove() {
            /* TODO */
            currentPosition--;
        }
    }
}
