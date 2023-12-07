package vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            return data.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        double[] result = new double[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = coordinate(i);
        }
        return result;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            data.set(index, value);
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
    public MyListVector add(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            data.set(i, coordinate(i) + value);
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
    public MyListVector add(MyListVector another) {
        /* TODO */
        try {
            checkVectorDimensions(another);
            for (int i = 0; i < size(); i++) {
                set(coordinate(i) + another.coordinate(i), i);
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
    public MyListVector minus(double value) {
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
//    public MyListVector minus() {
//        /* TODO */
//    }

    /**
     * Trừ vector hiện tại với vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     *
     * @return vector hiện tại.
     */
    public MyListVector minus(MyListVector another) {
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
    public double dot(MyListVector another) {
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
    public MyListVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            set(Math.pow(coordinate(i), power), i);
        }
        return this;
    }

    /**
     * Các giá trị tọa độ của vector được nhân với value.
     *
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++) {
            set(coordinate(i) * value, i);
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
     *
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        /* TODO */
        data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     *
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        /* TODO */
        try {
            checkBoundaries(index, size() + 1);
            data.add(index, value);
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
    public MyListVector remove(int index) {
        /* TODO */
        try {
            checkBoundaries(index, size());
            data.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     *
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        /* TODO */
        try {
            MyListVector result = new MyListVector();
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
}
