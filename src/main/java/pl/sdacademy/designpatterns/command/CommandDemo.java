package pl.sdacademy.designpatterns.command;

public class CommandDemo {
    public static void main(String[] args) {
        final UserRepository userRepository = new UserRepository();
        final UserData userA = new UserData.UserDataBuilder().email("asd@gmail.com").name("Andrzej").build();
        final UserData userB = new UserData.UserDataBuilder().email("asd@gmail.com").name("Jan").build();

        final ICommandBase commandA = new UserRegistrationCommad(userRepository, userA);
        final ICommandBase commandB = new UserRegistrationCommad(userRepository, userB);

        commandA.execute();
        commandA.execute();
        commandA.undo();
        commandA.execute();
        commandA.undo();
        commandB.execute();
        commandA.execute();

        userRepository.getUsers().forEach(user -> System.out.println(user.getName()));
    }
}
