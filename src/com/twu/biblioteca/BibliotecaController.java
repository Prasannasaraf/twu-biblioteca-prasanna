package com.twu.biblioteca;


//Controller of application
public class BibliotecaController {

    private final View view;
    private final Library bookLibrary;
    private final Library moviesLibrary;

    public BibliotecaController(View view, Library bookLibrary, Library moviesLibrary) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.moviesLibrary = moviesLibrary;
    }

    public void start() {
        view.show(Messages.welcome);
        String userInput;
        while (true) {
            view.show(Messages.menu);
            userInput = view.getInput();
            BibliotecaParser parser = new BibliotecaParser();
            Operations operation = parser.parse(userInput, view, bookLibrary, moviesLibrary);
            operation.execute();
        }
    }
}