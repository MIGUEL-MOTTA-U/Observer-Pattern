package eci.sandbox.observer.introduction.controller;

import eci.sandbox.observer.introduction.services.implementations.ObserverImpl;
import eci.sandbox.observer.introduction.models.ObserversExceptions;
import eci.sandbox.observer.introduction.services.interfaces.Observer;
import eci.sandbox.observer.introduction.services.interfaces.ObserverService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class Controller{
    private final ObserverService observerService;

    @GetMapping("/observer")
    @ResponseStatus(HttpStatus.OK)
    public Observer getObserver(@RequestParam String name) throws ObserversExceptions {
        return observerService.getObserverByName(name);
    }

    @PostMapping("/observer")
    @ResponseStatus(HttpStatus.CREATED)
    public String postObserver(@RequestBody ObserverImpl observer) throws ObserversExceptions{
        observerService.createObserver(observer);
        return "Observer Created";
    }

    @GetMapping("/observers")
    @ResponseStatus(HttpStatus.OK)
    public HashMap<String, ObserverImpl> getObservers() throws ObserversExceptions{
        return observerService.getAllObservers();
    }




}