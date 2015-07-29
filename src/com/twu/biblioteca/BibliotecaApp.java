package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        Library library = new Library(book1,book2);
        BibliotecaController bibliotecaController = new BibliotecaController(view,library);
        bibliotecaController.start();
    }
}
