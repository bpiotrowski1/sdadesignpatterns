package pl.sdacademy.designpatterns.observer.observer.util;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private Chat chat;

    public User(final Chat chat) {
        this.chat = chat;
    }

    @Override
    public void update(final Observable o, final Object arg) {
        if(chat == o) {
            System.out.print(chat.getMessages());
        }
    }

    public void write(String message) {
        chat.writeMessage(message);
    }
}
