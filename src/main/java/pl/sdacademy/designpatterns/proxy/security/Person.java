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
}
