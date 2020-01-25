package com.mindera.school.music.ui;

public class MyPrint implements IMyPrint {
    @Override
    public void println() {
        System.out.println();
    }

    @Override
    public void println(String string) {
        System.out.println(string);
    }

    @Override
    public void print(String string) {
        System.out.print(string);
    }
}
