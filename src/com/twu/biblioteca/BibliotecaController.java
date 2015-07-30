package com.twu.biblioteca;


//Controller of application
public class BibliotecaController {

    private final View view;
    private final Library library;

    public BibliotecaController(View view, Library library) {
        this.view  = view;
        this.library = library;
    }

    public void start() {
        view.welcomeMessage();
        String userInput;
        while (true) {
            view.displayMenu();
            userInput = view.getInput();
            switch (userInput) {
                case "0":
                    return;
                case "1":
                    view.displayListOfBooks(library);
                    break;
                case "2":
                    library.removeBook(view.getInput());
                    break;
                default:
                    view.displayInvalidOption();
            }
        }
    }
}
