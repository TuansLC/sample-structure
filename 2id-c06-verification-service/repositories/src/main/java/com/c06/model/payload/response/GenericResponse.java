package com.c06.model.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class GenericResponse<T> {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")
    private T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String code;

    public GenericResponse(final String message) {
        this.message = message;
    }

    public GenericResponse(final String message, final T data) {
        this.message = message;
        this.data = data;
    }

    public GenericResponse(String message, List<ObjectError> allErrors) {
        this.message = message;
        String temp = allErrors.stream().map(e -> {
            if (e instanceof FieldError) {
                return "{\"field\":\"" + ((FieldError) e).getField() + "\",\"defaultMessage\":\"" + e.getDefaultMessage() + "\"}";
            } else {
                return "{\"object\":\"" + e.getObjectName() + "\",\"defaultMessage\":\"" + e.getDefaultMessage() + "\"}";
            }
        }).collect(Collectors.joining(","));
        this.error = "[" + temp + "]";
    }

    public GenericResponse(final String code, final String message, final T data) {
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public GenericResponse(final String code, final String message) {
        this.message = message;
        this.code = code;
    }
}
