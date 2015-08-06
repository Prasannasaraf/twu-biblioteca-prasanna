package com.twu.biblioteca.controller;


import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

//Controller of application
public class BibliotecaController {

    private final View view;
    private final BibliotecaParser parser;

    public BibliotecaController(View view, BibliotecaParser parser) {
        this.view = view;
        this.parser = parser;
    }

    public void start() {
        view.show(Messages.welcome);
        while (true) {
            view.show(Messages.loginMenu);
            Operations operation = parser.parse(view.getInput());
            operation.execute();
        }
    }
}