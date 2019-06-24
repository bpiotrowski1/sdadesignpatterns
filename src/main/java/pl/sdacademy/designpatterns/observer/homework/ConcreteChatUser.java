package pl.sdacademy.designpatterns.observer.homework;

public class ConcreteChatUser extends User {

    public ConcreteChatUser(final Chat chat) {
        super(chat);
    }

    @Override
    public void update() {
        System.out.println(chat.getMessages());
    }

    @Override
    public void write(final String message) {
        chat.writeMessage(message);
    }
}
