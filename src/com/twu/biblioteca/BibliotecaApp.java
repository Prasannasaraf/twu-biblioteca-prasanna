package com.twu.biblioteca;


import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        View view = new View();
        Book book1 = new Book("Red Jhon", "Martin", "2004");
        Book book2 = new Book("Success", "Ricky", "1994");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        BibliotecaController bibliotecaController = new BibliotecaController(view, library);
        bibliotecaController.start();
    }
}
