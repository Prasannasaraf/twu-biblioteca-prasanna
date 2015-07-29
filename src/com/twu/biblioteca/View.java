package com.twu.biblioteca;

public class View {
    public void welcomeMessage() {
        System.out.println("Welcome to Biblioteca");
    }

    public void displayListOfBooks(Library library) {
        System.out.println("List of Books");
        for (Book book : library.getBooks()) {
            System.out.println(book.getName());
        }
    }
}
