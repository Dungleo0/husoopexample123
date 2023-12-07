package lab10.iteratorpattern.iteratortouml;

public class ProductCatalog implements Iterable{
    private String [] productCatalog = new String[] {""};
    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

}
