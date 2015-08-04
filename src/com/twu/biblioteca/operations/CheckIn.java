package com.twu.biblioteca.operations;


import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;
import com.twu.biblioteca.model.Library;

//Checks In book to Library
public class CheckIn implements Operations {
    private final View view;
    private final Library library;
    private final Messages enterItemName;
    private final Messages successfulItemCheckIn;
    private final Messages unsuccessfulItemCheckIn;

    public CheckIn(View view, Library library, Messages enterItemName, Messages successfulItemCheckIn, Messages unsuccessfulItemCheckIn) {

        this.view = view;
        this.library = library;
        this.enterItemName = enterItemName;
        this.successfulItemCheckIn = successfulItemCheckIn;
        this.unsuccessfulItemCheckIn = unsuccessfulItemCheckIn;
    }

    @Override
    public void execute() {
        view.show(enterItemName);
        if (library.checkInItem(view.getInput())) {
            view.show(successfulItemCheckIn);
        }
        else {
            view.show(unsuccessfulItemCheckIn);
        }
    }
}
