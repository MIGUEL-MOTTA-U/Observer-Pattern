package eci.sandbox.observer.introduction.services.interfaces;

import eci.sandbox.observer.introduction.services.implementations.ObserverImpl;
import java.util.HashMap;

public abstract class Subject {
    protected HashMap<String, ObserverImpl> observers;
    public abstract void attach(ObserverImpl o);
    public abstract void detach(ObserverImpl o);
    public abstract void notifyObservers();
}
