package lab9.adapterpattern.pseudocode;

public class Client {
    public static void main(String[] args) {


        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println(hole.fits(roundPeg));
        System.out.println();


        SquarePeg smallPeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

//        hole.fits(smallPeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println(hole.fits(smallSquarePegAdapter));
        System.out.println(hole.fits(largeSquarePegAdapter));

    }
}
