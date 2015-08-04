package com.twu.biblioteca.operations;


import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

//Shows InvalidOption
public class InvalidOption implements Operations {
    private final View view;

    public InvalidOption(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.show(Messages.invalidOption);
    }
}
