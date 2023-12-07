package lab9.observerpattern.abserver;


public class OctalObserver extends Observer{
    protected Subject subject;
    public OctalObserver(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {

    }
}
