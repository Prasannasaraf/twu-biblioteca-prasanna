package com.twu.biblioteca;


//ChecksOut Book From Library
public class CheckOut implements Operations {
    private final View view;
    private final Library library;

    public CheckOut(View view, Library library) {

        this.view = view;
        this.library = library;
    }

    @Override
    public void execute() {
        view.displayEnterTheBookName();
        if (library.checkOutBook(view.getInput())) {
            view.displaySuccessfulCheckout();
        } else {
            view.displayUnSuccessfulCheckout();
        }
    }
}
