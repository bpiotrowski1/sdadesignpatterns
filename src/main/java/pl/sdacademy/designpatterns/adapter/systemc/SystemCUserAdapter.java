package pl.sdacademy.designpatterns.adapter.systemc;

import pl.sdacademy.designpatterns.adapter.User;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;

import java.util.Collections;
import java.util.List;

public class SystemCUserAdapter implements User {
    private SystemCUser systemCUser;

    public SystemCUserAdapter(final SystemCUser systemCUser) {
        this.systemCUser = systemCUser;
    }

    @Override
    public String getFullname() {
        return systemCUser.getFirstName() + " " + systemCUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemCUser.getLastName();
    }

    @Override
    public Integer getAge() {
        return (int)systemCUser.getBirthDateTimeStamp();
    }

    @Override
    public List<String> getRoles() {
        return Collections.singletonList(systemCUser.getRole());
    }
}
