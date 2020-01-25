package com.mindera.school.music.ui.request.requestPropertys;

import com.mindera.school.music.ui.request.KeyValue;
import com.mindera.school.music.ui.request.RequestProperty;
import com.mindera.school.music.ui.StringCode;

import java.util.Scanner;

public class RequestPropertyInteger implements RequestProperty {
    private final Scanner SCANNER = new Scanner(System.in);
    private String name;
    private String question;

    public RequestPropertyInteger(String name, String question) {
        this.name = StringCode.capitalizeEachWord(name);
        this.question = question;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public KeyValue ask() {
        System.out.print(question);
        return new KeyValue(name, SCANNER.nextInt());
    }
}
