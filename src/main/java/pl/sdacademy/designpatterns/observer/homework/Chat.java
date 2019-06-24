package pl.sdacademy.designpatterns.observer.homework;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Chat {

    @Getter private List<String> messages = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void subscribe(User user) {
        users.add(user);
    }

    public void writeMessage(String message) {
        messages.add(message);
        users.forEach(User::update);
    }
}
