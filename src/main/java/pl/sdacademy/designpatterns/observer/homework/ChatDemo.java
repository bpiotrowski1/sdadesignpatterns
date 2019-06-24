package pl.sdacademy.designpatterns.observer.homework;

public class ChatDemo {
    public static void main(String[] args) {
        final Chat chat = new Chat();
        final User userA = new ConcreteChatUser(chat);
        final User userB = new ConcreteChatUser(chat);

        userA.write("Message 1");
        userB.write("Message 2");
    }
}
