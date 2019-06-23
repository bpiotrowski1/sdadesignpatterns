package pl.sdacademy.designpatterns.command;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    @Getter private List<UserData> users = new ArrayList<>();

    public void addUser(UserData user) {
        users.add(user);
    }

    public void removeUser(UserData user) {
        users.remove(user);
    }
}
