package pl.sdacademy.designpatterns.observer.observer.util;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Chat extends Observable {
    @Getter private List<String> messages = new ArrayList<>();

    public void writeMessage(String message) {
        messages.add(message);
        setChanged();
        notifyObservers();
    }
}
