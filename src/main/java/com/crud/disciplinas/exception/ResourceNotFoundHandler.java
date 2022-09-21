package com.crud.disciplinas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundHandler extends Exception{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundHandler(String message){
        super(message);
    }
}