package com.twu.biblioteca.operations;

import com.twu.biblioteca.presentation.Messages;
import com.twu.biblioteca.presentation.View;

public class IncorrectLogin implements Operations {
    private final View view;

    public IncorrectLogin(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.show(Messages.errLogin);
    }
}
