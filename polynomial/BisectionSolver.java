package polynomial;

public class BisectionSolver implements RootSolver {
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /**
         * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
         * @param polynomial
         * @param lower
         * @param upper
         * @return
         */
        double a = lower;
        double b = upper;


//        while ((b - a) / 2 > 1e-6) {
//            double c = (a + b) / 2;
//            if (polynomial.evaluate(c) == 0) {
//                return c;
//            } else if (polynomial.evaluate(c) * polynomial.evaluate(a) < 0) {
//                b = c;
//            } else {
//                a = c;
//            }
//        }
        return (a + b) / 2;
    }
}

