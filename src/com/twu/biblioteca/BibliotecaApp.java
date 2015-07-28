package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();
        BookList bookList = new BookList();
        BibliotecaController bibliotecaController = new BibliotecaController(view,bookList);
        bibliotecaController.start();
    }
}
