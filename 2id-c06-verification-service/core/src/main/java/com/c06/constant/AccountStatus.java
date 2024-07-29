package com.c06.constant;

import java.util.HashMap;
import java.util.Map;

public enum AccountStatus implements DomainEnum {
    ACTIVE(0, "ACTIVE"),
    INACTIVE(1, "INACTIVE"),
    SUSPENDED(2, "SUSPENDED"),
    DELETED(3, "DELETED"),
    PENDING(4, "PENDING");

    private final int id;

    private final String name;

    private static final Map<Integer, AccountStatus> UID_TO_ENUM_MAP = new HashMap<>();

    static {
        for (AccountStatus value : values()) {
            UID_TO_ENUM_MAP.put(value.getId(), value);
        }
    }

    AccountStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public static AccountStatus fromId(int id) {
        return UID_TO_ENUM_MAP.get(id);
    }

    public static boolean check(String value) {
        try {
            valueOf(value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
