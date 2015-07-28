package com.twu.biblioteca;


public class BibliotecaController {

    private final View view;
    private final BookList bookList;

    public BibliotecaController(View view, BookList bookList) {
        this.view  = view;
        this.bookList = bookList;
    }

    public void start() {
        view.welcomeMessage();
        view.displayListOfBooks(bookList);
    }
}
