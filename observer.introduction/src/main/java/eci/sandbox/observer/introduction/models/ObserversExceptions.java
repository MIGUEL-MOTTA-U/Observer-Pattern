package eci.sandbox.observer.introduction.models;

public class ObserversExceptions extends Exception{
    public static final String OBSERVER_NOT_FOUND = "The observer was not found!";
    public static final String OBSERVER_ALREADY_EXISTS = "The Observer already exists!";

    public ObserversExceptions(String message){
        super(message);
    }
}
