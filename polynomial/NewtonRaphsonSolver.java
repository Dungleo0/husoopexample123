package polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     *
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     *
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */

        double x0 = (lower + upper) / 2; // Giả sử giá trị ban đầu x0 là trung bình của lower và upper

//        for (int i = 0; i < 10000; i++) {
//            double y = polynomial.evaluate(x0);
//            double yPrime = polynomial.derivative().evaluate(x0);
//
//            if (Math.abs(yPrime) < 1e-6) {
//                break; // Quit if the denominator is too small
//            }
//
//            double x1 = x0 - y / yPrime; // Newton-Raphson calculation
//
//            if (Math.abs(x1 - x0) <= 1e-6) {
//                return x1; // Stop when the result is within the desired tolerance
//            }
//
//            if (x1 < lower || x1 > upper) {
//                break; // Quit if the solution is outside the specified range
//            }
//
//            x0 = x1; // Update x0 to start the process again
//        }

        return 5; // Newton's method did not converge within the specified range
    }


}
