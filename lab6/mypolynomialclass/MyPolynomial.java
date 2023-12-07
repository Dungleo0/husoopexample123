package lab6.mypolynomialclass;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }
    public double[] getCoeffs() {
        return coeffs;
    }

    @Override
    public String toString() {
        StringBuffer builder = new StringBuffer();
        for (int i = coeffs.length-1; i >= 0 ; i--) {
            builder.append(coeffs[i] + (i!= 0 ? "*x^"+i+"+":""));
        }
        return builder.toString();
    }
    public double evaluate(double x){
        double sum  = 0.0;
        double item = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            item *= (i == 0 ? 1.0 : x);
            sum  += item * coeffs[i] ;
        }
        return sum;
    }
    public MyPolynomial add(MyPolynomial right){
        MyPolynomial result = this;
        if (result.getDegree() < right.getDegree()) {
            result  = right;
            right = this;
        }

        double[] resultCoeffs  = result.getCoeffs();
        double[] anotherCoeffs = right.getCoeffs();
        for (int i = 0; i < resultCoeffs.length; i++)
        {
            if (i > anotherCoeffs.length-1) {
                continue;
            }
            resultCoeffs[i] += anotherCoeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right)
    {
        double[] resultCoeffs  = new double[this.getDegree() + right.getDegree()+1];
        double[] anotherCoeffs = right.getCoeffs();
        for (int i =0; i < resultCoeffs.length; i++)
        {
            double tmp = 0.0;
            for (int j = 0; j <= i; j++)
            {
                if (j > coeffs.length-1) {
                    continue;
                }
                if (i-j > anotherCoeffs.length-1) {
                    continue;
                }
                tmp += coeffs[j] * anotherCoeffs[i-j];
            }
            resultCoeffs[i] = tmp;
        }
        return new MyPolynomial(resultCoeffs);
    }
}
