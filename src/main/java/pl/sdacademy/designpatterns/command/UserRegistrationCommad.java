package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommad implements ICommandBase {

    private UserRepository userRepository;
    private UserData user;

    public UserRegistrationCommad(final UserRepository userRepository, final UserData user) {
        this.userRepository = userRepository;
        this.user = user;
    }

    @Override
    public void execute() {
        if (userRepository.getUsers().stream().noneMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()))) {
            userRepository.addUser(user);
        }
    }

    @Override
    public void undo() {
        userRepository.removeUser(user);
    }
}
