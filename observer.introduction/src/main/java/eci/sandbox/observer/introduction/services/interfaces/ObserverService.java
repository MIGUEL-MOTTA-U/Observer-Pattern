package eci.sandbox.observer.introduction.services.interfaces;

import eci.sandbox.observer.introduction.services.implementations.ObserverImpl;
import eci.sandbox.observer.introduction.models.ObserversExceptions;

import java.util.HashMap;

public interface ObserverService {
    HashMap<String, ObserverImpl> getAllObservers() throws ObserversExceptions;
    ObserverImpl getObserverByName(String name) throws ObserversExceptions;
    void createObserver(ObserverImpl observer) throws ObserversExceptions;
    void deleteObserverByName(String name) throws ObserversExceptions;
}
