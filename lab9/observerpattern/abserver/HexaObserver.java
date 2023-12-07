package lab9.observerpattern.abserver;
public class HexaObserver extends Observer{

    protected Subject subject;
    public HexaObserver(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
    }
}
