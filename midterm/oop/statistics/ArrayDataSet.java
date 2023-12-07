package midterm.oop.statistics;

import java.util.Arrays;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 16;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của tập dữ liệu.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     *
     * @param index
     * @return
     */
    @Override
    public double get(int index) {
        /* TODO */
        return data[index];
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     *
     * @param data
     * @param index
     */
    @Override
    public void set(double data, int index) {
        /* TODO */
        this.data[index] = data;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value là giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void append(double value) {
        /* TODO */
        if (size() == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = value;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     *
     * @param value
     * @param index
     */
    @Override
    public void insert(double value, int index) {
        /* TODO */
        if (index < 0 && index > size) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[index] = value;
        size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size - 1)]
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void allocateMore() {
        /* TODO */
        if (checkBoundaries(0, size - 1)) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     *
     * @return
     */
    @Override
    public double[] toArray() {
        /* TODO */
        double[] array = new double[size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = data[i];
        }
        return array;
    }
}
