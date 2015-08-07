package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

import java.util.ArrayList;


//Display List of Users.
public class DisplayListOfUsers implements Operations {
    private final View view;
    private final ArrayList<User> users;
    private final Messages listOfUsers;
    private final Messages userHeader;

    public DisplayListOfUsers(View view, ArrayList<User> users, Messages listOfUsers, Messages userHeader) {
        this.view = view;
        this.users = users;
        this.listOfUsers = listOfUsers;
        this.userHeader = userHeader;
    }

    @Override
    public void execute() {
        view.displayListOfUsers(users, listOfUsers, userHeader);
    }
}
