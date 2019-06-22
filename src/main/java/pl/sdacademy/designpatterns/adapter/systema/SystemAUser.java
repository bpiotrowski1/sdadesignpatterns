package pl.sdacademy.designpatterns.adapter.systema;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class SystemAUser {
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private long age;
    @Getter @Setter private List<String> roles;

    public SystemAUser(String firstName, String lastName, long age, List<String> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.roles = roles;
    }
}
