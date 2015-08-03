package com.twu.biblioteca;


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
