package com.c06.model.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RequestCreateAccount extends BaseRequestDTO {
    private String id;
    @JsonProperty("username")
    private String userName;
    private String password;
    private String status;
}
