package pl.sdacademy.designpatterns.adapter.systemc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class SystemCUser {
    @Getter @Setter private String firstName;
    @Getter @Setter private String lastName;
    @Getter @Setter private long birthDateTimeStamp;
    @Getter @Setter private String role;

    public SystemCUser(String firstName, String lastName, long birthDateTimeStamp, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDateTimeStamp = birthDateTimeStamp;
        this.role = role;
    }
}
