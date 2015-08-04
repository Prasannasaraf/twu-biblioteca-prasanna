package com.twu.biblioteca;


//ChecksOut Book From Library
public class CheckOut implements Operations {
    private final View view;
    private final Library library;
    private final Messages enterItemName;
    private final Messages successfulItemCheckout;
    private final Messages unsuccessfulItemCheckOut;

    public CheckOut(View view, Library library, Messages enterItemName, Messages successfulItemCheckout, Messages unsuccessfulItemCheckOut) {
        this.view = view;
        this.library = library;
        this.enterItemName = enterItemName;
        this.successfulItemCheckout = successfulItemCheckout;
        this.unsuccessfulItemCheckOut = unsuccessfulItemCheckOut;
    }

    @Override
    public void execute() {
        view.show(enterItemName);
        if (library.checkOutItem(view.getInput())) {
            view.show(successfulItemCheckout);
        } else {
            view.show(unsuccessfulItemCheckOut);
        }
    }
}
