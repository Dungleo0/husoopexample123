package observer_hus;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private int state;
    private List<Observer> observers;

    public Subject(int state) {
        this.state = state;
        observers = new LinkedList<>();
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void setState(int state) {
        this.state = state;
        stateChanged();
    }
    public void stateChanged() {
        notifyObservers();
    }
    private void notifyObservers( ){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
}
