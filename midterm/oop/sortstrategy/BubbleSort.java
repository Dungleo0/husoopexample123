package midterm.oop.sortstrategy;

public class BubbleSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Bubble sort.
     * @param data
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */

            for (int i = 0; i < data.length - 1; i++) {
                for (int j = 0; j < data.length - i - 1; j++) {
                    if (data[j] > data[j + 1]) {
                        double temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;

                    }
                }
            }

    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        sort(data,true);
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Bubble sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        sort(data,false);
    }
}
