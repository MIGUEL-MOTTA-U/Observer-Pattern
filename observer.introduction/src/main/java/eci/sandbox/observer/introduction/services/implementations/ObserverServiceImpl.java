package eci.sandbox.observer.introduction.services.implementations;

import eci.sandbox.observer.introduction.models.ObserversExceptions;
import eci.sandbox.observer.introduction.services.interfaces.ObserverService;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class ObserverServiceImpl implements ObserverService {
    private final HashMap<String, ObserverImpl> observers = new HashMap<>();


    @Override
    public HashMap<String, ObserverImpl> getAllObservers() {
        return observers;
    }

    @Override
    public ObserverImpl getObserverByName(String name) throws ObserversExceptions{
        ObserverImpl result = observers.get(name);
        if(result==null) throw new ObserversExceptions(ObserversExceptions.OBSERVER_NOT_FOUND);
        return result;
    }

    @Override
    public void createObserver(ObserverImpl observer) throws ObserversExceptions{
        if(observers.containsKey(observer.getName())) throw new ObserversExceptions(ObserversExceptions.OBSERVER_ALREADY_EXISTS);
        observers.put(observer.getName(), observer);
    }

    @Override
    public void deleteObserverByName(String name) throws ObserversExceptions{
        if(!observers.containsKey(name)) throw new ObserversExceptions(ObserversExceptions.OBSERVER_NOT_FOUND);
        observers.remove(name);
    }
}
