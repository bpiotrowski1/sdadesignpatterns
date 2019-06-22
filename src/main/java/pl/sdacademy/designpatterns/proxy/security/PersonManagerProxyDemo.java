package pl.sdacademy.designpatterns.proxy.security;

import java.time.LocalDate;

public class PersonManagerProxyDemo {
    public static void main(String[] args) {
        final Person admin = new Person.PersonBuilder().name("Andrzej").email("andrzej@gmail.com").phone("123123123").birthDate(LocalDate.now())
                .role(Role.ADMIN).numOfLogins(2).verified(true).build();
        final Person user = new Person.PersonBuilder().name("Michal").email("michal@gmail.com").phone("321321321").birthDate(LocalDate.now())
                .role(Role.USER).numOfLogins(0).verified(true).build();

        final IPersonManager personManager = new PersonManagerProxy(new PersonManager(), user);
        personManager.addPerson(admin);

        personManager.getAllPeople().forEach(System.out::println);
    }
}
