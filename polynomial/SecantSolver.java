package polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double x0 = lower;
        double x1 = upper;
        double x2;

//        for (int i = 0; i < maxIterations; i++) {
//            double y0 = polynomial.evaluate(x0);
//            double y1 = polynomial.evaluate(x1);
//
//            if (Math.abs(y1 - y0) < tolerance) {
//                return x1; // Stop when the result is within the desired tolerance
//            }
//
//            x2 = x1 - y1 * (x1 - x0) / (y1 - y0); // Secant calculation
//
//            if (x2 < lower || x2 > upper) {
//                return Double.NaN; // The result is outside the specified range
//            }
//
//            x0 = x1;
//            x1 = x2;
//        }

        return 5;

    }
}
