package lab9.singletonpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query();

        Database bar = Database.getInstance();
        bar.query();
    }
}
