package vector;

import java.util.*;
import java.util.stream.Stream;

public class BasicStatistics {
    private MyVector[] vectors;

    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Viết các hàm testArrayVector để test các chứ năng của array vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...
           - Viết các hàm testListVector để test các chứ năng của list vector, như thêm vào tọa độ, xóa bớt số trục tọa độ,
             sửa giá trị tọa độ, cộng các vector, nhân vector với giá trị vô hướng, nhân vô hướng 2 vector, ...

         II. Thực hiện thống kê đơn giản với các vector
           - Tạo ra ít nhất 10 vector và cho vào mảng vectors để quản lý. Trong đó có ít nhất 2 nhóm các vector
             có chuẩn bằng nhau.
           - Tìm và in ra thông tin chuẩn nhó nhất, chuẩn lớn nhất của các vector.
           - In ra các vector có chuẩn sắp xếp theo thứ tự tăng dần, giản dần.
           - In ra các vector có chuẩn nằm trong một đoạn [a, b] cho trước.
           - In ra rank của các vector theo thứ tự trong mảng vectors.

         III. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt) và nộp cùng source code.
         */
        testArrayVector();
        System.out.println("\n==============================\n");
        testListVector();
        System.out.println("\n==============================\n");
        doSimpleStatic();
//        MyArrayVector myVector = new MyArrayVector();
//        myVector.insert(10);
//        myVector.insert(10);
//        System.out.println(myVector);
    }

    public static void testArrayVector() {
        /* TODO */
        MyArrayVector myVector = new MyArrayVector();
        myVector.insert(10);
        myVector.remove(0);
        myVector.insert(4, 0);
        myVector.insert(3, 0);
        myVector.insert(5, 2);
        myVector.insert(0, 0);
        myVector.insert(1, 1);
        myVector.insert(2, 2);
        myVector.insert(6);
        myVector.insert(7);
        myVector.insert(8);
        myVector.insert(9);
        System.out.println(myVector);
        System.out.println("myVector add 1:\n" + myVector.add(1));
        System.out.println("myVector minus 2:\n" + myVector.minus(2));
        System.out.println("myVector scale -1:\n" + myVector.scale(-1));
        System.out.println("myVector pow 2:\n" + myVector.pow(2));
        System.out.println("Set 10 to index 1: ");
        myVector.set(10, 1);
        System.out.println(myVector);
        System.out.println("Set 10 to index 11: ");
        myVector.set(10, 11);
        System.out.println(myVector);
        System.out.println("Coordinate 2: " + myVector.coordinate(2));
        System.out.println("Coordinates: " + Arrays.toString(myVector.coordinates()));
        System.out.println("Norm: " + myVector.norm());

        MyArrayVector myArrayVector = new MyArrayVector();
        for (int i = 0; i < 9; i++) {
            myArrayVector.insert(i);
        }
        System.out.println("myArrayVector: " + myArrayVector);
        System.out.println("Sum of myVector and myArrayVector: ");
        System.out.println(myVector.add(myArrayVector));
        System.out.println("myArrayVector insert 9:" + myArrayVector.insert(9));
        System.out.println("Sum of myVector and myArrayVector: ");
        System.out.println(myVector.add(myArrayVector));
        System.out.println("myVector minus myArrayVector: ");
        System.out.println(myVector.minus(myArrayVector));
        System.out.println("myVector dot myArrayVector: ");
        System.out.println(myVector.dot(myArrayVector));
        System.out.println("extract [1, 4, 2] from myVector: " + myVector.extract(new int[]{1, 4, 2}));
    }

    public static void testListVector() {
        /* TODO */
        MyListVector myVector = new MyListVector();
        myVector.insert(10);
        myVector.remove(0);
        myVector.insert(4, 0);
        myVector.insert(3, 0);
        myVector.insert(5, 2);
        myVector.insert(0, 0);
        myVector.insert(1, 1);
        myVector.insert(2, 2);
        myVector.insert(6);
        myVector.insert(7);
        myVector.insert(8);
        myVector.insert(9);
        System.out.println(myVector);
        System.out.println("myVector add 1:\n" + myVector.add(1));
        System.out.println("myVector minus 2:\n" + myVector.minus(2));
        System.out.println("myVector scale -1:\n" + myVector.scale(-1));
        System.out.println("myVector pow 2:\n" + myVector.pow(2));
        System.out.println("Set 10 to index 1: ");
        myVector.set(10, 1);
        System.out.println(myVector);
        System.out.println("Set 10 to index 11: ");
        myVector.set(10, 11);
        System.out.println(myVector);
        System.out.println("Coordinate 2: " + myVector.coordinate(2));
        System.out.println("Coordinates: " + Arrays.toString(myVector.coordinates()));
        System.out.println("Norm: " + myVector.norm());

        MyListVector myListVector = new MyListVector();
        for (int i = 0; i < 9; i++) {
            myListVector.insert(i);
        }
        System.out.println("myListVector: " + myListVector);
        System.out.println("Sum of myVector and myListVector: ");
        System.out.println(myVector.add(myListVector));
        System.out.println("myListVector insert 9:" + myListVector.insert(9));
        System.out.println("Sum of myVector and myListVector: ");
        System.out.println(myVector.add(myListVector));
        System.out.println("myVector minus myListVector: ");
        System.out.println(myVector.minus(myListVector));
        System.out.println("myVector dot myListVector: ");
        System.out.println(myVector.dot(myListVector));
        System.out.println("extract [1, 4, 2] from myVector: " + myVector.extract(new int[]{1, 4, 2}));
    }

    public static void doSimpleStatic() {
        /* TODO */
        BasicStatistics basicStatistics = new BasicStatistics();
        basicStatistics.addRandomVectors(5, new Random());

        System.out.println("Vectors:");
        basicStatistics.printAllVectors(basicStatistics.vectors);

        System.out.println("\n=================================\n");
        System.out.println("normMax: " + basicStatistics.normMax());
        System.out.println("normMin: " + basicStatistics.normMin());

        System.out.println("\n=================================\n");
        System.out.println("sortNorm asc:");
        MyVector[] myVectors = basicStatistics.sortNorm(true);
        basicStatistics.printAllVectors(myVectors);
        System.out.println("\nsortNorm desc: ");
        myVectors = basicStatistics.sortNorm(false);
        basicStatistics.printAllVectors(myVectors);

        System.out.println("\n=================================\n");
        System.out.println("filter norm in [9, 11]");
        myVectors = basicStatistics.filter(9, 11);
        basicStatistics.printAllVectors(myVectors);

        System.out.println("\n=================================\n");
        System.out.println("rank");
        basicStatistics.printAllVectors(basicStatistics.vectors);
        System.out.println(Arrays.toString(basicStatistics.rank()));
    }

    private void printAllVectors(MyVector[] vectors) {
        for (MyVector myVector : vectors) {
            System.out.println(myVector + ", norm = " + myVector.norm());
        }
    }

    private void addRandomVectors(int numVectors, Random random) {
        vectors = new MyVector[numVectors * 2 + 2];
        for (int i = 0; i < numVectors; i++) {
            MyArrayVector myArrayVector = new MyArrayVector();
            MyListVector myListVector = new MyListVector();
            for (int j = 0; j < 5; j++) {
                myArrayVector.insert(randomNumber(random));
                myListVector.insert(randomNumber(random));
            }
            vectors[i * 2] = myArrayVector;
            vectors[i * 2 + 1] = myListVector;
        }
        MyArrayVector myArrayVector = new MyArrayVector();
        MyListVector myListVector = new MyListVector();
        for (int i = 0; i < 5; i++) {
            double value = randomNumber(random);
            myArrayVector.insert(value, 0);
            myListVector.insert(value);
        }
        vectors[numVectors * 2] = myArrayVector;
        vectors[numVectors * 2 + 1] = myListVector;
    }

    private double randomNumber(Random random) {
        double value = random.nextDouble(1, 10);
        return Math.round(value * 100) / 100.0;
    }

    /**
     * Lấy giá trị chuẩn lớn nhất trong các vector.
     *
     * @return chuẩn lớn nhất.
     */
    public double normMax() {
        /* TODO */
        if (vectors.length == 0) {
            return -1;
        }
        double normMax = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            double currentNorm = vectors[i].norm();
            if (normMax < currentNorm) {
                normMax = currentNorm;
            }
        }
        return normMax;
    }

    /**
     * Lấy giá trị chuẩn nhỏ nhất trong các vector.
     *
     * @return chuẩn nhỏ nhất.
     */
    public double normMin() {
        /* TODO */
        if (vectors.length == 0) {
            return -1;
        }
        double normMin = vectors[0].norm();
        for (int i = 1; i < vectors.length; i++) {
            double currentNorm = vectors[i].norm();
            if (normMin > currentNorm) {
                normMin = currentNorm;
            }
        }
        return normMin;
    }

    /**
     * Lấy ra mảng các vector được sắp xếp theo thứ tự của chuẩn.
     * Nếu order là true thì mảng đầu ra là các vector có chuẩn tăng dần.
     * Nếu order là false thì mảng đầu ra là các vector có chuẩn giảm dần.
     *
     * @return mảng các vector theo thứ tự mảng tăng dần.
     */
    public MyVector[] sortNorm(boolean order) {
        /* TODO */
        MyVector[] myVectors = Arrays.copyOf(vectors, vectors.length);
        Arrays.sort(myVectors, Comparator.comparingDouble(MyVector::norm));
        if (!order) {
            Collections.reverse(Arrays.asList(myVectors));
        }
        return myVectors;
    }

    /**
     * Lọc ra mảng các vector có chuẩn năm trong đoạn [from, to].
     *
     * @param from
     * @param to
     * @return các vector có chuẩn nằm trong đoạn [from, to]
     */
    public MyVector[] filter(int from, int to) {
        /* TODO */
//        return Arrays.stream(vectors).filter(myVector -> myVector.norm() <= to && myVector.norm() >= from).toArray(MyVector[]::new);
//        Stream<MyVector> stream = Arrays.stream(vectors).filter(myVector -> myVector.norm() <= to && myVector.norm() >= from);
//        return stream.toArray(MyVector[]::new);
//        int count = 0;
//        for (MyVector myVector : vectors) {
//            if (myVector.norm() >= from && myVector.norm() <= to) {
//                count++;
//            }
//        }
//        MyVector[] result = new MyVector[count];
//        int index = 0;
//        for (MyVector myVector : vectors) {
//            if (myVector.norm() >= from && myVector.norm() <= to) {
//                result[index++] = myVector;
//            }
//        }
//        return result;
        ArrayList<MyVector> result = new ArrayList<>();
        for (MyVector myVector : vectors) {
            if (myVector.norm() >= from && myVector.norm() <= to) {
                result.add(myVector);
            }
        }
        return result.toArray(MyVector[]::new);
    }

    /**
     * Lấy ra thông tin rank của các vector trong mảng theo chuẩn.
     * Rank được tính theo quy luật sau, ví dụ
     * - tập [3 1 4] có rank [2.0 1.0 3.0]
     * - tập [3 1 3 5] có các rank [2.5 1.0 4.0] (các phần tử có giá trị bằng nhau có rank
     * được tính bằng trung bình các chỉ số của các phần tử trong tập dữ liệu, chỉ sổ bắt
     * đầu là 1)
     *
     * @return
     */
    public double[] rank() {
        /* TODO */
        double[] ranks = new double[vectors.length];
        for (int i = 0; i < vectors.length; i++) {
            int r = 1, s = 1;

            for (int j = 0; j < vectors.length; j++) {
                if (j != i && vectors[j].norm() < vectors[i].norm())
                    r += 1;

                if (j != i && vectors[j].norm() == vectors[i].norm())
                    s += 1;
            }
            ranks[i] = r + (double) (s - 1) / (double) 2;
        }
        return ranks;
    }
}
