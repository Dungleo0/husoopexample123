package midterm.oop.statistics;

import java.util.Random;

public class TestStatistics {
    public static void main(String[] args) {
        /* Yêu cầu:

        I. Hoàn thiện các file source code đã cho. Viết các chức năng test cho chương trình.
        Viết hàm test cho ArrayDataSet:
            1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [20 - 30]. Tạo ra tập dữ liệu kiểu ArrayDataSet gồm các phần tử
               là các số double được sinh ngẫu nhiên, và có số phần tử bằng số tự nhiên đã cho.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu. In ra các dữ liệu thống kê về tập dữ liệu
               (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         Viết hàm test cho LinkedListDataSet:
            1. Sinh ngẫu nhiên một số tự nhiên nằm trong đoạn [20 - 30]. Tạo ra tập dữ liệu kiểu ArrayDataSet gồm các phần tử
               là các số double được sinh ngẫu nhiên, và có số phần tử bằng số tự nhiên đã cho.
            2. In ra các dữ liệu thống kê về tập dữ liệu (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).
            3. Xóa một phần tử ở đầu tập dữ liệu và một phần tử ở cuối tập dữ liệu. In ra các dữ liệu thống kê về tập dữ liệu
               (tập dữ liệu, cỡ mẫu, max, min, kỳ vọng, phương sai, rank, median).

         II. Chạy các hàm test để test chương trình.
         Copy kết quả chạy chương trình và lưu vào file text có tên <TenSinhVien_MaSinhVien_Statistics>.txt
         (ví dụ, NguyenVanA_123456S_Statistics.txt).
         Nén các file source code và file text kết quả chạy chương trình theo định dạng .zip,
         đặt tên là <TenSinhVien_MaSinhVien_Statistics>.zip (ví dụ, NguyenVanA_123456_Statistics.zip) và nộp lên classroom.
         */
        testStatisticsUsingArrayDataSet();
        testStatisticsUsingLinkedListDataSet();
    }

    /**
     * Hàm test cho tập dữ liệu kiểu ArrayDataSet.
     */
    public static void testStatisticsUsingArrayDataSet() {
        /* TODO */
        System.out.println("ArrayDataSet");
        Random random = new Random();
        int numbers = random.nextInt(20, 30);
        ArrayDataSet array = new ArrayDataSet();
        System.out.println("Random number: " + numbers);
        for (int i = 0; i < numbers; i++) {
            array.append(random.nextDouble(1, 100));
        }
        System.out.println(array);

        BasicStatistics statistics = new BasicStatistics();
        statistics.setDataSet(array);

        System.out.println();

        System.out.println("max: " + statistics.max());
        System.out.println("min: " + statistics.min());
        System.out.println("mean: " + statistics.mean());
        System.out.println("median: " + statistics.median());
        System.out.println("rank: " + statistics.rank());
        System.out.println("variance: " + statistics.variance());
        System.out.println("size: " + statistics.size());

        array.remove(0);
        array.remove(numbers - 2);

        System.out.println("array after remove index 0 && index[size]\n");

        System.out.println(array);
        System.out.println("max: " + statistics.max());
        System.out.println("min: " + statistics.min());
        System.out.println("mean: " + statistics.mean());
        System.out.println("median: " + statistics.median());
        System.out.println("rank: " + statistics.rank());
        System.out.println("variance: " + statistics.variance());
        System.out.println("size: " + statistics.size());

        System.out.println();
    }

    /**
     * Hàm test cho tập dữ liệu kiểu LinkedListDataSet.
     */
    public static void testStatisticsUsingLinkedListDataSet() {
        /* TODO */
        System.out.println("LinkedListDataSet");
        LinkedListDataSet dataSet = new LinkedListDataSet();
        Random random = new Random();
        int numbers = random.nextInt(20, 30);
        for (int i = 0; i < numbers; i++) {
            dataSet.append(random.nextDouble(1, 100));
        }
        System.out.println(numbers + " numbers");
        System.out.println(dataSet);
        System.out.println("size: " + dataSet.size());

        System.out.println();

        BasicStatistics statistics = new BasicStatistics();
        statistics.setDataSet(dataSet);

        System.out.println("max: " + statistics.max());
        System.out.println("min: " + statistics.min());
        System.out.println("mean: " + statistics.mean());
        System.out.println("median: " + statistics.median());
        System.out.println("rank: " + statistics.rank());
        System.out.println("variance: " + statistics.variance());
        System.out.println("size: " + statistics.size());

        System.out.println();
    }
}
