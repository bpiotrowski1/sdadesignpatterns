package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.*;
import pl.sdacademy.designpatterns.adapter.systemb.*;
import pl.sdacademy.designpatterns.adapter.systemc.*;

import java.util.Collections;

public class AdapterDemo {
    public static void main(String[] args) {
        final SystemAUser systemAUser = new SystemAUser("Michal", "Bocian", 22, Collections.singletonList("USER"));
        final SystemBUser systemBUser = new SystemBUser("Andrzej Nowak", "Endrjiu", "33", Collections.singleton("ADMIN"));
        final SystemCUser systemCUser = new SystemCUser("Jakub", "Kowalski", 23, "USER");

        final User userA = new SystemAUserAdapter(systemAUser);
        final User userB = new SystemBUserAdapter(systemBUser);
        final User userC = new SystemCUserAdapter(systemCUser);

        System.out.println(userA.getFullname() + " " + userA.getUsername() + " " + userA.getAge() + " " + userA.getRoles());
        System.out.println(userB.getFullname() + " " + userB.getUsername() + " " + userB.getAge() + " " + userB.getRoles());
        System.out.println(userC.getFullname() + " " + userC.getUsername() + " " + userC.getAge() + " " + userC.getRoles());
    }
}
