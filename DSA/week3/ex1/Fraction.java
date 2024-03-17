package DSA.week3.ex1;

import java.time.zone.ZoneRulesException;

public class Fraction {
    private float numerator;
    private float denominator;

    public Fraction(float numerator, float denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction c) {
        if (this.denominator == c.denominator) {
            return new Fraction(c.numerator + this.numerator,c.denominator);
        }
        return new Fraction(this.numerator * c.denominator + c.numerator * this.denominator,
                this.denominator * c.denominator);
    }

    public Fraction minus(Fraction c) {
        float mauchung = this.denominator * c.denominator;

        float tu1 = this.numerator * c.denominator;
        float tu2 = c.numerator * this.denominator;

        float kq = tu1 - tu2;

        return new Fraction(kq, mauchung);
    }

    public Fraction multi(Fraction c) {
        float tu = this.numerator * c.numerator;
        float mau = this.denominator * c.denominator;
        return new Fraction(tu, mau);
    }

    public Fraction divi(Fraction c) {
        if(c.denominator == 0 || this.denominator ==0){
            throw new ZoneRulesException("Cannot divide");
        }
        return multi(new Fraction(c.denominator, c.numerator));
    }

    public static Fraction normalize(Fraction c) {
        int gcd = gcd((int) c.numerator, (int) c.denominator);
        c.numerator /= gcd;
        c.denominator /= gcd;

        return c;
    }

    public float getNumerator() {
        return numerator;
    }

    public float getDenominator() {
        return denominator;
    }

    public Fraction getFraction() {
        return normalize(new Fraction(numerator, denominator));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        if(Math.abs(this.numerator) / Math.abs(this.denominator) == 1){
            return ""+this.numerator;
        }else if(this.denominator < 0){
            return String.format("%.0f / %.0f", -this.getNumerator(), -this.getDenominator());

        }else
            return String.format("%.0f / %.0f", this.getNumerator(), this.getDenominator());
    }
}
