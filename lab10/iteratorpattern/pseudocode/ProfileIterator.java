package lab10.iteratorpattern.pseudocode;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
    boolean hasMore();

}
