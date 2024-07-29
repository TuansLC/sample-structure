package com.c06.model.payload.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public abstract class BaseRequestDTO {
    @JsonIgnore
    private UUID uuid = null;

    public String getUUID() {
        return uuid.toString();
    }

    public BaseRequestDTO() {
        this.uuid = UUID.randomUUID();
    }
}
