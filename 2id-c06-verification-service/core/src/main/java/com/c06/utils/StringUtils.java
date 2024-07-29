package com.c06.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUtils {
    public static String convertNullToEmpty(String input) {
        return (input == null) ? "" : input;
    }

    private StringUtils() {

    }
}
