package eci.sandbox.observer.introduction.services.implementations;

import eci.sandbox.observer.introduction.services.interfaces.Observer;
import eci.sandbox.observer.introduction.services.interfaces.Subject;

import java.util.HashMap;

public class SubjectImpl extends Subject {

    public SubjectImpl(){
        this.observers = new HashMap<>();
    }

    @Override
    public void attach(ObserverImpl o) {
        observers.put(o.getName(), o);
    }

    @Override
    public void detach(ObserverImpl o) {
        observers.remove(o.getName());
    }

    @Override
    public void notifyObservers() {
        observers.forEach((s, observer) -> observer.update());
    }
}
