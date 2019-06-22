package pl.sdacademy.designpatterns.proxy.security;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER(AccessType.READ),
    ADMIN(AccessType.READ, AccessType.WRITE);

    @Getter private List<AccessType> accessTypes;

    Role(final AccessType... accessTypes) {
        this.accessTypes = Arrays.asList(accessTypes);
    }
}
