package com.twu.biblioteca;

public class Quit implements Operations {
    public Quit() {
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}