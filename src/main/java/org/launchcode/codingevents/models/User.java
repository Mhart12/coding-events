package org.launchcode.codingevents.models;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
public class User extends AbstractEntity {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    // Getters and Setters

    public String getUsername() {
        return username;
    }

}
