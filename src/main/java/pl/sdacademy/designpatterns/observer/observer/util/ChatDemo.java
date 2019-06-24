package pl.sdacademy.designpatterns.observer.observer.util;

public class ChatDemo {
    public static void main(String[] args) {
        Chat chat = new Chat();
        User userA = new User(chat);
        User userB = new User(chat);

        chat.addObserver(userA);
        chat.addObserver(userB);

        userA.write("Message from userA");
        userB.write("Message from userB");
    }
}
