package com.twu.biblioteca.operations;


import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;


//Checks In book to Library
public class CheckIn implements Operations {
    private final View view;
    private final Library library;
    private final Messages enterItemName;
    private final Messages successfulItemCheckIn;
    private final Messages unsuccessfulItemCheckIn;
    private final User user;

    public CheckIn(View view, Library library, Messages enterItemName, Messages successfulItemCheckIn, Messages unsuccessfulItemCheckIn, User user) {
        this.view = view;
        this.library = library;
        this.enterItemName = enterItemName;
        this.successfulItemCheckIn = successfulItemCheckIn;
        this.unsuccessfulItemCheckIn = unsuccessfulItemCheckIn;
        this.user = user;
    }

    @Override
    public void execute() {
        view.show(enterItemName);
        if (library.checkInItem(user.getName(), view.getInput())) {
            view.show(successfulItemCheckIn);
        } else {
            view.show(unsuccessfulItemCheckIn);
        }
    }
}
