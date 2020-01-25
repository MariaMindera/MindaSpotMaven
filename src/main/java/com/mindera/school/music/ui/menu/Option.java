package com.mindera.school.music.ui.menu;

public class Option {
    private String text;
    private Action action;

    public Option(String text, Action action) {
        this.text = text;
        this.action = action;
    }

    String getText() {
        return text;
    }

    void execute() {
        action.execute();
    }
}