package com.twu.biblioteca.model;

import com.twu.biblioteca.controller.BibliotecaParser;
import com.twu.biblioteca.operations.Operations;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;

public class LoginController implements Operations {
    private final ArrayList<User> users;
    private final View view;
    private final BibliotecaParser parser;

    public LoginController(ArrayList<User> users, View view, BibliotecaParser parser) {
        this.users = users;
        this.view = view;
        this.parser = parser;
    }

    public User authenticate() {
        view.show(Messages.enterUserName);
        String libraryNo = view.getInput();
        view.show(Messages.enterPassword);
        String password = view.getInput();
        for (User user : users) {
            if (user.match(libraryNo, password))
                return user;
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    @Override
    public void execute() {
        User user = authenticate();
        Operations operations = parser.parse(user, this);
        operations.execute();
    }
}