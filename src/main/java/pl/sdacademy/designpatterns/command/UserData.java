package pl.sdacademy.designpatterns.command;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserData {
    private String email;
    private String name;
    private String surname;
    private String password;
}
