package com.workintech.s18d2.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Setter
@AllArgsConstructor
@Getter
public class PlantException extends RuntimeException{

    private HttpStatus httpStatus;


    public PlantException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
