package com.twu.biblioteca.operations;


//Quits the Application
public class Quit implements Operations {
    public Quit() {
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}