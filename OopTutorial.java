import java.math.BigInteger;

public class OopTutorial {

    public static void main(String[] args) {
//        System.out.println(calculatorSin(1, 5));
//        System.out.println(calculateEx(5, 0.00000001));
//        System.out.println(calculatorCos(10, 0.0000000001));
//        System.out.println(Math.cos(10));

    }

    public static double calculatorSin(double radianx, int numterm) {
        double term = radianx;
        double result = 0.0;
        for (int i = 1; i <= numterm; i++) {
            result += term;
            term = term * -1.0 * (radianx * radianx) / (2 * i * (2 * i + 1));
        }
        return result;
    }

    public static double calculateEx(double x, double epsilon) {
        double term = 1.0;
        double result = term;
        int i = 1;

        while (Math.abs(term) > epsilon) {
            term = term * x / i;
            result += term;
            i++;
        }

        return result;
    }

    public static double calculatorCos(double radianX, double epsilon) {
        double term = 1.0;
        double result = term;
        int i = 1;

        while (Math.abs(term) > epsilon) {
            term = term * -1.0 * (radianX * radianX) / (2 * i * (2 * i - 1));
            result += term;
            i++;
        }

        return result;
    }

    public static double cos(double x) {
        double err = 1e-12;
        double cos = 1;
        double phanso = 1;
        int i = 2;
        while (Math.abs(phanso) > err) {
            phanso = -phanso * x * x / i / (i - 1);
            cos += phanso;
            i += 2;
        }
        return cos;
    }

    public static double exp(double x) {
        double err = 1e-12;
        double exp = 1;
        double phanso = 1;
        int i = 1;
        while (Math.abs(phanso) > err) {
            phanso = phanso * x / i;
            exp += phanso;
            i++;
        }
        return exp;
    }

    public static String decimalTo(String in, int outRadix) {
        BigInteger dec = new BigInteger(in);
        StringBuilder res = new StringBuilder();
        while (dec.compareTo(BigInteger.ZERO) > 0) {
            int tmp = Integer.parseInt(dec.mod(new BigInteger(outRadix + "")).toString());
            if (tmp < 10) {
                res.insert(0, tmp);
            } else {
                res.insert(0, (char) (tmp + 55));
            }
            dec = dec.divide(new BigInteger(outRadix + ""));
        }
        return res.toString();
    }

    public static String toDecimal(String in, int inRadix) {
        in = in.toUpperCase();
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            if (c >= '0' && c <= '9') {
                int d = c - '0';
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));

            } else if (c >= 'A' && c <= 'F') {
                int d = c - 'A' + 10;
                res = res.multiply(new BigInteger(inRadix + "")).add(new BigInteger(d + ""));
            }
        }
        return res + "";
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDecimal(in, inRadix);
        }
        if (inRadix == 10) {
            return decimalTo(in, outRadix);
        }
        String dec = toDecimal(in, inRadix);
        System.out.println(dec);
        return decimalTo(dec, outRadix);
    }
//    public String next() {

//        if (hasNext()) {
//            return items[position++];
//        }
//        return null;
//    }

//    public boolean hasNext() {
//        return position < items.length;
//    }

    public static double conversion(double [] poly,double x){
        double polyValue = 0.0;
        for (int i = 0; i < poly.length; i++) {
            polyValue = polyValue * x + poly[i];
        }
        return polyValue;
    }

}
