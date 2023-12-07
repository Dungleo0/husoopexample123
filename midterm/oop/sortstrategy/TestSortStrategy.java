package midterm.oop.sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class TestSortStrategy {
    public static void main(String[] args) {
        /* Yêu cầu:
        - Sinh ra ngẫu nhiên một số tự nhiên có giá trị nằm trong khoảng [20 - 30].
        - Sinh ra ngẫu nhiên một mảng các số kiểu double, có kích thước bằng số tự nhiên đã sinh ngẫu nhiên ở trên.
        - Copy dữ liệu mảng trên sang 2 mảng khác để có 3 mảng có dữ liệu giống nhau.
        - Tạo đối tượng có kiểu dữ liệu SortStrategy. Dùng đối tượng này test 3 thuật toán đã cho với 3 mảng dữ liệu trên.
          Các kết quả test được in ra terminal theo định dạng: ví dụ
          Using Bubble Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]

          Using Insertion Sort Algorithm:
          Before sorting: [5.0 4.0 3.0 2.0 1.0]
          After sorting: [1.0 2.0 3.0 4.0 5.0]

        - Kết quả chạy chương trình lưu vào file text được đặt tên <TenSinhVien_MaSinhVien_SortStrategy.txt.
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
          nộp lên classroom
         */
        Random random = new Random();
        int n = random.nextInt(20, 30);
        double[] data1 = new double[n];
        for (int i = 0; i < data1.length; i++) {
            data1[i] = random.nextDouble(0, n);
        }

        double[] arrayCopy1 = Arrays.copyOf(data1, data1.length);
        double[] arrayCopy2 = Arrays.copyOf(data1, data1.length);

        SortStrategy sortStrategy = SortStrategy.getInstance();
        sortStrategy.setSortee(new InsertionSort());
        System.out.println("Using InsertionSort Algorithm");
        System.out.println("Before sorting:"+Arrays.toString(data1));
        sortStrategy.sort(data1,true);
        System.out.println("After sorting:" + Arrays.toString(data1) + "\n");


        sortStrategy.setSortee(new BubbleSort());
        System.out.println("Using Bubble Sort Algorithm");
        System.out.println("Before sorting:"+Arrays.toString(arrayCopy1));
        sortStrategy.sort(arrayCopy1,true);
        System.out.println("After sorting:" + Arrays.toString(arrayCopy1) + "\n");

        sortStrategy.setSortee(new SelectionSort());
        System.out.println("Using SelectionSort Algorithm");
        System.out.println("Before sorting:"+Arrays.toString(arrayCopy2));

        sortStrategy.sort(arrayCopy2,true);
        System.out.println("After sorting:" + Arrays.toString(arrayCopy2) + "\n");


    }
}
