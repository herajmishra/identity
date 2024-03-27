package com.heraj.identity.domain;

import lombok.Data;

@Data
public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
