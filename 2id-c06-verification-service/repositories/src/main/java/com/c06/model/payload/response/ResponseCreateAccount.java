package com.c06.model.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseCreateAccount implements Serializable {
    @JsonProperty("username")
    private String userName;
    private String password;
    private String status;
}
