package com.twu.biblioteca;

public class DisplayBooks implements Operations {
    private final View view;
    private final Library library;

    public DisplayBooks(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.displayListOfBooks(library);
    }
}
