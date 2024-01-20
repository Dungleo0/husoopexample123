package polynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        /* TODO
         * - Chạy demo các hàm test.
         */
        testArrayPolynomial();
        testListPolynomial();
        testRootSolver();
    }

    public static void testArrayPolynomial() {
        /* TODO

           - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
             sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
             giá trị của x).
         */
        ArrayPolynomial poly1 = new ArrayPolynomial();
        poly1.append(1);


        poly1.insert(10, 0);

        poly1.set(100, 0);
        System.out.println("ArrayPolynomial");
        System.out.println("poly1: " + poly1);

        ArrayPolynomial poly2 = new ArrayPolynomial();
        poly2.append(1);
        poly2.append(2);
        poly2.append(3);
        poly2.append(4);

        System.out.println("poly2: " + poly2);
        System.out.println("plus: " + poly1.plus(poly2) + "\n");

        System.out.println("poly1: " + poly1);
        System.out.println("poly2: " + poly2 + "\n");

        System.out.println("multiply: " + poly1.multiply(poly2) + "\n");

        System.out.println("poly1: " + poly1);
        System.out.println("poly2: " + poly2 + "\n");

        System.out.println("minus: " + poly1.minus(poly2) + "\n");

        System.out.println("poly1: " + poly1);
        System.out.println("poly2: " + poly2 + "\n");
        System.out.println("evaluate poly1 x= 100 is: " + poly1.evaluate(100) + "\n");
    }

    public static void testListPolynomial() {
        /* TODO

           - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
             sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
             giá trị của x).
         */
        ListPolynomial listPolynomial1 = new ListPolynomial();
        listPolynomial1.append(1);
        listPolynomial1.append(2);
        listPolynomial1.append(2);


        System.out.println(listPolynomial1 + "\n");

        ListPolynomial listPolynomial2 = new ListPolynomial();
        listPolynomial2.append(1);
        listPolynomial2.append(2);
        listPolynomial2.append(3);

        System.out.println("ListPolynomial");
        System.out.println(listPolynomial1);
        System.out.println(listPolynomial2);
        System.out.println("plus: " + listPolynomial1.plus(listPolynomial2) + "\n");

        System.out.println("poly1: " + listPolynomial1);
        System.out.println("poly2: " + listPolynomial2 + "\n");

        System.out.println("multiply: " + listPolynomial1.multiply(listPolynomial2) + "\n");

        System.out.println("poly1: " + listPolynomial1);
        System.out.println("poly2: " + listPolynomial2 + "\n");

        System.out.println("minus: " + listPolynomial1.minus(listPolynomial2) + "\n");

        System.out.println("poly1: " + listPolynomial1);
        System.out.println("poly2: " + listPolynomial2 + "\n");
        System.out.println("evaluate poly1 x= 100 is: " + listPolynomial1.evaluate(100) + "\n");

    }

    public static void testRootSolver() {
        /* TODO

           - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
           - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
             PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
           - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */
        // Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
        int a = 0;
        int b = 10;
        double root = 3;
        double coefficient = 1;
        double constant = 2;
        Polynomial poly = new ListPolynomial();
        double tolerance = 1e-10;

        RootSolver bisection = new BisectionSolver(tolerance,b);
        double x = bisection.solve(poly, a, b);
        System.out.println("Bisection");
        System.out.println("Nghiệm: " + x);

        RootSolver newtonRaphson = new NewtonRaphsonSolver(tolerance,b);
        x = newtonRaphson.solve(poly, a, b);
        System.out.println("Newton-Raphson");
        System.out.println("Nghiệm: " + x);


        RootSolver secant = new SecantSolver(tolerance,b);
        x = secant.solve(poly, a, b);
        System.out.println("Secant");
        System.out.println("Nghiệm: " + x);
    }

}
