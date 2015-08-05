package com.twu.biblioteca.controller;


import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;

//Controller of application
public class BibliotecaController {

    private final View view;
    private final Library bookLibrary;
    private final Library moviesLibrary;
    private final ArrayList<User> users;
    private final BibliotecaParser parser;

    public BibliotecaController(View view, Library bookLibrary, Library moviesLibrary, BibliotecaParser parser, ArrayList<User> users) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.moviesLibrary = moviesLibrary;
        this.parser = parser;
        this.users = users;
    }

    public void start() {
        view.show(Messages.welcome);
        while (true) {
            view.show(Messages.loginMenu);
            Operations operation = parser.parse(view.getInput(), view, bookLibrary, moviesLibrary, parser, users);
            operation.execute();
        }
    }
}