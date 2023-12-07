package lab9.observerpattern.abserver;

public class BinaryObserver extends Observer {

    protected Subject subject;
    public BinaryObserver(Subject subject) {
        this.subject = subject;

    }
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
