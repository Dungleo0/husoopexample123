package midterm.oop.sortstrategy;

public class SelectionSort implements Sorter {
    /**
     * Phương thức sắp xếp dữ liệu sử dụng thuật toán Selection sort.
     * @param data
     */
    @Override
    public void sort(double[] data, boolean order) {
        /* TODO */
        int n = data.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (data[j] < data[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            double temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự tăng dần,
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortAscending(double[] data) {
        /* TODO */
        sort(data,true);
    }

    /**
     * Phương thức sắp xếp mảng dữ liệu theo thứ tự giảm dần,
     * sử dụng thuật toán Selection sort.
     * @param data
     */
    private void sortDescending(double[] data) {
        /* TODO */
        sort(data,false);
    }
}
