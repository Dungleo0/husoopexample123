package lab10.iteratorpattern.iteratortouml;

public class ProductIterator implements Iterator {

    private int number = 10;


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return new StringBuilder("End");
    }
}
