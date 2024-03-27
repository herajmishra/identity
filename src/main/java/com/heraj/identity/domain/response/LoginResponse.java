package com.heraj.identity.domain.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String email;
    private String token;
}
