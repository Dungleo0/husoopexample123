package hus.oop.fraction;

public class Fraction implements FractionComparable {
    private int numerator;
    private int denominator;

    /**
     * Hàm dựng khởi tạo giá trị mặc định là 1/1.
     */
    public Fraction() {
        /* TODO */
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Hàm dựng khởi tạo giá trị cho tử số và mẫu số.
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        /* TODO */
        this.denominator = denominator;
        this.numerator = numerator;
    }

    /**
     * Hàm dựng copy, copy giá trị của phân số truyền vào.
     *
     * @param copyFraction
     */
    public Fraction(Fraction copyFraction) {
        /* TODO */
        this(copyFraction.numerator, copyFraction.denominator);
    }

    public int getNumerator() {
        /* TODO */
        return numerator;
    }

    public void setNumerator(int numerator) {
        /* TODO */
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        /* TODO */
        return denominator;
    }

    public void setDenominator(int denominator) {
        /* TODO */
        this.denominator = denominator;
        simplify();
    }

    /**
     * Phương thức trả về giá trị kiểu byte của phân số.
     *
     * @return
     */
    public byte byteValue() {
        /* TODO */
        return (byte) ((byte) numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu int của phân số.
     *
     * @return
     */
    public int intValue() {
        /* TODO */
        return numerator / denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu long của phân số.
     *
     * @return
     */
    public long longValue() {
        /* TODO */
        return (long) numerator / denominator;
    }

    /**
     * Phương thức trả về giá trị kiểu short của phân số.
     *
     * @return
     */
    public short shortValue() {
        /* TODO */
        return (short) ((short) numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu double của phân số.
     *
     * @return
     */
    public double doubleValue() {
        /* TODO */
        return ((double) numerator / denominator);
    }

    /**
     * Phương thức trả về giá trị kiểu float của phân số.
     *
     * @return
     */
    public float floatValue() {
        /* TODO */
        return ((float) numerator / denominator);
    }

    /**
     * Phương thức tính ước số chung lớn nhất của tử số và mẫu số.
     *
     * @return ước số chung lớn nhất của tử số và mẫu số.
     */
    public int gcd() {
        /* TODO */
        this.numerator = Math.abs(numerator);
        while (this.denominator != 0) {
            int tmp = this.numerator % denominator;
            numerator = denominator;
            denominator = tmp;
        }
        return numerator;
    }

    /**
     * Phương thức rút gọn phân số về phân số tối giản.
     */
    public void simplify() {
        /* TODO */
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int fractionGcd = gcd();
        numerator /= fractionGcd;
        denominator /= fractionGcd;
    }

    @Override
    public int compareTo(Fraction another) {
        /* TODO */
        int d = denominator / gcd() * denominator;
        return Integer.compare(d / denominator * numerator, d / denominator * numerator);

    }

    /**
     * Phương thức mô tả phân số theo định dạng numerator/denominator;
     *
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        return numerator + "/" + denominator;
    }
}
