package eci.sandbox.observer.introduction.services.implementations;

import eci.sandbox.observer.introduction.models.ObserverState;
import eci.sandbox.observer.introduction.services.interfaces.Observer;
import eci.sandbox.observer.introduction.services.interfaces.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ObserverImpl implements Observer {
    private ObserverState observerStatus;
    private String name;
    private Subject subject;
    @Override
    public void update() {
        // TODo something to check the status
    }
}
