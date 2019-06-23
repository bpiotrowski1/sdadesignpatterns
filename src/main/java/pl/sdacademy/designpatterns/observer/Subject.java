package pl.sdacademy.designpatterns.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    @Getter private int value = 0;

    public void subscribe(final Observer observer) {
        observers.add(observer);
    }

    public void changeValueBy(int changed) {
        value += changed;
        observers.forEach(Observer::update);
    }
}
