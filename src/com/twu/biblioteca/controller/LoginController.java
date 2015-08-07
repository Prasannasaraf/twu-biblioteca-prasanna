package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.operations.Operations;

public class LoginController implements Operations {
    private final BibliotecaParser parser;
    private Login login;

    public LoginController(BibliotecaParser parser, Login login) {
        this.parser = parser;
        this.login = login;
    }

    @Override
    public void execute() {
        User user = login.authenticate();
        Operations operations = parser.parse(user, this);
        operations.execute();
    }
}