package pl.sdacademy.designpatterns.adapter.systemb;

import pl.sdacademy.designpatterns.adapter.User;

import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements User {
    private SystemBUser systemBUser;

    public SystemBUserAdapter(final SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }

    @Override
    public String getFullname() {
        return systemBUser.getFullName();
    }

    @Override
    public String getUsername() {
        return systemBUser.getDisplayName();
    }

    @Override
    public Integer getAge() {
        return Integer.valueOf(systemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
        return new ArrayList<>(systemBUser.getRoles());
    }
}
