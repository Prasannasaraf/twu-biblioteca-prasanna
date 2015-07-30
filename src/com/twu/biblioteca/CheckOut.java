package com.twu.biblioteca;

public class CheckOut implements Operations {
    private final View view;
    private final Library library;

    public CheckOut(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        boolean some = library.checkOutBook(view.getInput());
        if (some) {
            view.displaySuccessfulCheckout();
        }
    }
}
