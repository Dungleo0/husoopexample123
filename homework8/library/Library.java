package homework8.library;

public class Library {
    private Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        return this.rents[rents.length - 1];
    }
}
