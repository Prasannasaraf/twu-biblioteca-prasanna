package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


//Acts as Controller fro User and Admin.
public class UserController implements Operations {

    private final View view;
    private final Library bookLibrary;
    private final Library moviesLibrary;
    private final User user;
    private final BibliotecaParser parser;
    private final LoginController loginController;
    private final Messages menu;

    public UserController(View view, Library bookLibrary, Library moviesLibrary, User user, BibliotecaParser parser, LoginController loginController, Messages menu) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.moviesLibrary = moviesLibrary;
        this.user = user;
        this.parser = parser;
        this.loginController = loginController;
        this.menu = menu;
    }

    @Override
    public void execute() {
        String userInput = "init";
        while (!((userInput.equals("8") && !user.isLibrarian()) || (userInput.equals("11") && user.isLibrarian()))) {
            view.show(menu);
            userInput = view.getInput();
            Operations operations = parser.parse(userInput, user);
            operations.execute();
        }
    }
}
