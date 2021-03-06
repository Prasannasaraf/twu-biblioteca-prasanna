package com.twu.biblioteca.operations;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


//Display single User Information.
public class DisplayUserInformation implements Operations {
    private final View view;
    private final User user;

    public DisplayUserInformation(View view, User user) {
        this.view = view;
        this.user = user;
    }

    @Override
    public void execute() {
        view.show(Messages.userHeader);
        view.showUserInformation(user);
    }
}
