package observer_hus;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject(1);


        Observer observer1 = new ConcreteObserver1(subject);
        Observer observer2 = new ConcreteObserver2();

//        subject.registerObserver(observer1);
//        subject.registerObserver(observer2);


    }
}
