package lab6.mypolynomialclass;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1,2.2,3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1,2.2,3.3,4.4,5.5);

        double[] coeffs = {1.2,3.4,5.6,7.8};
        MyPolynomial polynomial3 = new MyPolynomial(coeffs);
        System.out.println(polynomial1);
        System.out.println();

        System.out.println(polynomial2);
        System.out.println();

        System.out.println(polynomial3);
        System.out.println();

        MyPolynomial polynomial5 = new MyPolynomial(5,4,3);
        System.out.println(polynomial5.evaluate(2));
        System.out.println(polynomial5.add(polynomial1));
        System.out.println(polynomial5.multiply(polynomial1));

    }
}
