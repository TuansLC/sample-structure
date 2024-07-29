package com.c06.model.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseLGetListAccount implements Serializable {
    private String id;
    @JsonProperty("username")
    private String userName;
    private String password;
    private String status;
}
