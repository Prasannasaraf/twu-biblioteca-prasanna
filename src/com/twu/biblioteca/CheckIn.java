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
        if (library.checkInBook(view.getInput())) {
            view.displaySuccessfulCheckIn();
        }
        else {
            view.displayUnSuccessfulCheckIn();
        }
    }
}
