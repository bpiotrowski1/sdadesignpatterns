package pl.sdacademy.designpatterns.proxy.security;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class Person {
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Role role;
    private int numOfLogins;
    private boolean verified;

    public Person(final String name, final String email, final String phone, final LocalDate birthDate, final Role role, final int numOfLogins, final boolean verified) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.role = role;
        this.numOfLogins = numOfLogins;
        this.verified = verified;
    }
}
