package com.c06.model.payload.request;

public interface RequestBase {
    default String getMessageId() {
        return null;
    }

    default String getMessageData() {
        return null;
    }

    default String getRelationNumber() {
        return null;
    }

    default String getCarNumber() {
        return null;
    }

    default String getNote() {
        return null;
    }

    default String getShipmentCode() {
        return null;
    }

}
