package pl.sdacademy.designpatterns.adapter.systemb;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@ToString
public class SystemBUser {
    @Getter @Setter private String fullName;
    @Getter @Setter private String displayName;
    @Getter @Setter private String age;
    @Getter @Setter private Set<String> roles;

    public SystemBUser(String fullName, String displayName, String age, Set<String> roles) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.age = age;
        this.roles = roles;
    }
}
