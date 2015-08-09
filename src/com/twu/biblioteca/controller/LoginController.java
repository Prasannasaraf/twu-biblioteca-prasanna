package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;


//Controller for Admin and User actions.
public class LoginController implements Operations {
    private final BibliotecaParser parser;
    private final Login login;

    public LoginController(BibliotecaParser parser, Login login) {
        this.parser = parser;
        this.login = login;
    }

    @Override
    public void execute() {
        User user = login.authenticate();
        Operations operations = parser.parse(user);
        operations.execute();
    }
}