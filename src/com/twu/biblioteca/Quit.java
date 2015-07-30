package com.twu.biblioteca;


//Quits the Application
public class Quit implements Operations {
    public Quit() {
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}