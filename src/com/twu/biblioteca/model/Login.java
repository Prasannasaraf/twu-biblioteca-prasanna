package com.twu.biblioteca.model;

import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;


//Login has List of Users and Gives authenticated user.
public class Login {
    private final View view;
    private final ArrayList<User> users;

    public Login(View view, ArrayList<User> users) {
        this.view = view;
        this.users = users;
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
}
