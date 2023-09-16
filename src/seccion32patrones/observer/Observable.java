package seccion32patrones.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObversers() {
        notifyObversers(null);
    }

    public void notifyObversers(Object obj) {
        for (Observer obs : this.observers) {
            obs.update(this, obj);
        }
    }
}
