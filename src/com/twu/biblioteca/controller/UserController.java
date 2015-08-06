package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


public class UserController implements Operations {

    private final View view;
    private final Library bookLibrary;
    private final Library moviesLibrary;
    private final User user;
    private final BibliotecaParser parser;
    private final Login login;
    private final Messages menu;

    public UserController(View view, Library bookLibrary, Library moviesLibrary, User user, BibliotecaParser parser, Login login, Messages menu) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.moviesLibrary = moviesLibrary;
        this.user = user;
        this.parser = parser;
        this.login = login;
        this.menu = menu;
    }

    @Override
    public void execute() {
        String userInput = "init";
        while (!((userInput.equals("8") && !user.isLibrarian()) || (userInput.equals("11") && user.isLibrarian()))) {
            view.show(menu);
            userInput = view.getInput();
            Operations operations = parser.parse(userInput, user, login);
            operations.execute();
        }
    }
}
