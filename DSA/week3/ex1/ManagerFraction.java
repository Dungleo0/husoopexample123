package DSA.week3.ex1;

import java.util.ArrayList;
import java.util.List;

public class ManagerFraction {

    private Fraction fraction;

    private List<Fraction> list;

    public ManagerFraction() {
        list = new ArrayList<Fraction>();
    }

    public Fraction getFraction() {
        return this.fraction.getFraction();
    }

    public void append(Fraction fraction) {
        list.add(fraction);
    }

    public Fraction getFractionIndex(int index) {
        return list.get(index);
    }

    public Fraction add() {
        Fraction f = new Fraction(0, 1);

        for (int i = 0; i < list.size(); i++) {
            f = f.add(getFractionIndex(i));
        }
        return Fraction.normalize(f);
    }

    public Fraction minus() {
        Fraction f = new Fraction(0, 1);

        f = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            f = f.minus(list.get(i));
        }
        return Fraction.normalize(f);
    }

    public Fraction divi() {
        Fraction f = new Fraction(1, 1);
        f = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            f = f.divi(list.get(i));
        }
        return Fraction.normalize(f);
    }

    public Fraction multi() {
        Fraction f = new Fraction(1, 1);

        for (int i = 0; i < list.size(); i++) {
            f = f.multi(list.get(i));
        }
        return Fraction.normalize(f);
    }

    public Fraction media() {
        Fraction temp = new Fraction(list.size(),1);
        return Fraction.normalize(add().divi(temp));
    }
}
