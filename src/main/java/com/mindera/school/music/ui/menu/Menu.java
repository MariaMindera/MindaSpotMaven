package com.mindera.school.music.ui;

import java.util.*;

public class Menu {
    private IMyScanner myScanner;
    private IMyPrint myPrint;
    private List<Option> options = new LinkedList<>();
    private Option exitOption;

    public Menu(IMyScanner myScanner, IMyPrint myPrint) {
        this.myScanner = myScanner;
        this.myPrint = myPrint;
    }

    public void add(Option option) {
        options.add(option);
    }

    public void add(Option option, boolean exit) {
        if (exit) {
            exitOption = option;
            options.add(exitOption);
        } else {
            options.add(option);
        }
    }

    public void render() {
        int index;
        do {
            for (int i = 0; i < options.size(); i++) {
                myPrint.println(printOption(i));
            }

            index = myScanner.nextInt() - 1;

            options.get(index).execute();
        } while (options.get(index) != exitOption);
    }

    String printOption(int index) {
        return (index + 1) + " - " + options.get(index).getText();
    }

    List<Option> getOptions() {
        return new ArrayList<>(options);
    }

    Option getExitOption() {
        return exitOption;
    }
}