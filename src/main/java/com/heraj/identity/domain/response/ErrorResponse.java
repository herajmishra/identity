package com.heraj.identity.domain.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    private HttpStatus httpStatus;
    private String message;
}
