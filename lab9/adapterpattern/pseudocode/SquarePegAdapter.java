package lab9.adapterpattern.pseudocode;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }

    public int getRadius() {
        return (int) (this.peg.getWidth() * Math.sqrt(2) / 2);
    }

}