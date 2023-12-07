package observer_hus;

public class ConcreteObserver2 extends Observer{

    @Override
    public void update(int data) {

    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver2 update");
    }
}
