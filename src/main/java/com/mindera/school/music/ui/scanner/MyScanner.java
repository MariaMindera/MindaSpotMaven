package com.mindera.school.music.ui;

import java.util.Scanner;

public class MyScanner implements IMyScanner {
    private Scanner sc = new Scanner(System.in);

    @Override
    public int nextInt() {
        return sc.nextInt();
    }

    @Override
    public String next() {
        return sc.next();
    }

    @Override
    public String nextLine() {
        return sc.nextLine();
    }
}
