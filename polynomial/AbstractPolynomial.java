package polynomial;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO *
         */
        StringBuilder sb = new StringBuilder("[");
        sb.append(coefficient(0));
        for (int i = 1; i < coefficients().length; i++) {
            double coefficient = coefficient(i);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    sb.append(" - ");
                    coefficient = -coefficient;
                } else {
                    sb.append(" + ");
                }
                sb.append(coefficient);
                if (i == 1) {
                    sb.append("x");
                } else {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.append("]").toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        int n = coefficients().length;
        double[] derivative = new double[n - 1];
        for (int i = 1; i < n; i++) {
            derivative[i - 1] = i * coefficient(i);
        }
        return derivative;
    }
}
