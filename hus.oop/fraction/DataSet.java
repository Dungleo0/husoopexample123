package hus.oop.fraction;

import java.util.Arrays;

public class DataSet {
    private static int DEFAULT_CAPACITY = 8;
    private Fraction[] data;
    private int length;

    /**
     * Hàm dựng khởi tạo mảng chứa các phân số có kích thước là DEFAULT_CAPACITY.
     */
    public DataSet() {
        this.data = new Fraction[DEFAULT_CAPACITY];
        int length = 0;
    }

    /**
     * Hàm dựng khởi tạo mảng chứa các phân số theo data.
     *
     * @param data
     */
    public DataSet(Fraction[] data) {
        this.data = data;
        int length = 0;
    }

    /**
     * Phương thức chèn phân số fraction vào vị trí index.
     * Nếu index nằm ngoài đoạn [0, length] thì không chèn được vào.
     * Nếu mảng hết chỗ để thêm dữ liệu, mở rộng kích thước mảng gấp đôi.
     *
     * @param fraction là một phân số.
     * @return true nếu chèn được số vào, false nếu không chèn được số vào.
     */
    public boolean insert(Fraction fraction, int index) {
        /* TODO */
        if (index < 0 || index > length) {
            return false;
        }

        if (length == data.length) {
            enlarge();
        }

        for (int i = length - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = fraction;

        length++;

        return true;
    }

    /**
     * Phương thức tạo ra một tập dữ liệu lưu các phân số tối giản của các phân số trong tập dữ liệu gốc.
     *
     * @return tập dữ liệu mới lưu các phân số tối giản của các phân số trong tập dữ liệu gốc.
     */
    public DataSet toSimplify() {
        /* TODO */
        DataSet simplifiedDataSet = new DataSet(data);

        return simplifiedDataSet;
    }

    /**
     * Phương thức thêm phân số fraction vào vị trí cuối cùng chưa có dứ liệu của mảng data.
     * Nếu mảng hết chỗ để thêm dữ liệu, mở rộng kích thước mảng gấp đôi.
     *
     * @param fraction
     * @return
     */
    public void append(Fraction fraction) {
        /* TODO */
        if (length == data.length) {
            enlarge();
        }
        insert(fraction, data.length);
    }

    /**
     * Sắp xếp mảng các phân số theo thứ tự có giá trị tăng dần.
     * Nếu hai phân số bằng nhau thì sắp xếp theo thứ tự có mẫu số tăng dần.
     *
     * @return mảng mới được sắp xếp theo thứ tự có giá trị tăng dần.
     */
    public Fraction[] sortIncreasing() {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].compareTo(data[j]) > 0 || (data[i].compareTo(data[j]) == 0 && data[i].getDenominator() > data[j].getDenominator())) {
                    Fraction temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return this.data;
    }

    /**
     * Sắp xếp mảng các phân số theo thứ tự có giá trị giảm dần.
     * Nếu hai phân số bằng nhau thì sắp xếp theo thứ tự có mẫu số giảm dần.
     *
     * @return mảng mới được sắp xếp theo thứ tự có giá trị giảm dần.
     */
    public Fraction[] sortDecreasing() {
        /* TODO */
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].compareTo(data[j]) < 0 || (data[i].compareTo(data[j]) == 0 && data[i].getDenominator() < data[j].getDenominator())) {
                    Fraction temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return this.data;
    }

    /**
     * Phương thức mở rộng kích thước mảng gấp đôi, bằng cách tạo ra mảng mới có kích thước
     * gấp đôi, sau đó copy dự liệu từ mảng cũ vào.
     */
    private void enlarge() {
        /* TODO */
        data = Arrays.copyOf(data, data.length * 2);
    }

    /**
     * Phương thức kiểm tra xem index có nằm trong khoảng [0, upperBound] hay không.
     *
     * @param index
     * @param upperBound
     * @return true nếu index nằm trong khoảng [0, upperBound], false nếu ngược lại.
     */
    private boolean checkBoundaries(int index, int upperBound) {
        /* TODO */
        if (index < 0 || data.length > upperBound) {
            return false;
        }
        return true;
    }

    /**
     * In ra tập dữ liệu theo định dạng [a1, a2, ... , an].
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder("[" + data[0]);
        for (int i = 1; i < data.length; i++) {
            sb.append(",`").append(data[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * In ra mảng các phân số fractions theo định dạng [a1, a2, ... , an].
     *
     * @param fractions
     */
    public static void printFractions(Fraction[] fractions) {
        /* TODO */
        System.out.println(Arrays.toString(fractions));
    }
}
