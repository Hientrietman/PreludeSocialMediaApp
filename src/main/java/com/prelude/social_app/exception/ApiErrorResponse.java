package com.prelude.social_app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ApiErrorResponse {

    private HttpStatus status;
    private String message;
    private LocalDateTime timestamp;
    private String path;

}
