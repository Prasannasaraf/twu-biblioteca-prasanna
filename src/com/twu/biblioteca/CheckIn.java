package com.twu.biblioteca;


//Checks In book to Library
public class CheckIn implements Operations {
    private final View view;
    private final Library library;

    public CheckIn(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.show(Messages.enterBookName);
        if (library.checkInItem(view.getInput())) {
            view.show(Messages.successfulBookCheckIn);
        }
        else {
            view.show(Messages.unsuccessfulBookCheckIn);
        }
    }
}
