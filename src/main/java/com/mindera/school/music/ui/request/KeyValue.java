package com.mindera.school.music.ui.request;

public class KeyValue {
    private String name;
    private Object value;

    public KeyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
