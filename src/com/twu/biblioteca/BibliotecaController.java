package com.twu.biblioteca;


//Controller of application
public class BibliotecaController {

    private final View view;
    private final Library library;

    public BibliotecaController(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void start() {
        view.welcomeMessage();
        String userInput;
        while (true) {
            view.displayMenu();
            userInput = view.getInput();
            BibliotecaParser parser = new BibliotecaParser();
            Operations operation = parser.parse(userInput,view,library);
            operation.execute();
        }
    }
}