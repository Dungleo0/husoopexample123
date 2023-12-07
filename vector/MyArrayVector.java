package vector;

import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 1;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            return data[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return Arrays.copyOf(data, size());
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            data[index] = value;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }

    /**
     * Cộng các giá trị tọa độ với value.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            data[i] += value;
        }
        return this;
    }

    /**
     * Cộng vector khác vào vector hiện tại.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector add(MyArrayVector another) {
        /* TODO */
        try {
            checkVectorDimensions(another);
            for (int i = 0; i < size(); i++) {
                data[i] += another.coordinate(i);
            }
        } catch (VectorNotSameDimensionException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        return this;
    }

    /**
     * Trừ các giá trị tọa độ của vector cho value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        return add(-value);
    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return
     */
//    public MyArrayVector minus() {
//        /* TODO */
//        add()
//    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector minus(MyArrayVector another) {
        /* TODO */
        return add(another.scale(-1));
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public double dot(MyArrayVector another) {
        /* TODO */
        try {
            checkVectorDimensions(another);
            double result = 0;
            for (int i = 0; i < size(); i++) {
                result += coordinate(i) * another.coordinate(i);
            }
            return result;
        } catch (VectorNotSameDimensionException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /**
     * Các giá trị của vector được lấy mũ power.
     *
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            data[i] = Math.pow(data[i], power);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            data[i] *= value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     *
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += coordinate(i) * coordinate(i);
        }
        return Math.sqrt(sum);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */

        if (size() == data.length) {
            enlarge();
        }
        data[size++] = value;
//        data[size] = value;
//        size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        try {
            checkBoundaries(index, size() + 1);
            if (size() == data.length) {
                enlarge();
            }
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     *
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            for (int i = index; i < size() - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [10 20 30 40 50], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [20 10].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     *
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        try {
            MyArrayVector result = new MyArrayVector();
            for (int index : indices) {
                checkBoundaries(index - 1, size());
                result.insert(coordinate(index - 1));
            }
            return result;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            return null;
        }
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     *
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
        return this;
    }
}
