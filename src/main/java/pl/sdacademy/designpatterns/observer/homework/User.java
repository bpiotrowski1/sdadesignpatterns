package pl.sdacademy.designpatterns.observer.homework;

public abstract class User {

    Chat chat;

    User(final Chat chat) {
        this.chat = chat;
        chat.subscribe(this);
    }

    public abstract void update();
    public abstract void write(String message);
}
