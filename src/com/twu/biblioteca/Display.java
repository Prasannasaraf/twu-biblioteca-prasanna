package com.twu.biblioteca;


//Displays List of Books
public class Display implements Operations {
    private final View view;
    private final Library library;

    public Display(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.displayListOfItems(library);
    }
}
