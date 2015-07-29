package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();
        Library library = new Library();
        BibliotecaController bibliotecaController = new BibliotecaController(view,library);
        bibliotecaController.start();
    }
}
