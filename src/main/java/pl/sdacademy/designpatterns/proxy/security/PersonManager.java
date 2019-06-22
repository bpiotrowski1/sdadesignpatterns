package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class PersonManager implements IPersonManager {
    private List<Person> users = new ArrayList<>();

    @Override
    public void addPerson(final Person person) {
        final boolean emailExists = users.stream().anyMatch(p -> p.getEmail().equalsIgnoreCase(person.getEmail()));
        if (!emailExists) {
            users.add(person);
        } else {
            // should be specified exception here
            throw new RuntimeException("User with given email already exists");
        }
    }

    @Override
    public void deletePerson(final String email) {
//        final Optional<Person> personToDelete = users.stream()
//                .filter(p -> p.getEmail().equalsIgnoreCase(email))
//                .findFirst();
//
//        if (personToDelete.isPresent()) {
//            users.remove(personToDelete.get());
//        } else {
//            throw new RuntimeException("User with given email doesn't exists");
//        }
//--- OR
        users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> users.remove(p));

    }

    @Override
    public List<Person> getAllPeople() {
        return users;
    }

    @Override
    public boolean isPersonPresent(final String name) {
        return users.stream().anyMatch(p -> p.getName().equals(name));
    }

    @Override
    public void validateEmail(final String email) {
        users.stream()
                .filter(p -> p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p -> p.setVerified(true));
    }
}
