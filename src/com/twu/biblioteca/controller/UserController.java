package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


//Acts as Controller fro User and Admin.
public class UserController implements Operations {

    private final View view;
    private final User user;
    private final BibliotecaParser parser;
    private final Messages menu;

    public UserController(View view, User user, BibliotecaParser parser, Messages menu) {
        this.view = view;
        this.user = user;
        this.parser = parser;
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
