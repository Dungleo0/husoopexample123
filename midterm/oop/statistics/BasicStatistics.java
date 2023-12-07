package midterm.oop.statistics;

import java.util.Arrays;

public class BasicStatistics implements Statistics {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistics() {
        /* TODO */
        dataSet = new ArrayDataSet();

    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        for (int i = 0; i < size(); i++) {
            if (max < dataSet.get(i)) {
                max = dataSet.get(i);
            }
        }
        return max;
    }

    @Override
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        for (int i = 0; i < size(); i++) {
            if (min > dataSet.get(i)) {
                min = dataSet.get(i);
            }
        }
        return min;
    }

    @Override
    public double mean() {
        /* TODO */
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += dataSet.get(i);
        }
        return sum / size();
    }

    @Override
    public double variance() {
        /* TODO */
        double mean = mean();
        double sum = 0;
        for (int i = 0; i < size(); i++) {
            sum += Math.pow(dataSet.get(i) - mean, 2);
        }
        return sum / (size() - 1);
    }

    @Override
    public AbstractDataSet rank() {
        /* TODO */
        return null;
    }

    @Override
    public double median() {
        /* TODO */
        double[] data = new double[size()];
        for (int i = 0; i < data.length; i++) {
            data[i] = dataSet.get(i);
        }
        Arrays.sort(data);
        return data[size() / 2];
    }
}
