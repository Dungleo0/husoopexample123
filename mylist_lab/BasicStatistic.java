package mylist_lab;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     *
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Double) {
                double number = (double) o;
                if (max < number) {
                    max = number;
                }
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     *
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Double) {
                double number = (double) o;
                if (min > number) {
                    min = number;
                }
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     *
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double result = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Double) {
                result += (double) o;
            }
        }
        return result / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     *
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()) {
            Object current = iterator.next();
            if (current instanceof Double) {
                double number = (double) current;
                sum += Math.pow(number - mean, 2);
            }
        }
        return sum / data.size();
    }
}
