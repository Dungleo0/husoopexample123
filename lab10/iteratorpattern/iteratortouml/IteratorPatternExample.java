package lab10.iteratorpattern.iteratortouml;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductIterator iterator = new ProductIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Done");
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

    }
}
